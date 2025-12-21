package BehaviouralDesignPattern.ChainOfResponsibilityDesignPattern.WithPattern;

public class Director extends Approver{
    @Override
    void processLeaves(int leaves) {
        if(leaves <= 14) {
            System.out.println("Leaves approved by Director");
        } else if(nextApprover != null) {
            nextApprover.processLeaves(leaves);
        } else {
            throw new RuntimeException("Too Many Leaves");
        }
    }
}
