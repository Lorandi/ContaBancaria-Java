package Banco;

public abstract class Conta {
    private int agencia;
    private int numeroDaConta;
    private String tipo;
    private Cliente titular;
    private double saldo;
    private boolean contaAberta;
    private int mensalidade;

    void tranfere(double valor, Conta destino){
        this.sacar(valor);
        destino.depositar(valor);
    }



    void abrirConta(){
         System.out.println("Conta de " + this.getTitular().getNome() + " foi aberta");
         this.setContaAberta(true);

         if(this.tipo.equals("Conta Corrente") )
         {
             this.setSaldo(50);
         } else if (this.tipo.equals("Conta Poupança")) {
             this.setSaldo(100);
         } else{
             System.out.println("Problema ao abrir conta");
         }

         this.status();
     };

    void fecharConta() {
        if (this.isContaAberta() && this.getSaldo() == 0) {
            this.setContaAberta(false);
            System.out.println("Conta de " + this.getTitular().getNome() + " foi fechada");
        } else {
            System.out.print("Conta não pode ser fechada ");
            if (this.getSaldo() != 0) {
                System.out.println("pois o saldo da conta é " + this.getSaldo() + " e precisa ser zerado antes de fechar");
            } else {
                System.out.println("pois a conta já estava fechada");
            }
        }
        this.status();
        System.out.println("");
    }


    void depositar(double valor) {
        if(valor < 0 ){
            System.out.println("Valor para depósito precisa ser positivo");
            return;
        } else if (contaAberta ) {
            this.saldo += valor;
            System.out.print("Depoisitado " + valor + " na conta de " + this.getTitular().getNome());
            System.out.println(" e o saldo atual da conta é " + this.getSaldo());
            System.out.println("");


        } else {
            System.out.println("Conta está fechada");
        }


    }

    void sacar(double valor) {
        if(valor < 0 ) {
            System.out.println("Valor para saque precisa ser positivo");
        }else if (contaAberta && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.print("Sacado " + valor + " da conta de " + this.getTitular().getNome());
            System.out.println(" e o saldo atual da conta é " + this.getSaldo());

        } else {
            System.out.println("Não é possivel sacar " + valor + " pois o saldo da conta é " + this.getSaldo()
            + " faltando " + (valor - this.getSaldo() + " para completar a operaçção"));
            System.out.println("");
        }
        System.out.println("");
    }

    void pagarMensalidade() {
        this.saldo -= this.getMensalidade();
        System.out.print("Debitado mensalidade de "+ mensalidade + " na conta de " + this.getTitular().getNome());
        System.out.println(" e o saldo atual da conta é " + this.getSaldo());
        System.out.println("");
    }


    public void status() {
        System.out.println(
                        "Titular: " + this.getTitular().getNome()
                        + "\nTipo de conta: " + tipo
                        + "\nAgência: " + agencia
                        + "\nNúmero da conta: " + numeroDaConta
                        + "\nSaldo: " + saldo
                        + "\nStatus da conta: " + this.contaAberta
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

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
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

    public int getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(int mensalidade) {
        this.mensalidade = mensalidade;
    }
}
