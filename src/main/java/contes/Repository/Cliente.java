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
    private String endereco;
    private boolean ativo;

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Cliente() {
        
    }

    public Cliente(int cpf, String nome, String endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.ativo = true;
    }

    public Cliente(int cpf, String nome, String endereco, boolean ativo) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.ativo = ativo;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {

        String cliente =  "\nNome: " + nome +
            "\nEndereco: " + endereco +
            "\nCPF: " + cpf;
        
        return cliente;
    }
}


