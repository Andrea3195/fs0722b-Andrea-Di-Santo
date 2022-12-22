class Abbigliamento {
  id: number;
  codprod: number;
  collezione: string;
  capo: string;
  modello: number;
  quantità: number;
  colore: string;
  prezzoivainclusa: number;
  prezzoivaesclusa: number;
  disponibile: string;
  saldo: number;
  constructor(
    id: number,
    codprod: number,
    collezione: string,
    capo: string,
    modello: number,
    quantità: number,
    colore: string,
    prezzoivainclusa: number,
    prezzoivaesclusa: number,
    disponibile,
    saldo: number
  ) {
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
  getsaldocapo(): number {
    return this.prezzoivainclusa - (this.prezzoivainclusa / 100) * this.saldo;
  }
  getacquistocapo(): number {
    return this.getsaldocapo() * this.quantità;
  }
}

let clothes;

fetch("https://mocki.io/v1/765b2daf-41d5-4e94-a0d5-abd918f57b8f")
  .then(function (response) {
    return response.json();
  })
  .then(function (json) {
    clothes = json;
    console.log("Dati:", clothes);

    for (let i = 0; i < clothes.length; i++) {
      let clothing = clothes[i];

      clothing = new Abbigliamento(
        clothes[i].id,
        clothes[i].codprod,
        clothes[i].codprod,
        clothes[i].capo,
        clothes[i].modello,
        clothes[i].quantita,
        clothes[i].colore,
        clothes[i].prezzoivainclusa,
        clothes[i].prezzoivaesclusa,
        clothes[i].disponibile,
        clothes[i].saldo
      );
      
      console.log("Il saldo del prodotto è: " + Math.round(clothing.getsaldocapo() * 10) / 10);
      console.log("Il prezzo intero del prodotto è: " + Math.round(clothing.getacquistocapo() * 10) / 10);
    
  let p1 =(<HTMLElement>document.getElementById('saldo')).innerHTML = "Questo modello ha il codice prodotto: " + clothes[i].codprod
  let p2 =(<HTMLElement>document.getElementById('intero')).innerHTML = "Disponibilità: " + clothes[i].disponibile

  let p3 =(<HTMLElement>document.getElementById('saldo1')).innerHTML = "Questo modello ha il codice prodotto: " + clothes[i].codprod
  let p4 =(<HTMLElement>document.getElementById('intero1')).innerHTML = "Disponibilità: " + clothes[i].disponibile

  let p5 =(<HTMLElement>document.getElementById('saldo2')).innerHTML = "Questo modello ha il codice prodotto: " + clothes[i].codprod
  let p6 =(<HTMLElement>document.getElementById('intero2')).innerHTML = "Disponibilità: " + clothes[i].disponibile

  let p7 =(<HTMLElement>document.getElementById('saldo3')).innerHTML = "Questo modello ha il codice prodotto: " + clothes[i].codprod
  let p8 =(<HTMLElement>document.getElementById('intero3')).innerHTML = "Disponibilità: " + clothes[i].disponibile

  let p9 =(<HTMLElement>document.getElementById('saldo4')).innerHTML = "Questo modello ha il codice prodotto: " + clothes[i].codprod
  let p10 =(<HTMLElement>document.getElementById('intero4')).innerHTML = "Disponibilità: " + clothes[i].disponibile

}});