abstract class Handler {
    protected Handler successor ;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
    
    public abstract boolean checkExpencess(ExpensesReport er);
    
}
