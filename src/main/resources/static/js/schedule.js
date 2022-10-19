// clipping-options

//clipping-checkbox

const div = document.querySelector(".clipping-options");
const check = document.getElementById('clipping-checkbox');
const cutType = document.querySelectorAll("input[name='cut-type']");
const clippingType = document.querySelectorAll("input[name='clipping-type']");

check.addEventListener('change', ()=>{
    div.classList.toggle("hidden");
    
    clippingType.forEach((element) => {
        toggleRequired(element);
    })
    cutType.forEach((element) => {
        toggleRequired(element);
    })


    console.log("funfu");
});

function toggleRequired(element){
    if(element.required){
        element.required = false;
    }else{
        element.required = true;
    }
}