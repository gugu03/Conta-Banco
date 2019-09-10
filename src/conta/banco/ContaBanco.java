package conta.banco;
public class ContaBanco {
    public static void main(String[] args) {
        //Criou a conta de Luis
        Conta p1 = new Conta();
        p1.setNumConta(11111);
        p1.setDono("Luis");
        p1.abrirConta("CC");
        
        //Criou a conta de Luisa
        Conta p2 = new Conta();
        p2.setNumConta(22222);
        p2.setDono("luisa");
        p2.abrirConta("CP");
        
        //Depositou na conta de luis e luisa 
        p1.depositar(100);
        p2.depositar(500); 
        
        //Sacou na conta de Luis e Luisa 
        p1.sacar(100);
        p2.sacar(200);
        p1.sacar(38);
        
        //Pagar mensalidade
        p1.pagarMensal();
        p2.pagarMensal();
        
        //Fechar conta
        p1.fecharConta();
        
        //Mostra o estado atual da conta do Luis e da Luisa
        p1.estadoAtual();
        p2.estadoAtual();
    }
    
}
