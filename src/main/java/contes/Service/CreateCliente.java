package contes.Service;

import java.util.Scanner;

import contes.Repository.Cliente;

public class CreateCliente {

    Cliente cliente = new Cliente();
    Scanner scanner;

    public CreateCliente(Scanner scanner) {
        this.scanner = scanner;
    }

    public Cliente persist() {
        

        System.out.println("");
        System.out.println("CADASTRAR NOVO CLIENTE");
        System.out.println("");
        System.out.print("Nome: ");
        cliente.setNome(scanner.nextLine());
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

        scanner.nextLine();
        return cliente;
    }
    
}
