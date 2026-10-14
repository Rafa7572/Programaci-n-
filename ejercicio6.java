import java.util.Scanner;

public class ejercicio6 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("dime un numero");
        int n1 = teclado.nextInt();

        System.out.println("dime otro numero");
        int n2 = teclado.nextInt();
        int resultado= 0;

        for (int i = 0; i < n2; i++){
            resultado = resultado + n1;

        }
        System.out.println("el resultado es " + resultado);
        
    }
}
