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
console.log("We're in typescript!");
/*
    What are the datatypes in Javascript?
    number, boolean, string, object, array, function, null, undefined, symbol,
    void, enum, any, tuples.
*/
let s1 = "hello"; //implicitly declared as type string
// s1 = 5;
console.log(s1);
//In TS we can declare types 
let s2; //implicitly any type 
let s3; //s3 is of type number
let s4; //you can restrict to multiple types.\
// s3 = 'hello';
s4 = true;
s4 = 'hello';
s4 = 0;
let v1 = null;
let v2 = null;
let v3 = undefined;
let v4 = null;
//Arrays 
let array1;
array1 = ['one', 'two', 'three'];
let array2;
array2 = [2, 3, 4];
//Tuples (fixed size and datatypes are ordered in array)
let tuple;
tuple = ['hola', true, 4];
//Enum
// An enumeration is a collection of constants, Representational values
//The way we would create in JS
const OFF = 0;
const IDLE = 1;
const ACCEL = 2;
//bunch of logic
let myCar = ACCEL;
if (myCar == OFF) {
    //execute OFF STATE logic
}
if (myCar == IDLE) {
    //execute idle logic 
}
//Creating enums inside of TS
var carStates;
(function (carStates) {
    carStates[carStates["OFF"] = 0] = "OFF";
    carStates[carStates["IDLE"] = 1] = "IDLE";
    carStates[carStates["STOPLIGHT"] = 4] = "STOPLIGHT";
    carStates[carStates["ACCEL"] = 2] = "ACCEL";
    carStates[carStates["DRIVING"] = 3] = "DRIVING";
})(carStates || (carStates = {}));
;
if (myCar == carStates.ACCEL) {
    // car accelerating logic
}
if (myCar) {
    console.log("Do truthy values still exist in Typescript?");
}
//FUNCTIONS
function myFunc(a, b, c) {
    //basically JS
}
function myOtherFunc(a, b, c) {
    //a bit more ts
}
function finalFunc() {
    return 'hello';
}
let nix = { 'name': 'Pluto' };
let pluto = { 'name': 'Pluto', 'hasRings': false, 'moons': [nix],
    'orbit': () => console.log("I'm orbiting") };
pluto.orbit();
class Star {
    constructor(name, nickname, size, planets) {
        this.name = name;
        this.nickname = nickname;
        this.size = size;
        this.planets = planets;
    }
    fusion() {
        console.log(`${this.name} getting brighter!`);
    }
}
let Sun = new Star("The Sun", "Bright Thingy", 1, 8);
Sun.fusion();
class NeutronStar extends Star {
    constructor(name, nickname, size, planets) {
        super(name, nickname, size, planets);
        this.hasExploded = false;
    }
    fusion() {
        super.fusion();
        this.hasExploded = true;
        console.log("go boom");
    }
    spinabout() {
        console.log("spinning a lot");
    }
}
let pulsar = new NeutronStar("pulsar", "small and bright", 0.01, 3);
// let pulsar: Star = new NeutronStar("pulsar","small and bright", 0.01,3) will work, but won't ahve to access to child class methods and variables 
// let pulsar: NeutronStar = new Star("pulsar","small and bright", 0.01,3); Will cause an issue
pulsar.fusion();
pulsar.spinabout();
class Animal {
    //When you add access modifiers in the parameter, it will automcatily assign it as a property 
    //questions marks in the constructor makes the parameter optional 
    // each parameter to the right of the question mark muyst also be optional
    constructor(age, name, breed) {
        this.age = age;
        this.name = name;
        this.breed = breed;
    }
    get Name() {
        return this.name;
    }
    get Age() {
        return this.age;
    }
    get Breed() {
        console.log("double check to make sure");
        return this.breed;
    }
}
let dog = new Animal(null, null, null);
console.log(dog.Breed);
