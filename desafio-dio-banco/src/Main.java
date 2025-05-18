public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setNome("Banco Digital DIO");
        
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Silvia Libras");
        
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Venilton Dio");
        
        Conta cc = new ContaCorrente(cliente1, banco); 
        Conta poupanca = new ContaPoupanca(cliente2, banco); 
        
        cc.depositar(1000);
        poupanca.depositar(500);
        cc.transferir(200, poupanca);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato(); 
    }
}