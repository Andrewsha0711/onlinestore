/*
Выплывающие меню
 */
 function createHeader(){
   const nav = document.getElementById('nav');
   fetch('./header.html')
   .then(res=>{
     return res.text();
   })
   .then(data=>{
     nav.innerHTML=data;
   })
 }

function profileIconClick(user_email){
  if(user_email == null || user_email == 'null'){
    const autorizationForm = document.querySelector('.autorization-pop-up');
    autorizationForm.classList.add('active');
  }
  else{
	console.log(user_email);
    const toggleMenu = document.querySelector('.profile-pop-up-menu .menu');
    toggleMenu.classList.toggle('active');
  }
}

function categoriesMenuToggle(){
  const toggleMenu = document.querySelector('.pop-up-categories-menu .menu');
  toggleMenu.classList.toggle('active')
}

function switchToRegistrationForm(){
  const regForm = document.querySelector('.registration-form');
  const loginForm = document.querySelector('.login-form');
  regForm.classList.add('active');
  loginForm.classList.add('hidden');
}

function switchToLoginForm(){
  const regForm = document.querySelector('.registration-form');
  const loginForm = document.querySelector('.login-form');
  regForm.classList.remove('active');
  loginForm.classList.remove('hidden');
}

function closeForm(){
  const autorizationForm = document.querySelector('.autorization-pop-up');
  autorizationForm.classList.remove('active');
}
