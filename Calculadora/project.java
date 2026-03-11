package Calculadora;


import java.util.Scanner;
public class project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("---------- Bem vindo(a) a calculadora ----------");

            System.out.println("Digite o primeiro número: ");
            float num1 = sc.nextFloat();

            System.out.println("Digite o segundo número: ");
            float num2 = sc.nextFloat();

            String operador;

            while (true) {
                System.out.println("Escolha um operador: +, -, *, /");
                operador = sc.next();

                    if (operador.equals("+")||
                        operador.equals("-")||
                        operador.equals("*")||
                        operador.equals("/")) {
                        break;
                }
                System.out.println("Operador escolhido inválido, digite novamente");
            }


            if (operador.equals("+")) {
                System.out.println("O resultado da operação é: " + (num1 + num2));

            } else if (operador.equals("-")) {
                System.out.println("O resultado da operação é: " + (num1 - num2));

            } else if (operador.equals("*")) {
                System.out.println("O resultado da operação é: " + (num1 * num2));

            } else if (operador.equals("/")) {

                if (num2 == 0) {System.out.println("Número inválido");

                } else {
                    System.out.println("O resultado da operação é:" + (num1 / num2));
                }
            }
            System.out.println("Digite 1 se quiser continuar e digite 0 se quiser encerrar a calculadora:");
            int sn = sc.nextInt();

            if (sn == 0){
                break;

            } else if (sn == 1){

            } else {
                System.out.println("Número incorret!:");
            }
        }
        System.out.println("Calculadora encerrada !");
        sc.close();
    }
}
