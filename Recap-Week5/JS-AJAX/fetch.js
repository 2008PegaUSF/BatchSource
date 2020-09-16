

window.onload = function(){

    document.getElementById("swSubmit")
    .addEventListener('click', getSW);

}

function getSW(){
    console.log("button clicked");

    let swID = document.getElementById('swID').value;

    fetch("https://swapi.dev/api/people/" + swID)
        .then(

            function(daResponse){
                console.log(daResponse);
                return daResponse.json();

            }
        ).then(
            function(daResponse){
                    

                console.log(daResponse);

                DOMManipulation(daResponse);
                
            }
        )
}


function DOMManipulation(ourJSON){
    document.getElementById('swName').innerText = ourJSON.name;
        document.getElementById('swBirthYear').innerText= ourJSON['birth_year'];
}



/*

var vs let? 

let is defined by its own scope 

var will escape its scope 

const is like let, except you can't change the value. 

var is globaly defined. 


What is a callback function? 


*/


let tempNumb = 42;

let oldWay = " My favourite number is " + tempNumb + "\n , also the answer to the universe!"

//new way 
let newWay = ` My favourite number is 
                    ${tempNumb} 
                        , also the answer to the universe!`; 

console.log(oldWay);
console.log(newWay);


let div0 = function(x,y){
    return x/y;
}

//fat arrow notation 
let div = (x,y) => {return x/y};


let array1 = [0,1,2,"3"];

let array2 = ["bunch", "of", "strings"];

let spread = [...array1,...array2];

console.log(spread);




//constructor 

function Robot(name, ability, weight){
    this.name = name;
    this.ability = ability;
    this.weight = weight; 
}

var r1 = new Robot("bob", "sleeping", 1);


// What is a callback function? Function that is passed in as an argument 

function doStuff(stuff, callBackFunc, moreCallBack){
    alert(`Look at me, I'm ${stuff}`);

    callBackFunc(stuff);

    moreCallBack(stuff);

    

}

let startStuff = (stuff) => {alert("doing more stuff")}

let finishStuff = function(stuff){
    alert(`Finished doing ${stuff}`);
}

doStuff("running",finishStuff, startStuff );
