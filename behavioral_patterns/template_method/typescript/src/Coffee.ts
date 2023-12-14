import {BeverageProductionTemplate} from "./BeverageProductionTemplate";

export class Coffee extends BeverageProductionTemplate {
  protected mixIngredients(): void {
      console.log("Dripping Coffee through filter");
  }

  protected addCondiments(): void {
      console.log("Adding Sugar and Milk");
  }
}