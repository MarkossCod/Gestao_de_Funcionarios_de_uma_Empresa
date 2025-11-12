public abstract class Funcionarios {
    protected String nome;
    protected double salarioBase;
    protected double salarioFinal;  // <- Adicione este atributo

    public Funcionarios(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    // Getters e setters para nome e salarioBase
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Adicione este método para acesso ao salário final
    public double getSalarioFinal() {
        return salarioFinal;
    }

    // Método abstrato para forçar cálculo nas subclasses
    public abstract void calcularSalario();
}
