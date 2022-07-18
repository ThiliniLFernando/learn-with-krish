public class ExpensesReport {
    private EmployeeDetails employeeDetails;
    private double amount;
    private String details;
    private int reportNum;

    /**
     * @return the employeeDetails
     */
    public EmployeeDetails getEmployeeDetails() {
        return employeeDetails;
    }

    /**
     * @param employeeDetails the employeeDetails to set
     */
    public void setEmployeeDetails(EmployeeDetails employeeDetails) {
        this.employeeDetails = employeeDetails;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the details
     */
    public String getDetails() {
        return details;
    }

    /**
     * @param details the details to set
     */
    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * @return the reportNum
     */
    public int getReportNum() {
        return reportNum;
    }

    /**
     * @param reportNum the reportNum to set
     */
    public void setReportNum(int reportNum) {
        this.reportNum = reportNum;
    }
    
}
