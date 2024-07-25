package Sample_04_ContaBanco;

public class Cliente {
    ContaCorrente contaCorrente;
    
    private String name;
    private String CPF;
    private String lastName;
    
    public Cliente() {
    }
    
    public Cliente(String name, String CPF, String lastName) {
        this.name = name;
        this.CPF = CPF;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
}
