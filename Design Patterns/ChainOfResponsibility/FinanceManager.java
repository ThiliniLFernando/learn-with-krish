public class FinanceManager extends Handler {

    public boolean checkExpencess(ExpensesReport er) {
        boolean status = false;
        if (er.getEmployeeDetails().getTier() <= 2) {
            if (er.getAmount() > 20000) {
                successor.checkExpencess(er);
            } else {
                System.out.println("Finance Manager approved the expense report " + er.getReportNum());
            }
        } else {
            successor.checkExpencess(er);
        }
        return status;
    }

}
