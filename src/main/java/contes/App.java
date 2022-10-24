package contes;

import java.time.LocalDate;
import java.util.Scanner;

import contes.Database.LocadoraDb;
import contes.Repository.Cliente;
import contes.Service.GetContrato;
import contes.Service.CreateCliente;
import contes.Service.CreateContrato;
import contes.Service.GetCliente;

public class App 
{
    public static void main( String[] args )
    {
        LocadoraDb con = new LocadoraDb();
        Scanner scanner = new Scanner(System.in);

        // Pessoa pessoa = new Pessoa();
        // pessoa.setName("luluzinha");
        // con.persist(pessoa);
        
        // LocalDate data = LocalDate.parse("2020-10-08");
        
        // data = data.plusDays(3);
        // System.out.print(data);
        
        
        boolean manter = true;
      
        while (manter) {
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
                    manter = false;
                    break;
                case "00":
                    // logic = new GetContrato();
                    // logic.persist(scanner);
                    break;
                case "01":
                    // logic = new CreateContrato();
                    // logic.persist(scanner);
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
                    // logic = new GetCliente();
                    // logic.persist(scanner);
                    break;
                case "07":
                    CreateCliente createCliente = new CreateCliente(scanner);
                    Cliente cliente = createCliente.persist();
                    con.persist(cliente);
                    break;
                case "08":
                    // DestroyCliente
                    break;
                case "09":
                    break;
                case "10":
                    break;
                case "11":
                    break;
                default:
                    System.out.print("\nOpcao incorreta...");
                    scanner.nextLine();
            }
        }
        // con.close();
        scanner.close();
    }
}
