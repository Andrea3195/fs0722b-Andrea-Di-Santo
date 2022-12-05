const btn = document.querySelector('#invio');
btn.addEventListener('click', function (event) {
    event.preventDefault();
    const nome = document.querySelector('#nome').value;
    const cognome = document.querySelector('#cognome').value;
    const dataNascita = document.querySelector('#dataNascita').value;
    let x = new Persona(nome, cognome, dataNascita);
    console.log(x.mostraNomeECognome());
    x.aggiungiATabella();
});

function Persona(a, b, c) {
    this.nome = a;
    this.cognome = b;
    this.dataNascita = c;
    this.mostraNomeECognome = function () {
        return this.nome + ' ' + this.cognome;
    };
    this.aggiungiATabella = function () {
        const eta = this.calcolaEta();
        let tabella = document.querySelector('.table');
        let tr = document.createElement('tr');
        tr.innerHTML = `<td>${this.nome} ${this.cognome}</td><td>${eta}</td>`;
        tabella.appendChild(tr);
    }
    this.calcolaEta = function () {
        const dataCorrente = new Date();
        const annoCorrente = dataCorrente.getFullYear();
        const dataNascita = new Date(this.dataNascita);
        const annoNascita = dataNascita.getFullYear();
        const eta = annoCorrente - annoNascita;
        return eta;
    }
}