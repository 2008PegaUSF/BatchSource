/*
    What is Node.js?
        Node.js is an open server environment
        JS on a server
        Node it free and run on various platforms

    What is NPM? 
        Node Package Manager
        NPM is a platform and command line interface

    What is TypeScript?
        Typescript is a superset of Javascript (developed by Microsoft). 

        Typescript was developed for larger apps. The syntax is closer to
        Java and C#.

        TS is strongly typed, easier to debug. Also addess access modifiers and encapsulation. 
        You even get syntax errors 


        We can install typescript from NPM using:
            npm install -g typescript

        We can transpile TS into JS using:

        tsc *filename*.ts
        tsc *filename*.ts -w <-- watch mode
        tsc -t es2015 *filename*.ts <-- compile a certain javascript version
        tsc -t es6 *filename*.ts -w

        Why transpile rather than compile?
        Transpiling is where a language is converted to another similar level of abstraction language
*/

console.log("We're in typescript!")


/*
    What are the datatypes in Javascript?
    number, boolean, string, object, array, function, null, undefined, symbol,
    void, enum, any, tuples.
*/
let s;
let s1 = "hello"; //implicitly declared as type string
// s1 = 5;
console.log(s1);


//In TS we can declare types 

let s2; //implicitly any type 
let s3: number; //s3 is of type number
let s4: number| boolean| string; //you can restrict to multiple types.\

// s3 = 'hello';
s4 = true;
s4 = 'hello';
s4 = 0;

let v1: null = null;
let v2: void = null;
let v3: null = undefined;
let v4: undefined = null;


//Arrays 
let array1: string[];
array1 = ['one', 'two', 'three'];

let array2: Array<number>;
array2 = [2,3,4];


//Tuples (fixed size and datatypes are ordered in array)
let tuple : [string, boolean, number];
tuple = ['hola', true, 4];


//Enum
// An enumeration is a collection of constants, Representational values

//The way we would create in JS

const OFF = 0;
const IDLE = 1;
const ACCEL = 2;

//bunch of logic
let myCar = ACCEL;

if(myCar == OFF){
    //execute OFF STATE logic
}
if(myCar == IDLE){
    //execute idle logic 
}

//Creating enums inside of TS

enum carStates {OFF =0, IDLE = 1, STOPLIGHT = 4, ACCEL = 2, DRIVING = 3};

if(myCar == carStates.ACCEL){
    // car accelerating logic
}

if(myCar){
    console.log("Do truthy values still exist in Typescript?")
}



//FUNCTIONS

function myFunc(a,b,c){
    //basically JS
}

function myOtherFunc(a: number, b: string, c: boolean){
    //a bit more ts
}

function finalFunc() : string{
    return 'hello';
}



interface Moon{
    name: string;
}

interface Planet{
    name: string;
    hasRings: boolean;
    moons: Array<Moon>;
    orbit(): void;
}

let nix: Moon = {'name':'Pluto'};

let pluto: Planet = {'name': 'Pluto', 'hasRings': false, 'moons': [nix],
                'orbit': () => console.log("I'm orbiting")};

pluto.orbit();


class Star implements Moon {
    

    /**
     *Acessmodifiers in typescript:
        private, public, protected. There is no equivalent to "default".
        public acts as the implicit modifier, if you don't use a keyword. 
     */
    public name: string; //accessible anywhere
    nickname: string;
    private planets: number; //accessible only inside your function
    protected size: number; //accessible internally or any class that exxtends it.

    constructor(name: string, nickname: string, size: number, planets: number){
        this.name = name;
        this.nickname = nickname;
        this.size = size;
        this.planets = planets;
    }
    
    fusion(): void {
        console.log(`${this.name} getting brighter!`)
    }

}

let Sun: Star = new Star("The Sun", "Bright Thingy", 1, 8);

Sun.fusion();

class NeutronStar extends Star{

    public hasExploded: boolean;

    constructor(name: string, nickname: string, size: number, planets: number){
        super(name,nickname,size,planets);
        this.hasExploded = false;
    }

    fusion(): void {
        super.fusion();
        this.hasExploded = true;
        console.log("go boom");
    }

    spinabout(): void {
        console.log("spinning a lot");
    }
}
let pulsar: NeutronStar = new NeutronStar("pulsar","small and bright", 0.01,3)
// let pulsar: Star = new NeutronStar("pulsar","small and bright", 0.01,3) will work, but won't ahve to access to child class methods and variables 
// let pulsar: NeutronStar = new Star("pulsar","small and bright", 0.01,3); Will cause an issue

pulsar.fusion();
pulsar.spinabout();

//TANGENT WARNING
// class Human{

//     height: number;

//     constructor(){
//         this.height = 1
//     }
//         move(){
//             console.log("walking about!")
//         }
// }


// class SuperHero extends Human {

//     constructor(){
//         super();
//         this.height = 1000;
//     }

//     move(){
//         console.log("flying about");
//     }
//     height:number;
   
// }

// let clark: Human = new SuperHero();

// let john: SuperHero = new Human();

interface A{}
interface B{}


class Animal implements A,B{
  
    //When you add access modifiers in the parameter, it will automcatily assign it as a property 
    //questions marks in the constructor makes the parameter optional 
    // each parameter to the right of the question mark muyst also be optional
    constructor(private age?: number, private name?: string,  private breed?: string){
   

    }

    get Name(): string{
        return this.name;
    }

    get Age(): number{
        return this.age;
    }

    get Breed(): string {
        console.log("double check to make sure")
        return this.breed;
    }

    set Breed(breed: string) {
        this.breed = breed;
    }

}

let dog: Animal = new Animal(null,null, null);
dog.Breed = "golden";
console.log(dog.Breed);