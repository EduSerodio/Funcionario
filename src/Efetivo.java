public class Efetivo extends Funcionario {
    //Atributos
    private double salarioBase;
    private double descontos;
    private double bonificacoes;

    //Construtor
    public Efetivo(String nome, String sobrenome, String numeroConta, double salarioBase, double descontos, double bonificacoes) {
        super(nome, sobrenome, numeroConta);
        this.salarioBase = salarioBase;
        this.descontos = descontos;
        this.bonificacoes = bonificacoes;
    }

    //Sobrescritas
    @Override
    public double calcularSalario() {
        return salarioBase + bonificacoes - descontos;
    }

    @Override
    public void imprimirRecibo(double quantia) {
        System.out.println("Gerado um recibo - Efetivo no valor de: " + quantia);
    }
}
