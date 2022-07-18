public class Accountant extends Handler {

    public boolean checkExpencess(ExpensesReport er) {
        boolean status = false;
        if (er.getEmployeeDetails().getTier() <= 3) {
            if (er.getAmount() >= 10000) {
                successor.checkExpencess(er);
            } else {
                System.out.println("Accountant approved the expense report " + er.getReportNum());
            }
        } else {
            successor.checkExpencess(er);
        }
        return status;
    }

}
