// clipping-options

//clipping-checkbox

const hiddenPrice = document.getElementById('total-price-hidden');
const price = document.getElementById('total-price');
const serviceOptions = [document.getElementById('bath-checkbox'),
    document.getElementById('hydration-checkbox'),
    document.getElementById('untangle-checkbox'),
    document.getElementById('default-clipping-input'),
    document.getElementById('higenic-clipping-input')]

const priceList = [20.5, 18, 15, 40, 30];

const div = document.querySelector(".clipping-options");
const clippingCheck = document.getElementById('clipping-checkbox');
const cutType = document.querySelectorAll("input[name='cut-type']");
const clippingType = document.querySelectorAll("input[name='clippingType']");


clippingCheck.addEventListener('click', ()=>{
    div.classList.toggle("hidden");
    
    clippingType.forEach((element) => {
        toggleRequired(element);
    })
    cutType.forEach((element) => {
        toggleRequired(element);
    });
});

function toggleRequired(element){
    if(element.required){
        element.required = false;
    }else{
        element.required = true;
    }
}

serviceOptions.forEach((el, index) => {
    el.addEventListener("click", () =>{
        let value = 0;
        if(el.checked){
            value = priceList[index];
            addToPrice(value);
        }else{
            console.log(value)
            value = priceList[index];
            subToPrice(value);
        }
    });

})

function addToPrice(value){
    let currentPrice = Number(hiddenPrice.value);
    currentPrice += value;
    hiddenPrice.value = currentPrice;
    price.innerHTML = String(currentPrice.toFixed(2).toLocaleString('pt-BR'));

}

function subToPrice(value){
    let currentPrice = Number(hiddenPrice.value);
    currentPrice -= value;
    hiddenPrice.value = currentPrice;
    price.innerHTML = String(currentPrice.toFixed(2).toLocaleString('pt-BR'));
}


const days = Object.keys(dates);
// const hours = days.map((day)=>{return date[day]});

const dateInput = document.getElementById("appointment-date");
const hourInput = document.getElementById("appointment-hour");
const hourOptions = document.querySelectorAll("#appointment-hour option");

dateInput.addEventListener("change", () =>{
    let day = days.filter((date) => {
        return (date === dateInput.value)
    })[0];
    let hours = dates[day];
    console.log(day)
    updateAvailableHours(hours);

});

function updateAvailableHours(hours){
    hourOptions.forEach((el) => {
        let key = el.value;
        if(!hours){
            el.disabled = false;
        }else{
            el.disabled = !!hours.includes(key);
        }
    });
}
