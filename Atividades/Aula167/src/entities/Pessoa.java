package entities;

public abstract class Pessoa {
    private String name;
    private double anualIncome;

    public Pessoa(String name, double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public abstract double tax();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnualIncome() {
        return anualIncome;
    }



}
