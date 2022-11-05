// Funzioni

function pressButton(dati){
   document.getElementById("display").value += dati.textContent
}

function clearDisplay() {
   document.getElementById("display").value = ""
}

function equal() {
   display.value = eval(display.value)
}