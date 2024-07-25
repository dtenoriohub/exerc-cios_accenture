package Sample_04_ContaBanco;

import java.util.Date;
import javax.swing.JOptionPane;

public class ContaCorrente {
    private int number;
    private String name;
    private double balance;
    private Date date;
    private Cliente cliente;

    public ContaCorrente() {}

    public ContaCorrente(int number, String name, double balance, Date date, Cliente cliente) {
        this.number = number;
        this.name = name;
        this.balance = balance;
        this.date = date;
        this.cliente = cliente;
    }

    // Depositar
    public void deposit(double deposit) {
        setBalance(getBalance() + deposit);
        JOptionPane.showMessageDialog(null, "Depósito bem-sucedido!");
        System.out.println(getBalance());
    }

    // Sacar
    public void withdraw(double withdraw) {
        if (getBalance() < withdraw) {
            JOptionPane.showMessageDialog(null, "Valor insuficiente para o saque.");
        } else {
            setBalance(getBalance() - withdraw);
            JOptionPane.showMessageDialog(null, "Saque bem-sucedido, saldo restante: " + getBalance());
        }
    }

    // Exibir extrato
    public void showExtract() {
        JOptionPane.showMessageDialog(null, "Número da conta: " + getNumber() + "\nSaldo da conta: " + getBalance());
    }

    // Transferir
    public void transfer(double amount, ContaCorrente destinationAccount) {
        if (getBalance() - amount < 0) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para transferência.");
        } else {
            withdraw(amount);  // Usa o método withdraw para garantir a consistência
            destinationAccount.deposit(amount);  // Usa o método deposit para garantir a consistência
            JOptionPane.showMessageDialog(null, "Transferência bem-sucedida! Saldo atual: " + getBalance());
        }
    }

    // Getters e Setters
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
