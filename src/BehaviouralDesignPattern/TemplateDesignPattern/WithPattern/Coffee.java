package BehaviouralDesignPattern.TemplateDesignPattern.WithPattern;

public class Coffee extends Beverage{

    public void prepareCoffee() {
        prepareRecipe();
    }

    @Override
    void brew() {
        System.out.println("Brewing Coffee...");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Milk and Sugar...");
    }
}
