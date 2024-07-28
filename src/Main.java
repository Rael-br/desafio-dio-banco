public class Main {
    
    public static void main (String[] args){
        Cliente Israel = new Cliente();
        Israel.setNome("Israel");
        
        
        Conta cc = new ContaCorrete(Israel);
        Conta poupanca = new ContaPoupanca(Israel);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato(); 
    }
}
