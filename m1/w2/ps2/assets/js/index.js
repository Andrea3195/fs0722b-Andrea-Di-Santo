// Funzioni

function pressButton(dato){ 
    document.getElementById("display").value += dato.textContent;
 }

 function clearDisplay() { 
    document.getElementById("display").value = ""; 
   }
 
 function equals() { 
    document.getElementById("display").value = eval(document.getElementById("display").value); 
 }
 