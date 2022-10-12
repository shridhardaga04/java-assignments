package lsp.violation;

public class CommissionSalary extends PaySalary{
    public double calculateSalary(){
        System.out.println("calculate salary for commission");
        return 0;
    }

    // violates the LSP
    public void addTimeCard(){
        System.out.println("Error no time card for commission based staff");
    }
}
