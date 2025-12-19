package BehaviouralDesignPattern.TemplateDesignPattern.WithPattern;

public abstract class Beverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("Boiling Water...");
    }

    abstract void brew();

    private void pourInCup() {
        System.out.println("Pouring into Cup...");
    }

    abstract void addCondiments();
}
