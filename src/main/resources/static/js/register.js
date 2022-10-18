const submit = document.getElementById("submit");
const password = document.getElementById("password-input");
const rpassword = document.getElementById("rpassword-input");
const matchMessage = document.getElementById("match-password");
const passwordMessage = document.getElementById("password-message");

const dddField = document.getElementById("ddd");
const telNumber = document.getElementById("telNumber");
const telField = document.getElementById("tel-input");

password.addEventListener("keyup", checkMatch);
password.addEventListener("keydown", checkLength);
rpassword.addEventListener("keyup", checkMatch);
submit.addEventListener("click", beforeSubmit);

function beforeSubmit(){
    let number = telField.value;
    let maskedOffNumber = maskOff(number);
    dddField.value = maskedOffNumber.substring(0,2);
    telNumber.value = maskedOffNumber.substring(2);
}

function maskOff(maskedNumber){
    return maskedNumber
        .replace("(", '')
        .replace(")",'')
        .replace("-",'');
}


function checkMatch(){
    if(password.value !== rpassword.value){
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


