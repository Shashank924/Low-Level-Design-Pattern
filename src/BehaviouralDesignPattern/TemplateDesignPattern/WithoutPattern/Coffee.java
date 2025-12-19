package BehaviouralDesignPattern.TemplateDesignPattern.WithoutPattern;

public class Coffee {
    public void prepareCoffee() {
        boilWater();
        brewCoffee();
        pourInCup();
        addSugarAndMilk();
    }

    private void boilWater() {
        System.out.println("Boiling Water...");
    }

    private void brewCoffee() {
        System.out.println("Brewing Coffee...");
    }

    private void pourInCup() {
        System.out.println("Pouring into Cup...");
    }

    private void addSugarAndMilk() {
        System.out.println("Adding Milk And Sugar...");
    }
}
