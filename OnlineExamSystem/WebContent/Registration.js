var password = document.getElementById("password")
  , confirm_password = document.getElementById("confirm_password");

function validatePassword(){
  if(password.value != confirm_password.value) {
    confirm_password.setCustomValidity("Passwords Don't Match");
  } else {
    confirm_password.setCustomValidity('');
  }
}

password.onchange = validatePassword;
confirm_password.onkeyup = validatePassword;







var password1 = document.getElementById("password1")
, confirm_password1 = document.getElementById("confirm_password1");

function validatePassword1(){
if(password1.value != confirm_password1.value) {
  confirm_password1.setCustomValidity("Passwords Don't Match");
} else {
  confirm_password1.setCustomValidity('');
}
}

password1.onchange = validatePassword1;
confirm_password1.onkeyup = validatePassword1;