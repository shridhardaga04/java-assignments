package lsp.success;

public class CommissionSalary implements PaySalary {

    @Override
    public double calculateSalary(){
        System.out.println("calculate salary for commission");
        return 0;
    }
    // No need for time card details

}
