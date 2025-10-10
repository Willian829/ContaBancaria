public class Conta {
    private String numero;
    private Pessoa titular;
    private double saldo;

    public Conta(String numero, Pessoa titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getNumero() {
        return numero;
    }

    public Pessoa getTitular() {
        return titular;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(Conta destino, double valor) {
        if (sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Conta {" + " numero = " + numero + ", titular = " + titular + ", saldo = " + saldo + " }";
    }

}
