package ContaBancaria;

public abstract class Conta {
    private int agencia;
    private int numeroDaConta;
    private String tipo;
    private String titular;
    private double saldo;
    private boolean status;


    abstract void abrirConta();

    abstract void fecharConta();

    void depositar(double valor) {
        this.saldo += valor;
    }

    void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else{
            System.out.println("Conta de " + titular + " não tem saldo para esta operação" );
        }
    }

    abstract void pagarMensalidade();


    public void status() {
        System.out.println(
                "Titular: " + titular
                + "\n Tipo de conta: " + tipo
                + "\n Agência: " + agencia
                + "\n Número da conta: " + numeroDaConta
                + "\n Saldo: " + saldo
                + "\n Status da conta: "+ this.status
                + "\n");

    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
