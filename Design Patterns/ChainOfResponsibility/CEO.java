public class CEO extends Handler {

    public boolean checkExpencess(ExpensesReport er) {
        boolean status = false;
        System.out.println("CEO approved the expense report " + er.getReportNum());
        return status;
    }

}
