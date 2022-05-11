/*
Выплывающие меню
 */

function profileMenuClick(){
  const toggleMenu = document.querySelector('.profile-pop-up-menu .menu');
  if(1==0){
    toggleMenu.classList.toggle('active')
  }
  else{
    var url = window.location.href;
    console.log(url);
      window.location = url;
  }
}

function categoriesMenuToggle(){
  const toggleMenu = document.querySelector('.pop-up-categories-menu .menu');
  toggleMenu.classList.toggle('active')
}
