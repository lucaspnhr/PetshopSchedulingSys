
class CustomSelect{
  constructor(selector) {
  	console.log(selector);
    this.originalSelect = selector.querySelector(".original-selection");
    this.customSelection = selector.querySelector(".custom-selection");
    console.log(this.originalSelect);
    console.log(this.customSelection);

    this.selectedContainer = document.createElement("div");
    this.selectedContainer.classList.add("selected-list");

    

    this.customSelection.insertAdjacentElement("afterend", this.selectedContainer);

    this.originalSelect.addEventListener("change", () => {
      let options = selector.querySelectorAll(".custom-selection option");
      let selected = selector.querySelector(`.original-selection option[value=${this.originalSelect.value}]`);
      let index = Array.from(this.originalSelect.children).indexOf(selected);
      
      console.log(this.originalSelect);
      options[index-1].selected = true;
      this.originalSelect.value = "select";
      this._update(this.customSelection);
    });    
  }

  _update(hiddenSelect){
    hiddenSelect.querySelectorAll("option").forEach( option => {
      let isSelected = option.hasAttribute("data-selected");
      if(!isSelected && option.selected){
          option.toggleAttribute("data-selected");
          console.log(option);
          this._createElement(option);
      }
    });
  }

  _createElement(optionElement){
    let el = document.createElement("div");
    el.id = optionElement.textContent;
    el.textContent = optionElement.textContent + " x" ;
    this.selectedContainer.appendChild(el);
    el.addEventListener("click", () =>{
    console.log("func");
    optionElement.toggleAttribute("data-selected");
    optionElement.selected = false;
    el.remove();
    });
  }
}

var selects = document.querySelectorAll(".custom-selector-wrapper");
console.log(selects);
selects.forEach((select) => {
	console.log("as");
	new CustomSelect(select);
});