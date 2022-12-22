var Abbigliamento = /** @class */ (function () {
    function Abbigliamento(id, codprod, collezione, capo, modello, quantità, colore, prezzoivainclusa, prezzoivaesclusa, disponibile, saldo) {
        this.id = id;
        this.codprod = codprod;
        this.collezione = collezione;
        this.capo = capo;
        this.modello = modello;
        this.quantità = quantità;
        this.colore = colore;
        this.prezzoivainclusa = prezzoivainclusa;
        this.prezzoivaesclusa = prezzoivaesclusa;
        this.disponibile = disponibile;
        this.saldo = saldo;
    }
    Abbigliamento.prototype.getsaldocapo = function () {
        return this.prezzoivainclusa - (this.prezzoivainclusa / 100) * this.saldo;
    };
    Abbigliamento.prototype.getacquistocapo = function () {
        return this.getsaldocapo() * this.quantità;
    };
    return Abbigliamento;
}());
var clothes;
fetch("https://mocki.io/v1/765b2daf-41d5-4e94-a0d5-abd918f57b8f")
    .then(function (response) {
    return response.json();
})
    .then(function (json) {
    clothes = json;
    console.log("Dati:", clothes);
    for (var i = 0; i < clothes.length; i++) {
        var clothing = clothes[i];
        clothing = new Abbigliamento(clothes[i].id, clothes[i].codprod, clothes[i].codprod, clothes[i].capo, clothes[i].modello, clothes[i].quantita, clothes[i].colore, clothes[i].prezzoivainclusa, clothes[i].prezzoivaesclusa, clothes[i].disponibile, clothes[i].saldo);
        console.log("Il saldo del prodotto è: " + Math.round(clothing.getsaldocapo() * 10) / 10);
        console.log("Il prezzo intero del prodotto è: " + Math.round(clothing.getacquistocapo() * 10) / 10);
        var p1 = document.getElementById('saldo').innerHTML = "Questo modello ha il codice prodotto: " + clothes[i].codprod;
        var p2 = document.getElementById('intero').innerHTML = "Disponibilità: " + clothes[i].disponibile;
        var p3 = document.getElementById('saldo1').innerHTML = "Questo modello ha il codice prodotto: " + clothes[i].codprod;
        var p4 = document.getElementById('intero1').innerHTML = "Disponibilità: " + clothes[i].disponibile;
        var p5 = document.getElementById('saldo2').innerHTML = "Questo modello ha il codice prodotto: " + clothes[i].codprod;
        var p6 = document.getElementById('intero2').innerHTML = "Disponibilità: " + clothes[i].disponibile;
        var p7 = document.getElementById('saldo3').innerHTML = "Questo modello ha il codice prodotto: " + clothes[i].codprod;
        var p8 = document.getElementById('intero3').innerHTML = "Disponibilità: " + clothes[i].disponibile;
        var p9 = document.getElementById('saldo4').innerHTML = "Questo modello ha il codice prodotto: " + clothes[i].codprod;
        var p10 = document.getElementById('intero4').innerHTML = "Disponibilità: " + clothes[i].disponibile;
    }
});
