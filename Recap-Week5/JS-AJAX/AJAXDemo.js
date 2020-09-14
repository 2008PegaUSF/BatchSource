



/*
How do we do it? 

0) Set up listener and function linked 
1) An event occurs in a web page
2) An XMLHttpRequest object is created
3) XMLHttpRequest object sends a request to a web server
4) Server does stuff (process the request)
5) Server sends a response 
6) Response is ready by JavaScript
7) We do stuff with it
*/

window.onload = function(){
    //Step 1 - prepare the event,
    document.getElementById("swSubmit").addEventListener("mouseenter", getSW);
}



function getSW(){
    //Just supposed to be 
    //Hoisting ?? Brings a variable to go to the top of its scope 

    let swId = document.getElementById("swID").value;

    console.log(swId);

    //Step 2 - Create the XMLHttpRequeest object
    //allows us to make requests and get back data. 
    // (data retriever objects)

    let xhttp = new XMLHttpRequest();

    

    xhttp.onreadystatechange = function(){

        console.log(xhttp.readyState);
        /*
        readystate property holds the status of the XMLHttpRequest
        0 - request not initialized
        1 - server connection established
        2 - request received
        3 - processing request
        4 - request is finshed and response is ready
        */

        if(xhttp.readyState == 4 && xhttp.status == 200){
            console.log("xhttp is done!!!");

            //STEP 6
            let swPerson = JSON.parse(xhttp.responseText);

            console.log(swPerson);

            //STEP 7
            DOMManipulation(swPerson);
        }

        if(xhttp.readyState == 4 && xhttp.status == 404){
            console.log("didn't happen mate!")

            const ourObject = {"name":"Doens't exist", "birth_year":"0"};

            DOMManipulation(ourObject);
        }
    }


    //STEP 3
    xhttp.open("GET", "https://swapi.dev/api/people/" + swId) //endpoint stuff)

    xhttp.send();
}


function DOMManipulation(ourJSON){
    document.getElementById("swName").innerText = ourJSON.name;
    document.getElementById("swBirthYear").innerText= ourJSON.birth_year;
}

