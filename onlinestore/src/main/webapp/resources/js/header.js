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

function profileIconClick(){
  if(1==0){
    const toggleMenu = document.querySelector('.profile-pop-up-menu .menu');
    toggleMenu.classList.toggle('active')
  }
  else{
    const toggleMenu = document.querySelector('.autorization-pop-up');
    toggleMenu.classList.toggle('active')
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
