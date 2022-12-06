class persona {
    name;
    age;
    constructor(_name = '', _age = '') {
        this.name = _name;
        this.age = _age;
    }

    eta() {
        if ((user1.age > user2.age)) {
            console.log('Mario è piu grande di Luigi');
        }
        if ((user2.age < user1.age)) {
            console.log('Luigi è più piccolo di Mario');
        }
        if ((user2.age == user3.age)) {
            console.log('Luigi e Michele hanno la stessa età');
        }
    }
}

let user1 = new persona('Mario', 30);
let user2 = new persona('Luigi', 25);
let user3 = new persona('Michele', 25);

user1.eta()