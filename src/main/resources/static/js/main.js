const primaryHeader = document.querySelector('.primary-header');
const navToggle = document.querySelector('.mobile-nav-toggle');
const primaryNav = document.querySelector('.primary-navigation');


// Slider
const sliderService = new A11YSlider(document.querySelector('.slider.services'), {
    adaptiveHeight: true,
    dots: true,
    arrows:true,
    autoplay: true,
    autoplaySpeed: 2500
  });

  const sliderPrice = new A11YSlider(document.querySelector('.price .slider'), {
    adaptiveHeight: false,
    dots: true,
    arrows:false,
  });

// Slider

navToggle.addEventListener('click', () => {

    if(primaryNav.hasAttribute('data-visible')){
        navToggle.setAttribute('aria-expended', false);
    }else{
        navToggle.setAttribute('aria-expended', true);
    }

    primaryNav.toggleAttribute('data-visible');
    primaryHeader.toggleAttribute('data-overlay'); 
});

