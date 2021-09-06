package ContaBancaria;

public class ContaCorrente extends Conta{

    public ContaCorrente(int agencia, int numeroDaConta, String titular ) {
        this.setTipo("Conta Corrente");
        this.setAgencia(agencia);
        this.setTitular(titular);
        this.setNumeroDaConta(numeroDaConta);
        this.abrirConta();
    }

    @Override
    void abrirConta() {
        this.setSaldo(50);
        this.setStatus(true);
    }

    @Override
    void fecharConta() {
        if(this.isStatus()  && this.getSaldo() == 0){
            this.setStatus(false);
        }else{
            System.out.println("Conta não pode ser fechada");
        }
    }

    @Override
    void pagarMensalidade() {
        this.setSaldo(getSaldo() - 5);
    }
}
