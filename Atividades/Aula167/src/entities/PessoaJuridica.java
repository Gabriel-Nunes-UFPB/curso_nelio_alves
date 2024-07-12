package entities;

public class PessoaJuridica extends Pessoa{
    private int numberOfEmployees;

    public PessoaJuridica(String name, double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        double tax;
        if (numberOfEmployees <= 10){
            tax = (getAnualIncome() * 0.16);
        } else {
            tax = (getAnualIncome() * 0.14);
        }
        return tax;
    }
}
