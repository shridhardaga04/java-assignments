package lsp.success;

public class WeeklySalary implements TimeCard {

    @Override
    public double calculateSalary() {
        System.out.println("code for weekly salary");
        return 0;
    }

    @Override
    public void addTimeCard() {
        System.out.println("Time card details");
    }
}
