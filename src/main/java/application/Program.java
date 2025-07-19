package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int numero1, numero2;
        String operador;

        System.out.println("Digite o primeiro numero: ");
        numero1 = sc.nextInt();
        System.out.println("Digite o operador da sua conta(+,-,*,/): ");
        operador = sc.next();
        System.out.println("Digite o segundo numero: ");
        numero2 = sc.nextInt();

        if (operador.equals("+")){
            System.out.println(numero1 + numero2);
        }else if(operador.equals("-")){
            System.out.println(numero1 - numero2);
        }else if(operador.equals("/")){
            System.out.println(numero1 / numero2);
        }else if(operador.equals("*")){
            System.out.println(numero1 * numero2);
        }else{
            System.out.println("numero incorreto, fechando sistema ...");
        }

        sc.close();
    }
}