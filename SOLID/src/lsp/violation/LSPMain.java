package lsp.violation;

public class LSPMain {
    public static void main(String[] args) {
        PaySalary commissionSal = new CommissionSalary();
        commissionSal.addTimeCard(); // no need for time card functionality
        commissionSal.calculateSalary();
    }
}
