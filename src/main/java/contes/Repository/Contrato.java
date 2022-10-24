package contes.Repository;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Contrato {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int nContrato;
    @ManyToOne
    private Cliente cpf;
    @ManyToOne
    private Automovel placa;
    private double preco;
    private LocalDate data;
    private Period periodo;

    
    public Cliente getCpf() {
        return cpf;
    }
    public void setCpf(Cliente cpf) {
        this.cpf = cpf;
    }
    public Automovel getPlaca() {
        return placa;
    }
    public void setPlaca(Automovel placa) {
        this.placa = placa;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public Period getPeriodo() {
        return periodo;
    }
    public void setPeriodo(Period periodo) {
        this.periodo = periodo;
    }

    

}
