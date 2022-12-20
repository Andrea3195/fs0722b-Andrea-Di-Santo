var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var MotherAccount = /** @class */ (function () {
    function MotherAccount(balance, interest) {
        this.balance = balance;
        this.interest = interest;
    }
    MotherAccount.prototype.oneDeposit = function (amount) {
        this.balance += amount;
    };
    MotherAccount.prototype.oneWithDraw = function (amount) {
        this.balance -= amount;
    };
    MotherAccount.prototype.addInterest = function () {
        return this.balance * this.interest;
    };
    MotherAccount.prototype.total = function () {
        return this.balance + this.addInterest();
    };
    return MotherAccount;
}());
var SonAccount = /** @class */ (function (_super) {
    __extends(SonAccount, _super);
    function SonAccount(balance, interest, withdrawal) {
        var _this = _super.call(this, balance, interest) || this;
        _this.withdrawal = withdrawal;
        return _this;
    }
    SonAccount.prototype.twoWithDraw = function (amount) {
        this.balance -= amount;
        if (amount > this.withdrawal) {
            console.log("Hai superato il limite giornaliero!");
        }
    };
    SonAccount.prototype.total = function () {
        return this.balance;
    };
    return SonAccount;
}(MotherAccount));
var conto1 = new MotherAccount(1000, 0.1);
conto1.oneDeposit(300);
console.log("Il tuo saldo è: " + conto1.total());
var conto2 = new SonAccount(1000, 0.1, 500);
conto2.twoWithDraw(700);
console.log(conto2.total());
var total = conto1.total() - conto2.total();
console.log(total);
