package contes.Service;

import java.util.Scanner;

import contes.Strategy;

public class Default implements Strategy{
    
    Scanner scanner;

    public Default(Scanner scanner) {
        this.scanner = scanner;
    }

    public void execute() {
        System.out.print("");
    }
}
