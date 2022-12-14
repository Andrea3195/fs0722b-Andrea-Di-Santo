abstract class Tasse {
  tasseinps: number;
  tasseirpef: number;
  constructor(tasseinps: number, tasseirpef: number) {
    this.tasseinps = tasseinps;
    this.tasseirpef = tasseirpef;
  }
}

class commerciante extends Tasse {
  codred: number;
  redditoannuolordo: number;
  constructor(
    codred: number,
    redditoannuolordo: number,
    tasseinps: number,
    tasseirpef: number
  ) {
    super(tasseinps, tasseirpef);
    this.codred = codred;
    this.redditoannuolordo = redditoannuolordo;
  }
  getUtileTasse() {
    return this.redditoannuolordo * this.codred;
  }
  getTasseInps() {
    return this.redditoannuolordo * this.tasseinps;
  }
  getTasseIrpef() {
    return this.redditoannuolordo * this.tasseirpef;
  }
  getredditoannuonetto() {
    return (
      this.redditoannuolordo * this.tasseinps * this.tasseirpef * this.codred
    );
  }
}
class liberoProfessionista extends Tasse {
  codred: number;
  redditoannuolordo: number;
  constructor(
    codred: number,
    redditoannuolordo: number,
    tasseinps: number,
    tasseirpef: number
  ) {
    super(tasseinps, tasseirpef);
    this.codred = codred;
    this.redditoannuolordo = redditoannuolordo;
  }
  getUtileTasse() {
    return this.redditoannuolordo * this.codred;
  }
  getTasseInps() {
    return this.redditoannuolordo * this.tasseinps;
  }
  getTasseIrpef() {
    return this.redditoannuolordo * this.tasseirpef;
  }
  getredditoannuonetto() {
    return (
      this.redditoannuolordo * this.tasseinps * this.tasseirpef * this.codred
    );
  }
}

class artigiano extends Tasse {
  codred: number;
  redditoannuolordo: number;
  constructor(
    codred: number,
    redditoannuolordo: number,
    tasseinps: number,
    tasseirpef: number
  ) {
    super(tasseinps, tasseirpef);
    this.codred = codred;
    this.redditoannuolordo = redditoannuolordo;
  }
  getUtileTasse() {
    return this.redditoannuolordo * this.codred;
  }
  getTasseInps() {
    return this.redditoannuolordo * this.tasseinps;
  }
  getTasseIrpef() {
    return this.redditoannuolordo * this.tasseirpef;
  }
  getredditoannuonetto() {
    return (
      this.redditoannuolordo * this.tasseinps * this.tasseirpef * this.codred
    );
  }
}

let giovanni = new commerciante(0.58, 20000, 0.25, 0.35);
let michele = new liberoProfessionista(0.78, 30000, 0.15, 0.2);
let luigi = new artigiano(0.49, 15000, 0.2, 0.3);
console.log("Il reddito al netto delle tasse INPS ??: " + giovanni.getTasseInps());
console.log("Il reddito al netto delle tasse IRPEF ??: " + giovanni.getTasseIrpef());
console.log("L'utile al netto delle tasse ??: " + giovanni.getUtileTasse());
console.log("Il reddito netto ??:" + giovanni.getredditoannuonetto());
console.log("Il reddito al netto delle tasse INPS ??: " + michele.getTasseInps());
console.log("Il reddito al netto delle tasse IRPEF ??: " + michele.getTasseIrpef());
console.log("L'utile al netto ??: " + michele.getUtileTasse());
console.log("Il reddito netto ??: " + michele.getredditoannuonetto());
console.log("Il reddito al netto delle tasse INPS ??: " + luigi.getTasseInps());
console.log("Il reddito al netto delle tasse IRPEF ??: " + luigi.getTasseIrpef());
console.log("L'utile al netto delle tasse ??: " + luigi.getUtileTasse());
console.log("Il reddito netto ??: " + luigi.getredditoannuonetto());
