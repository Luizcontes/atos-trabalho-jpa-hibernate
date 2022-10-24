package contes.Repository;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {
 
    @Id
    private int cpf;
    private String nome;
    private String cnh;

    
    private String endereco;
    private boolean ativo;
    
    public boolean isAtivo() {
        return ativo;
    }
    
    public int getCpf() {
        return cpf;
    }
    
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Cliente() {
        this.ativo = true;
    }

    @Override
    public String toString() {

        String cliente =  "\nNome: " + nome +
            "\nEndereco: " + endereco +
            "\nCPF: " + cpf +
            "CNH: " + cnh;
            
            return cliente;
        }
    }
    
    
    