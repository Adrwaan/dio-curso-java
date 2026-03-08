public class Conta {
    public int Numero;
    public String Agencia;
    public String Nome;
    public double Saldo;

    public Conta(int numero, String agencia, String nome, double saldo){
        this.Nome = nome;
        this.Numero = numero;
        this.Agencia = agencia;
        this.Saldo = saldo;
    }
}
