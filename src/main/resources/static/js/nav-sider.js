const sider = document.querySelector('.sider');
const siderNavToggle = document.querySelector('.sider-nav-toggle');
const siderNav = document.querySelector('.sider-navigation');


siderNavToggle.addEventListener('click', () => {

    if(siderNav.hasAttribute('data-visible')){
        siderNavToggle.setAttribute('aria-expended', false);
    }else{
        siderNavToggle.setAttribute('aria-expended', true);
    }

    siderNav.toggleAttribute('data-visible');
    sider.toggleAttribute('data-overlay'); 
});

