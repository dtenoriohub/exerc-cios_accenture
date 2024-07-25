package Sample_04_ContaBanco;

import java.util.Date;
import javax.swing.JOptionPane;

public class PrincipalContaCorrente {

    public static void main(String[] args) {
        // Instanciar a classe ContaCorrente
        ContaCorrente conta1 = new ContaCorrente(1, "Conta 1", 0.0, new Date(), null);
        ContaCorrente conta2 = new ContaCorrente(2, "Conta 2", 0.0, new Date(), null);

        // Instanciar clientes
        Cliente cliente1 = new Cliente("Danilo", "40028922", "Tenorio");
        Cliente cliente2 = new Cliente("Fulano", "23922392", "Cicrano");

        // Associar clientes às contas
        conta1.setCliente(cliente1);
        conta2.setCliente(cliente2);
        cliente1.setContaCorrente(conta1);
        cliente2.setContaCorrente(conta2);

        // Exibir saldo inicial da conta1
        
        JOptionPane.showMessageDialog(null, "Saldo inicial da conta 1: R$ " + conta1.getBalance());
        JOptionPane.showMessageDialog(null, "Saldo inicial da conta 2: R$ " + conta2.getBalance());


        // Fazer um depósito
        String deposito = JOptionPane.showInputDialog("Qual valor do depósito?");
        conta1.deposit(Double.parseDouble(deposito));

        String saque = JOptionPane.showInputDialog("qual valor do saque?");
        conta1.withdraw(Double.parseDouble(saque));
        
        // exibir saldo inicial da conta2
        JOptionPane.showMessageDialog(null,"Saldo inicial da conta 2: "+ conta2.getBalance());

        // Exibir nome dos clientes das contas 1 e 2
        JOptionPane.showMessageDialog(null, "Nome do cliente da conta 1: " + conta1.getCliente().getName());
        JOptionPane.showMessageDialog(null, "Nome do cliente da conta 2: " + conta2.getCliente().getName());

        // Transferir fundos de conta1 para conta2
        String transferencia = JOptionPane.showInputDialog("qual valor da transferencia?");
        conta1.transfer(Double.parseDouble(transferencia), conta2);
        
        
        conta1.showExtract();
        conta2.showExtract();
        
    }
}
