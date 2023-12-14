export abstract class BeverageProductionTemplate {
  private customerWantsCondiments: boolean = false;

  public prepareBeverage(): void {
      this.boilWater();
      this.mixIngredients();
      this.pourInCup();
      if (this.customerWantsCondiments) {
          this.addCondiments();
      }
  }

  protected boilWater(): void {
      console.log("Boiling water");
  }

  protected pourInCup(): void {
      console.log("Pouring into cup");
  }

  protected abstract mixIngredients(): void;
  protected abstract addCondiments(): void;

  public setCustomerWantsCondiments(wantsCondiments: boolean): void {
      this.customerWantsCondiments = wantsCondiments;
  }
}