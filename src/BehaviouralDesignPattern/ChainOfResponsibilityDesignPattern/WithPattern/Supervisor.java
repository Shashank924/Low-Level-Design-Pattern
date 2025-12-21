package BehaviouralDesignPattern.ChainOfResponsibilityDesignPattern.WithPattern;

public class Supervisor extends Approver{
    @Override
    void processLeaves(int leaves) {
        if(leaves <= 3) {
            System.out.println("Leaves approved by Supervisor");
        } else if(nextApprover != null) {
            nextApprover.processLeaves(leaves);
        }
    }
}
