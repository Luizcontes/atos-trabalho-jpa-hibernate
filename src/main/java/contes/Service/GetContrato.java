package contes.Service;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import contes.Message;
import contes.Strategy;
import contes.Repository.Cliente;

public class GetContrato implements Strategy{

    EntityManagerFactory entityFactory;
    EntityManager entityManager;

    Scanner scanner;

    public GetContrato(Scanner scanner) {
        this.scanner = scanner;
        entityFactory = Persistence.createEntityManagerFactory("teste");
        entityManager = entityFactory.createEntityManager();
    }

    public void execute() {
        
        System.out.println("BUSCAR CLIENTE");
        
        System.out.print("\nDigite o numero do CPF do cliente que deseja buscar: ");
            long cpf = scanner.nextLong();
            scanner.nextLine();
        
        Cliente cliente = entityManager.find(Cliente.class, cpf);

        if (cliente == null) {
            Message.printEnd("\nNa ha cliente cadastrado com este cpf...", scanner);;
        } else {
            System.out.println(cliente);
            Message.printEnd("\nPressione qualquer tecla para voltar ao menu anterior...", scanner);
        }

    }
}
