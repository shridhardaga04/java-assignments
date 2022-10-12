package lsp.success;

public class LSPMain {
    public static void main(String[] args) {
        PaySalary commissionSal = new CommissionSalary();
        commissionSal.calculateSalary(); // only calculateSalary is visible
    }
}
