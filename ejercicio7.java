import java.util.Scanner;

public class ejercicio7 {
    static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numeros;
        do {
            System.out.println("Introduce los números que quieras");
            numeros = teclado.nextInt();
            if (numeros <= 0) {
                System.out.println("Inserta un número positivo");
            }
        } while (numeros <= 0);
        int suma = 0 ;
        for (int i = 0; i < numeros; i++){
            System.out.println("Introduce número " + i);
            suma = suma + teclado.nextInt();

        }
        System.out.println("La media es " + (double) suma / numeros);

    }
}
