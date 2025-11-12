class Desenvolvedor extends Funcionarios {
    private int quantidadeProjetos;
    private double salarioFinal;

    public Desenvolvedor(String nome, double salarioBase, int quantidadeProjetos) {
        super(nome, salarioBase);
        this.quantidadeProjetos = quantidadeProjetos;
    }

    public int getQuantidadeProjetos() {
        return quantidadeProjetos;
    }

    public void setQuantidadeProjetos(int quantidadeProjetos) {
        this.quantidadeProjetos = quantidadeProjetos;
    }

    @Override
    public void calcularSalario() {
        this.salarioFinal = this.salarioBase + (quantidadeProjetos * 500);
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }
}