package contes.Service;

import java.util.Scanner;

import contes.Repository.Contrato;

public class CreateContrato {

    Contrato contrato = new Contrato();
    Scanner scanner;

    public CreateContrato(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public Contrato persist() {

        System.out.println("");
        System.out.println("INICIAR NOVO CONTRATO");
        System.out.println("");

        System.out.print("Numero cliente: ");
        contrato.cpf.getCpf(scanner.nextLine());

        System.out.print("Endereco: ");
        cliente.setEndereco(scanner.nextLine());
        System.out.print("CPF: ");
        while(true) {
            try {
                cliente.setCpf(scanner.nextInt());
                break;
            } catch (Exception e) {
                System.out.println("CPF inserido com formato invalido");
                scanner.nextLine();          
            }
        }
        System.out.println("Bye bye world");
        return contrato;
    }
    
}
