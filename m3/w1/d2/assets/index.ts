class MotherAccount {
  balance:number;
  interest:number;

  constructor(balance:number, interest:number) {
    this.balance = balance;
    this.interest = interest;
  }

  oneDeposit(amount:number):void {
    this.balance += amount;
  }

  oneWithDraw(amount:number):void {
    this.balance -= amount;
  }

  addInterest():number {
    return this.balance * this.interest;
  }

  total():number {
    return this.balance + this.addInterest();
  }
}

class SonAccount extends MotherAccount {
  balance:number;
  withdrawal:number;

  constructor(balance:number, interest:number, withdrawal:number) {
    super(balance, interest);
    this.withdrawal = withdrawal;
  }

  twoWithDraw(amount:number):void {
    this.balance -= amount;

    if (amount > this.withdrawal) {
      console.log("Hai superato il limite giornaliero!");
    }
  }

  total():number {
    return this.balance;
  }
}

const conto1 = new MotherAccount(1000, 0.1);
conto1.oneDeposit(300);
console.log("Il tuo saldo è: " + conto1.total());

const conto2 = new SonAccount(1000, 0.1, 500);
conto2.twoWithDraw(700);
console.log(conto2.total());

const total = conto1.total() - conto2.total();
console.log(total);
