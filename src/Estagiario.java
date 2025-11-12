class Estagiario extends Funcionarios {
    private double salarioFinal;

    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void calcularSalario() {
        salarioFinal = salarioBase * 0.8;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }
}