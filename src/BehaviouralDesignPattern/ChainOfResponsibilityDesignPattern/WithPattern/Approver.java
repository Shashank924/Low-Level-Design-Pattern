package BehaviouralDesignPattern.ChainOfResponsibilityDesignPattern.WithPattern;

abstract class Approver {

    protected Approver nextApprover;

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    abstract void processLeaves(int leaves);

}
