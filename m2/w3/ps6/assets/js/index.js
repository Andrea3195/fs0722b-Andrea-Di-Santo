fetch('assets/json/users.json').then(function (response) {
    return response.json();

}).then(function (json) {
    classe = json;
    console.log(classe)

    document.querySelector('#john').innerHTML = classe[0].firstName + " " + classe[0].lastName + " ";
    document.querySelector('#john_email').innerHTML = classe[0].email;
    document.querySelector('#jane').innerHTML = classe[1].firstName + " " + classe[1].lastName;
    document.querySelector('#jane_email').innerHTML = classe[1].email;
    document.querySelector('#male_img').innerHTML = `<img class="bg-light border rounded-circle" src ="./assets/img/male.png"></img>`
    document.querySelector('#female_img').innerHTML = `<img class="bg-light border rounded-circle" src ="./assets/img/female.png"></img>`

}).catch(function (err) {
    console.log('fetch problem: ' + err.message);

});