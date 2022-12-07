function storage() {
    if (typeof (Storage) != undefined) {
        counter();
    }
    else {
        document.getElementById("result").innerHTML = "Il tuo browser non supporta Web storage!";
    }
}

function counter() {
    if (sessionStorage.seconds) {
        sessionStorage.seconds = Number(sessionStorage.seconds) + 1;
    } else {
        sessionStorage.seconds = 1;
    }
    document.getElementById("timer").innerHTML = "Timer : " + sessionStorage.seconds + " Seconds";
}

const time = setInterval(counter, 1000);