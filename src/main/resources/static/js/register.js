const submit = document.querySelector(".button");
const password = document.getElementById("password-input");
const rpassword = document.getElementById("rpassword-input");
const matchMessage = document.getElementById("match-password");
const passwordMessage = document.getElementById("password-message");

password.addEventListener("keyup", checkMatch);
password.addEventListener("keydown", checkLength);
rpassword.addEventListener("keyup", checkMatch);



function checkMatch(){
    if(password.value != rpassword.value){        
        matchMessage.style.color = "red";
        matchMessage.innerHTML = "As senhas devem ser iguais";
        submit.disabled = true;
    }else{
        matchMessage.innerHTML = "";
        submit.disabled = false;
    }
}

function checkLength(){
    if(password.value.length < 7){
        passwordMessage.style.color = "red";
        passwordMessage.innerHTML = "&#9863; A senha deve ter no minimo 8 caracteres";
        submit.disabled = true;
    }else{
        
        passwordMessage.innerHTML = "";
        submit.disabled = false;
    }
}


function mask(o, f) {
    setTimeout(function() {
      var v = mphone(o.value);
      if (v != o.value) {
        o.value = v;
      }
    }, 1);
  }
  
  function mphone(v) {
    var r = v.replace(/\D/g, "");
    r = r.replace(/^0/, "");
    if (r.length > 10) {
      r = r.replace(/^(\d\d)(\d{5})(\d{4}).*/, "($1) $2-$3");
    } else if (r.length > 5) {
      r = r.replace(/^(\d\d)(\d{4})(\d{0,4}).*/, "($1) $2-$3");
    } else if (r.length > 2) {
      r = r.replace(/^(\d\d)(\d{0,5})/, "($1) $2");
    } else {
      r = r.replace(/^(\d*)/, "($1");
    }
    return r;
  }


