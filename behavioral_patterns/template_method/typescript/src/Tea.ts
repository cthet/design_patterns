import {BeverageProductionTemplate} from "./BeverageProductionTemplate";

export class Tea extends BeverageProductionTemplate {
  protected mixIngredients(): void {
      console.log("Steeping the tea");
  }

  protected addCondiments(): void {
      console.log("Adding Lemon");
  }
}