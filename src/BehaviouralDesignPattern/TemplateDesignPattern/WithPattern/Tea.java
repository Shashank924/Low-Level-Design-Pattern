package BehaviouralDesignPattern.TemplateDesignPattern.WithPattern;

public class Tea extends Beverage{

    public void prepareTea() {
        prepareRecipe();
    }

    @Override
    void brew() {
        System.out.println("Steeping Tea Bag...");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon...");
    }
}
