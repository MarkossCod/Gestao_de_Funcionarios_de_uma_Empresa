class Gerente extends Funcionarios {
    private double bonus;
    private double salarioFinal;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void calcularSalario() {
        salarioFinal = salarioBase + bonus;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }
}