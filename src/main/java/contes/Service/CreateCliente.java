package contes.Service;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import contes.Message;
import contes.Strategy;
import contes.Repository.Cliente;

public class CreateCliente implements Strategy {

    EntityManagerFactory entityFactory;
    EntityManager entityManager;

    Scanner scanner;

    public CreateCliente(Scanner scanner) {
        this.scanner = scanner;
        entityFactory = Persistence.createEntityManagerFactory("teste");
        entityManager = entityFactory.createEntityManager();
    }

    public void execute() {

        Cliente cliente = new Cliente();
        cliente.setAtivo(true);

        System.out.println("");
        System.out.println("CADASTRAR NOVO CLIENTE");
        System.out.println("");
        System.out.print("Nome: ");
        cliente.setNome(scanner.nextLine());
        System.out.print("Endereco: ");
        cliente.setEndereco(scanner.nextLine());

        while (true) {
            try {
                System.out.print("CPF: ");
                cliente.setCpf(scanner.nextLong());
                break;
            } catch (Exception e) {
                System.out.print("\nCPF inserido com formato invalido...");
                scanner.nextLine();
            } finally {
                scanner.nextLine();
            }
        }

        System.out.print("CNH: ");
        cliente.setCnh(scanner.nextLine());

        try {

            Cliente tmp = entityManager.find(Cliente.class, cliente.getCpf());
            // System.out.println(tmp);

            if (tmp == null) {
                entityManager.getTransaction().begin();
                entityManager.persist(cliente);
                entityManager.getTransaction().commit();
                entityManager.close();
                Message.printEnd("\nCliente cadastrado com sucesso...", scanner);
            } else {
                tmp.setAtivo(true);
                entityManager.getTransaction().begin();
                entityManager.merge(tmp);
                entityManager.getTransaction().commit();
                entityManager.close();
                Message.printEnd("\nCliente ja existe na base de dados, cliente reativado...", scanner);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
