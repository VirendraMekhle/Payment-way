let send = document.getElementById("send");
send.addEventListener("click", (e) => {
    e.preventDefault();
    window.location.href = "/send_amount.html"
});

let receive = document.getElementById("receive");
receive.addEventListener("click", (e) => {
    e.preventDefault();
    window.location.href = "/receive_amount.html"
});

let check = document.getElementById("check");
check.addEventListener("click", (e) => {
    e.preventDefault();
    window.location.href = "/check_balance.html"
});