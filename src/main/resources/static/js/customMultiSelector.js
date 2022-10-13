
class CustomSelect{
  constructor(selector) {
  	console.log(selector);
    this.originalSelect = selector.querySelector(".original-selection");
    this.customSelection = selector.querySelector(".custom-selection");
    console.log(this.originalSelect);
    console.log(this.customSelection);
    /*width-100 margin-block-end-400 */
    this.selectedContainer = document.createElement("div");
    this.selectedContainer.classList.add("selected-list");
    this.selectedContainer.classList.add("width-100");
    this.selectedContainer.classList.add("margin-block-end-400");

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
    let text = document.createElement("span");
    let img = document.createElement("img");

    img.width = 10;
    img.src = "../static/images/icon-close-hm.svg";

    el.classList.add("selected-item");
    el.classList.add("flex");
    el.classList.add("justify-between");

    text.id = optionElement.textContent.toLowerCase().trim();
    text.textContent = optionElement.textContent;

    el.appendChild(text);
    el.appendChild(img);

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