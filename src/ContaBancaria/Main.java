package ContaBancaria;

public class Main {
    public static void main(String[] args) {
/*        ContaCorrente cc = new ContaCorrente(111,222,"Cacildo");
        cc.depositar(100);
        cc.pagarMensalidade();
        cc.sacar(145);
        cc.fecharConta();
        cc.fecharConta();*/



        ContaPoupança cp = new ContaPoupança(222,222,"Maria");
        cp.depositar(100);
        cp.fecharConta();
        cp.pagarMensalidade();
        cp.sacar(300);
        cp.status();


    }
}
