function Validator() {
    var form = document.getElementById("form");
    var email = document.getElementById("email").value;
    var result = document.getElementById("result");
    var pattern = /^[^ ]+@[^ ]+\.[a-z]{2,3}$/;
    if(email.match(pattern)) {
        form.classList.add("valid");
        form.classList.add("invalid");
        result.innerHTML= "Entered Email is Valid..!!";
        result.style.color= "#00ff00";
    } else {
        form.classList.remove("valid");
        form.classList.add("invalid");
        result.innerHTML= "Email is Invalid..!!";
        result.style.color= "#ff0000";
    }
}