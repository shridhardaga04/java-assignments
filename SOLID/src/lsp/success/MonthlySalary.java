package lsp.success;

public class MonthlySalary implements TimeCard {

    @Override
    public double calculateSalary() {
        System.out.println("code for monthly salary");
        return 0;
    }

    @Override
    public void addTimeCard() {
        System.out.println("Time card details");
    }
}
