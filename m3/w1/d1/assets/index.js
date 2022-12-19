var giocatore1 = 27;
var giocatore2 = 64;
function paragone(numero1, numero2) {
    var numero = Math.floor(Math.random() * (100 - 1) + 1);
    var dif1 = Math.abs(numero - numero1);
    var dif2 = Math.abs(numero - numero2);
    console.log("Numero estratto:", numero);
    if (numero === numero1) {
        console.log("Il giocatore 1 ha indovinato!");
    }
    else if (numero === numero2) {
        console.log("Il giocatore 2 ha indovinato!");
    }
    else if (dif1 < dif2) {
        console.log("Nessuno dei due ha indovinato, ma il giocatore 1 ci è andato più vicino!");
    }
    else {
        console.log("Nessuno dei due ha indovinato, ma il giocatore 2 ci è andato più vicino!");
    }
}
paragone(giocatore1, giocatore2);
