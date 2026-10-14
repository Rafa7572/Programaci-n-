import java.util.Scanner;

public class ejercicio4 {
    static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int cantidad = 0;
        do {
            System.out.println("Intoduce un numero");
            cantidad = teclado.nextInt();

            if (cantidad <=0){
                System.out.println("debe ser mayor que positivo o mayor que 0");
            }
        }while (cantidad <=0);

        int suma = 0;
        for (int n1 = 1; n1 <= cantidad; n1++){
            suma=suma + n1;
        }
        System.out.println("la suma total es" +suma);
    }
}
