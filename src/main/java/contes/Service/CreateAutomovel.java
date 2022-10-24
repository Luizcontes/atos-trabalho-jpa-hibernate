package contes.Service;

import java.util.Scanner;

import contes.Repository.Automovel;

public class CreateAutomovel {
    
    Automovel automovel = new Automovel();
    Scanner scanner;

    public CreateAutomovel(Scanner scanner) {
        this.scanner = scanner;
    }

    public Automovel persist() {

        System.out.println("");
        System.out.println("CADASTRAR NOVO AUTOMOVEL");
        System.out.println("");
        System.out.print("Placa: ");
        automovel.setPlaca(scanner.nextLine());
        System.out.print("Marca: ");
        automovel.setMarca(scanner.nextLine());
        System.out.println("Modelo: ");
        automovel.setModelo(scanner.nextLine());
        System.out.print("Versao: ");
        automovel.setVersao(scanner.nextLine());
        
        System.out.print("Ano: ");
        while(true) {
            try {
                automovel.setAno(scanner.nextInt());
                break;
            } catch (Exception e) {
                System.out.println("Ano inserido com formato invalido");
                scanner.nextLine();          
            }
        }

        scanner.nextLine();
        return automovel;
    }
}
