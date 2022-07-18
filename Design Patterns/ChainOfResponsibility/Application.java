public class Application {
    public static void main(String[] args) {
        EmployeeDetails ed = new EmployeeDetails();
        ed.setEmpNo("e1");
        ed.setName("Sarath");
        ed.setTier(1);
        
        EmployeeDetails ed1 = new EmployeeDetails();
        ed1.setEmpNo("e2");
        ed1.setName("Kamala");
        ed1.setTier(2);
        
        EmployeeDetails ed2 = new EmployeeDetails();
        ed2.setEmpNo("e3");
        ed2.setName("Achintha");
        ed2.setTier(3);
        
        EmployeeDetails ed3 = new EmployeeDetails();
        ed3.setEmpNo("e4");
        ed3.setName("Thilini");
        ed3.setTier(4);
        
        ExpensesReport er1 = new ExpensesReport();
        er1.setReportNum(1);
        er1.setAmount(300000);
        er1.setDetails("Reason 1");
        er1.setEmployeeDetails(ed);
        
        ExpensesReport er2 = new ExpensesReport();
        er2.setReportNum(10);
        er2.setAmount(20000);
        er2.setDetails("Reason 2");
        er2.setEmployeeDetails(ed1);
        
        ExpensesReport er3 = new ExpensesReport();
        er3.setReportNum(100);
        er3.setAmount(3000);
        er3.setDetails("Reason 3");
        er3.setEmployeeDetails(ed2);
        
        ExpensesReport er4 = new ExpensesReport();
        er4.setReportNum(1000);
        er4.setAmount(1000);
        er4.setDetails("Reason 4");
        er4.setEmployeeDetails(ed3);
        
        ReportingManager reportingManager = new ReportingManager();
        Accountant accountant = new Accountant();
        FinanceManager financeManager = new FinanceManager();
        CEO ceo = new CEO();
        
        reportingManager.setSuccessor(accountant);
        accountant.setSuccessor(financeManager);;
        financeManager.setSuccessor(ceo);
        
        reportingManager.checkExpencess(er1);
        System.out.println("------------");
        reportingManager.checkExpencess(er2);
        System.out.println("------------");
        reportingManager.checkExpencess(er3);
        System.out.println("------------");
        reportingManager.checkExpencess(er4);
        
    }
}
