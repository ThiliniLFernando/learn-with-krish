public class ReportingManager extends Handler {

    public boolean checkExpencess(ExpensesReport er) {
        boolean status = false;
        if (er.getEmployeeDetails().getTier() == 4) {
            if (er.getAmount() > 2000) {
                successor.checkExpencess(er);
            } else {
                System.out.println("Reporting Manager approved the expense report " + er.getReportNum());
            }
        } else {
            successor.checkExpencess(er);
        }
        return status;
    }

}
