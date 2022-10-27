package contes.Repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "cliente")
public class Cliente {
 
    @Id
    private long cpf;
    private String nome;
    private String cnh;
    private String endereco;
    @Column(nullable = false)
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean ativo;
    
    public boolean isAtivo() {
        return ativo;
    }
    
    public long getCpf() {
        return cpf;
    }
    
    public void setCpf(Long cpf) {
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
            "\nCNH: " + cnh;
            
            return cliente;
        }
    }
    
    
    