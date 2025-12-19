package BehaviouralDesignPattern.TemplateDesignPattern.WithoutPattern;

public class Tea {

    public void prepareTea() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    private void boilWater() {
        System.out.println("Boiling Water...");
    }

    private void steepTeaBag() {
        System.out.println("Steeping Tea Bag...");
    }

    private void pourInCup() {
        System.out.println("Pouring into Cup...");
    }

    private void addLemon() {
        System.out.println("Adding Lemon...");
    }
}
