// Funzioni

function pressButton(dati){
   document.getElementById("display").value += dati.textContent
 }

function clearDisplay() {
   document.getElementById("display").value = ""
   }

function equal() {
   document.getElementById("display").value = eval(document.getElementById("display").value)
 }