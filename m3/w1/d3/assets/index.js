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
var Tasse = /** @class */ (function () {
    function Tasse(tasseinps, tasseirpef) {
        this.tasseinps = tasseinps;
        this.tasseirpef = tasseirpef;
    }
    return Tasse;
}());
var commerciante = /** @class */ (function (_super) {
    __extends(commerciante, _super);
    function commerciante(codred, redditoannuolordo, tasseinps, tasseirpef) {
        var _this = _super.call(this, tasseinps, tasseirpef) || this;
        _this.codred = codred;
        _this.redditoannuolordo = redditoannuolordo;
        return _this;
    }
    commerciante.prototype.getUtileTasse = function () {
        return this.redditoannuolordo * this.codred;
    };
    commerciante.prototype.getTasseInps = function () {
        return this.redditoannuolordo * this.tasseinps;
    };
    commerciante.prototype.getTasseIrpef = function () {
        return this.redditoannuolordo * this.tasseirpef;
    };
    commerciante.prototype.getredditoannuonetto = function () {
        return (this.redditoannuolordo * this.tasseinps * this.tasseirpef * this.codred);
    };
    return commerciante;
}(Tasse));
var liberoProfessionista = /** @class */ (function (_super) {
    __extends(liberoProfessionista, _super);
    function liberoProfessionista(codred, redditoannuolordo, tasseinps, tasseirpef) {
        var _this = _super.call(this, tasseinps, tasseirpef) || this;
        _this.codred = codred;
        _this.redditoannuolordo = redditoannuolordo;
        return _this;
    }
    liberoProfessionista.prototype.getUtileTasse = function () {
        return this.redditoannuolordo * this.codred;
    };
    liberoProfessionista.prototype.getTasseInps = function () {
        return this.redditoannuolordo * this.tasseinps;
    };
    liberoProfessionista.prototype.getTasseIrpef = function () {
        return this.redditoannuolordo * this.tasseirpef;
    };
    liberoProfessionista.prototype.getredditoannuonetto = function () {
        return (this.redditoannuolordo * this.tasseinps * this.tasseirpef * this.codred);
    };
    return liberoProfessionista;
}(Tasse));
var artigiano = /** @class */ (function (_super) {
    __extends(artigiano, _super);
    function artigiano(codred, redditoannuolordo, tasseinps, tasseirpef) {
        var _this = _super.call(this, tasseinps, tasseirpef) || this;
        _this.codred = codred;
        _this.redditoannuolordo = redditoannuolordo;
        return _this;
    }
    artigiano.prototype.getUtileTasse = function () {
        return this.redditoannuolordo * this.codred;
    };
    artigiano.prototype.getTasseInps = function () {
        return this.redditoannuolordo * this.tasseinps;
    };
    artigiano.prototype.getTasseIrpef = function () {
        return this.redditoannuolordo * this.tasseirpef;
    };
    artigiano.prototype.getredditoannuonetto = function () {
        return (this.redditoannuolordo * this.tasseinps * this.tasseirpef * this.codred);
    };
    return artigiano;
}(Tasse));
var giovanni = new commerciante(0.58, 20000, 0.25, 0.35);
var michele = new liberoProfessionista(0.78, 30000, 0.15, 0.2);
var luigi = new artigiano(0.49, 15000, 0.2, 0.3);
console.log("Il reddito al netto delle tasse INPS è: " + giovanni.getTasseInps());
console.log("Il reddito al netto delle tasse IRPEF è: " + giovanni.getTasseIrpef());
console.log("L'utile al netto delle tasse è: " + giovanni.getUtileTasse());
console.log("Il reddito netto è:" + giovanni.getredditoannuonetto());
console.log("Il reddito al netto delle tasse INPS è: " + michele.getTasseInps());
console.log("Il reddito al netto delle tasse IRPEF è: " + michele.getTasseIrpef());
console.log("L'utile al netto è: " + michele.getUtileTasse());
console.log("Il reddito netto è: " + michele.getredditoannuonetto());
console.log("Il reddito al netto delle tasse INPS è: " + luigi.getTasseInps());
console.log("Il reddito al netto delle tasse IRPEF è: " + luigi.getTasseIrpef());
console.log("L'utile al netto delle tasse è: " + luigi.getUtileTasse());
console.log("Il reddito netto è: " + luigi.getredditoannuonetto());
