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

    public void ImprimirDados(){
        System.out.printf("%n%nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de R$ %.2f já está disponível para saque!", this.Nome, this.Agencia, this.Numero, this.Saldo);
    }
}
