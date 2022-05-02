function createProductCards(products){
  
  // Контейнер элементов-продуктов
  const container = document.querySelector('.product .product-container')

  products.forEach((product, indx) => {
    const card = document.createElement('div');
    card.classList = 'product-card';

    const content = `
    <div class="product-card">
      <div class="product-image">
        <img src=${product.imagePath} class="product-thumb" alt="">
        <button class="card-btn" type="button" name="button">add to wishlist</button>
      </div>
      <div class="product-info">
        <h2 class="product-brand">${product.name}</h2>
        <p class="product-short-description">${product.shortDescription}</p>
        <span class="price">${product.price}</span>
        <span class="actual-price">${product.actualPrice}</span>
      </div>
    </div>
    `;
    
    // Добавление созданного элемента в контейнер
    container.innerHTML += content;
  })
}


function createProductCategories(categories){

  const container = document.querySelector('.pop-up-categories-menu .menu ul')

  categories.forEach((result, idx) => {
    // Create card element
    const card = document.createElement('li');
    card.classList = 'nav-item';

    // Construct card content
    const content = `
    <li class="nav-item"><img src=""><a href="#">Category</a></li>
    `;

    // Append newyly created card element to the container
    container.innerHTML += content;
  })
}


/*
Выплывающие меню
 */

function menuToggle(){
  const toggleMenu = document.querySelector('.pop-up-menu .menu');
  toggleMenu.classList.toggle('active')
}

function categoriesMenuToggle(){
  const toggleMenu = document.querySelector('.pop-up-categories-menu .menu');
  toggleMenu.classList.toggle('active')
}
