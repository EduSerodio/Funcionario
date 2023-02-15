public abstract class Funcionario {
    //Atributos
    private String nome;
    private String sobrenome;
    private String numeroconta;

    //Construtor
    public Funcionario(String nome, String sobrenome, String numeroconta) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroconta = numeroconta;
    }

    //Métodos
    public abstract double calcularSalario();

    public abstract void imprimirRecibo(double quantia);

    public void depositar(double quantia){
        System.out.println("Foi depositado uma quantia de: " + quantia);
    }

    public void pagamentoSalarial(){
        double quantia;
        quantia = calcularSalario();
        imprimirRecibo(quantia);
        depositar(quantia);
    }
}
