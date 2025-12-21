package BehaviouralDesignPattern.ChainOfResponsibilityDesignPattern.WithoutPattern;

public class Approver {

    public void approveLeaves(int leaves) {
        if(leaves <= 3) {
            System.out.println("Leave approved By Supervisor");
        } else if(leaves <= 7) {
            System.out.println("Leave approved By Manager");
        } else if (leaves <= 14) {
            System.out.println("Leave approved By Director");
        } else {
            throw new RuntimeException("Too many Leaves");
        }
    }
}
