package contes;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import contes.Repository.Pessoa;

public class App 
{
    public static void main( String[] args )
    {

        EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("teste");
        EntityManager entityManager = entityFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Pessoa pessoa = new Pessoa();
        pessoa.setName("pessoinha");
        entityManager.persist(pessoa);

        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println( "SISTEMA DE ALGUEL DE CARROS\n" );
            System.out.println("S - SAIR");
            System.out.println("00 - BUSCAR UM CONTRATO DE LOCACAO");
            System.out.println("01 - INICIAR NOVO CONTRATO DE LOCACAO");
            System.out.println("02 - FINALIZAR CONTRATO DE LOCACAO LOCACAO");
            System.out.println("03 - BUSCAR UM AUTOMOVEL");
            System.out.println("04 - CADASTRAR AUTOMOVEL");
            System.out.println("05 - DESCADASTRAR AUTOMOVEL");
            System.out.println("06 - BUSCAR UM CLIENTE");
            System.out.println("07 - CADASTRAR CLIENTE");
            System.out.println("08 - DESCADASTRAR CLIENTE");
            System.out.println("09 - LISTAR TODOS OS CONTRATOS DE LOCACAO");
            System.out.println("10 - LISTAR TODOS OS VEICULOS");
            System.out.println("11 - LISTAR TODOS OS CLIENTES");
            System.out.print("Escolha uma opcao: ");
            String opcao = scanner.nextLine();
        
            switch(opcao) {
                case "S":
                case "s":
                    System.out.println("bye bye");
                    scanner.close();
                    System.exit(0);
                    break;
                case "00":
                    break;
                case "01":
                    break;
                case "02":
                    break;
                case "03":
                    break;
                case "04":
                    break;
                case "05":
                    break;
                case "06":
                    break;
                case "07":
                    break;
                case "08":
                    break;
                case "09":
                    break;
                case "10":
                    break;
                case "11":
                    break;
                default:
                    System.out.println("Default!!!");
            }
        }
    }
}
