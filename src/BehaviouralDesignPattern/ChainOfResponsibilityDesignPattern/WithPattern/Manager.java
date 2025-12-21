package BehaviouralDesignPattern.ChainOfResponsibilityDesignPattern.WithPattern;

public class Manager extends Approver{
    @Override
    void processLeaves(int leaves) {
        if(leaves <= 7) {
            System.out.println("Leaves approved by Manager");
        } else if(nextApprover != null) {
            nextApprover.processLeaves(leaves);
        }
    }
}
