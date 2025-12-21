package BehaviouralDesignPattern.ChainOfResponsibilityDesignPattern.WithPattern;

public class Main {
    public static void main(String[] args) {
        Supervisor supervisor = new Supervisor();
        Manager manager = new Manager();
        Director director = new Director();

        supervisor.setNextApprover(manager);
        manager.setNextApprover(director);

        supervisor.processLeaves(10);
    }
}
