import java.util.Scanner;
public class MainCalculadora {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Calculadora calculadora = new Calculadora();
       int opcion;

       do {
           System.out.println("Calculadora");
           System.out.println("1. Sumar");
           System.out.println("2. Restar");
           System.out.println("3. Multiplicar");
           System.out.println("4. Dividir");
           System.out.println("5. Salir");
           System.out.print("Elija una opción: ");

           opcion = scanner.nextInt();

           if (opcion == 5) {
               System.out.println("¡Hasta luego!");
               break;
           }

           System.out.print("Ingrese el primer número: ");
           double num1 = scanner.nextDouble();
           System.out.print("Ingrese el segundo número: ");
           double num2 = scanner.nextDouble();

           double resultado = 0;

           switch (opcion) {
               case 1:
                   resultado = calculadora.sumar(num1, num2);
                   break;
               case 2:
                   resultado = calculadora.restar(num1, num2);
                   break;
               case 3:
                   resultado = calculadora.multiplicar(num1, num2);
                   break;
               case 4:
                   resultado = calculadora.dividir(num1, num2);
                   break;
               default:
                   System.out.println("Opción no válida.");
                   continue;
           }

           System.out.println("El resultado es: " + resultado);
       } while(4<=opcion);

       scanner.close();
   }
}