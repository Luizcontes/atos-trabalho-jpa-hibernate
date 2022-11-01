package contes;

import java.util.Scanner;

import contes.Service.CreateAutomovel;
import contes.Service.CreateCliente;
import contes.Service.CreateContrato;
import contes.Service.Default;
import contes.Service.DestroyAutomovel;
import contes.Service.DestroyCliente;
import contes.Service.GetAutomovel;
import contes.Service.GetCliente;
import contes.Service.GetContrato;
import contes.Service.ListAutomovel;
import contes.Service.ListCliente;
import contes.Service.ListContrato;

public class App {
    public static void main(String[] args) {

        @SuppressWarnings("unused")
        org.jboss.logging.Logger logger = org.jboss.logging.Logger.getLogger("org.hibernate");
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(java.util.logging.Level.OFF);

        Scanner scanner = new Scanner(System.in);
        boolean manter = true;

        while (manter) {
            Context context = new Context(new Default(scanner));

            String opcao = Message.menuPrincipal(scanner);

            switch (opcao) {
                case "S":
                case "s":
                    Message.printEnd();
                    manter = false;
                    break;
                case "00":
                    context = new Context(new GetContrato(scanner));
                    break;
                case "01":
                    context = new Context(new CreateContrato(scanner));
                    break;
                case "02":
                    context = new Context(new GetAutomovel(scanner));
                    break;
                case "03":
                    context = new Context(new CreateAutomovel(scanner));
                    break;
                case "04":
                    context = new Context(new DestroyAutomovel(scanner));
                    break;
                case "05":
                    context = new Context(new GetCliente(scanner));
                    break;
                case "06":
                    context = new Context(new CreateCliente(scanner));
                    break;
                case "07":
                    context = new Context(new DestroyCliente(scanner));
                    break;
                case "08":
                    context = new Context(new ListContrato(scanner));
                    break;
                case "09":
                    context = new Context(new ListAutomovel(scanner));
                    break;
                case "10":
                    context = new Context(new ListCliente(scanner));
                    break;
                default:
                    Message.printEnd("\nOpcao incorreta...", scanner);
                    break;
            }
            context.executeStrategy();
        }
        scanner.close();
    }
}
