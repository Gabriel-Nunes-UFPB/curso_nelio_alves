package entities;

public class PessoaFisica extends Pessoa{
    private double healthExpenses;

    public double getHealthExpenses() {
        return healthExpenses;
    }

    public PessoaFisica(String name, double anualIncome, double healthExpenses) {
        super(name, anualIncome);
        this.healthExpenses = healthExpenses;
    }

    @Override
    public double tax() {
        double tax;
        if (getAnualIncome() < 20000.00){
            tax = (getAnualIncome() * 0.15) - (healthExpenses * 0.5);
        } else {
            tax = (getAnualIncome() * 0.25) - (healthExpenses * 0.5);
        }
        return tax;
    }


}
