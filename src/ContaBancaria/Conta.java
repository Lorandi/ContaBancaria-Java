package ContaBancaria;

public abstract class Conta {
    private int agencia;
    private int numeroDaConta;
    private String tipo;
    private String titular;
    private double saldo;
    private boolean contaAberta;


    abstract void abrirConta();

    void fecharConta() {
        if (this.isContaAberta() && this.getSaldo() == 0) {
            this.setContaAberta(false);
            System.out.println("Conta de " + this.titular + " foi fechada");
        } else {
            System.out.print("Conta não pode ser fechada ");
            if (this.getSaldo() != 0) {
                System.out.println("pois o saldo da conta é " + this.getSaldo() + " e precisa ser zerado antes de fechar");
            } else {
                System.out.println("pois a conta já estava fechada");
            }
        }
        this.status();
    }


    void depositar(double valor) {
        if(valor < 0 ){
            System.out.println("Valor para depósito precisa ser positivo");
            return;
        } else if (contaAberta ) {
            this.saldo += valor;
        } else {
            System.out.println("Conta está fechada");
        }

    }

    void sacar(double valor) {
        if(valor < 0 ) {
            System.out.println("Valor para saque precisa ser positivo");
        }else if (contaAberta && this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println(" Não é possivel sacar");
        }
        System.out.println("");
    }

    abstract void pagarMensalidade();


    public void status() {
        System.out.println(
                "Titular: " + titular
                        + "\n Tipo de conta: " + tipo
                        + "\n Agência: " + agencia
                        + "\n Número da conta: " + numeroDaConta
                        + "\n Saldo: " + saldo
                        + "\n Status da conta: " + this.contaAberta
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

    public boolean isContaAberta() {
        return contaAberta;
    }

    public void setContaAberta(boolean contaAberta) {
        this.contaAberta = contaAberta;
    }
}
