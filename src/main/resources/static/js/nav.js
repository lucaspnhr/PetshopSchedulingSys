const primaryHeader = document.querySelector('.primary-header');
const navToggle = document.querySelector('.mobile-nav-toggle');
const primaryNav = document.querySelector('.primary-navigation');


navToggle.addEventListener('click', () => {

    if(primaryNav.hasAttribute('data-visible')){
        navToggle.setAttribute('aria-expended', false);
    }else{
        navToggle.setAttribute('aria-expended', true);
    }

    primaryNav.toggleAttribute('data-visible');
    primaryHeader.toggleAttribute('data-overlay'); 


    console.console.log("asd");
});

