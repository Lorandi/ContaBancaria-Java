package Banco;

public class Main {
    public static void main(String[] args) {
        Cliente cacildo = new Cliente("Cacildo", "953754810-49", true);
        Cliente maria = new Cliente("Maria", "111222333444-49", false);

        ContaCorrente cc = new ContaCorrente(111,222,cacildo);
        cc.depositar(100);
        cc.pagarMensalidade();
//        cc.sacar(145);

        cc.fecharConta();




        ContaPoupança cp = new ContaPoupança(222,222,maria);
        cp.depositar(100);
        cp.pagarMensalidade();
        cp.sacar(300);

        cp.tranfere(100,cc);






    }
}
