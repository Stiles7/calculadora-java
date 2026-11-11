import java.util.*;
import java.lang.Math;

public class Main {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Calculadora calculo = new Calculadora();

         ArrayList<String> historico = new ArrayList<>();

         int escolherOP;
         int desligar = 1;
         double num1;
         double num2;

         do {
             System.out.println("======= Calculadora =======");

             System.out.println("1 - Somar");
             System.out.println("2 - Subtrair");
             System.out.println("3 - Multiplicar");
             System.out.println("4 - Dividir");
             System.out.println("5 - Potência");
             System.out.println("6 - Raiz quadrada");
             System.out.println("7 - Historico");

             System.out.print("Escolha uma opção: ");

             escolherOP = sc.nextInt();

             if (escolherOP < 1 || escolherOP > 7) {
                 System.out.println("Opção invalida.");

                 System.out.println("1 - Continuar");
                 System.out.println("0 - Desligar Calculadora");

                 desligar = sc.nextInt();

                 continue;
             }

             switch (escolherOP) {
                 case 1:
                     System.out.print("Digite primeiro numero: ");
                     num1 = sc.nextDouble();

                     System.out.print("Digite segundo numero: ");
                     num2 = sc.nextDouble();
                     System.out.println("Resultado: " + calculo.somar(num1, num2));
                     historico.add(num1 + " + " + num2 + " = " + calculo.somar(num1, num2));
                     break;

                 case 2:
                     System.out.print("Digite primeiro numero: ");
                     num1 = sc.nextDouble();

                     System.out.print("Digite segundo numero: ");
                     num2 = sc.nextDouble();
                     System.out.println("Resultado: " + calculo.subtrair(num1, num2));
                     historico.add(num1 + " - " + num2 + " = " + calculo.subtrair(num1, num2));

                     break;

                 case 3:
                     System.out.print("Digite primeiro numero: ");
                     num1 = sc.nextDouble();

                     System.out.print("Digite segundo numero: ");
                     num2 = sc.nextDouble();
                     System.out.println("Resultado: " + calculo.multiplicar(num1, num2));
                     historico.add(num1 + " * " + num2 + " = " + calculo.multiplicar(num1, num2));
                     break;

                 case 4:
                     System.out.print("Digite primeiro numero: ");
                     num1 = sc.nextDouble();

                     System.out.print("Digite segundo numero: ");
                     num2 = sc.nextDouble();
                     if (num2 == 0){
                         System.out.println("Não é possivel dividir por zero.");
                     }
                     else {
                         System.out.println("Resultado: " + calculo.dividir(num1, num2));
                         historico.add(num1 + " / " + num2 + " = " + calculo.dividir(num1, num2));
                     }
                     break;

                 case 5:
                     System.out.print("Digite a base: ");
                     num1 = sc.nextDouble();

                     System.out.print("Digite expoente: ");
                     num2 = sc.nextDouble();

                     System.out.println("Resultado: " + calculo.potencia(num1, num2));
                     historico.add(num1 + " ^ " + num2 + " = " + calculo.potencia(num1, num2));
                     break;

                 case 6:
                     System.out.print("Digite um numero: ");
                     num1 = sc.nextDouble();
                     if (num1 < 0){
                         System.out.println("Não existe raiz quadrada real de número negativo.");
                     }
                     else {
                         System.out.println("Resultado: " + calculo.raizquadrada(num1));
                         historico.add("√" + num1 + " = " + calculo.raizquadrada(num1));
                     }
                     break;
                 case 7:
                     if (historico.isEmpty()) {
                         System.out.println("Nenhuma operação realizada.");
                     } else {
                         System.out.println("===== Historico da operação =====");
                         for (String operacao : historico) {
                             System.out.println(operacao);
                         }

                     }
                     break;
             }

             System.out.println("0 - Desligar Calculadora");
             System.out.println("1 - Continuar");

             desligar = sc.nextInt();

             if (desligar > 1 || desligar < 0) {
                 System.out.println("Opção invalida, desligando calculadora\n.\n.\n.\n.");
                 break;
             }

         } while (desligar != 0);
         System.out.println("===== Calculadora Desligada =====");
         sc.close();
     }
}