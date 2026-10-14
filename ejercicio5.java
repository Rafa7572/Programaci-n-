import java.util.Scanner;

public class ejercicio5 {
    static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

      boolean salir = false;
      int numeros = 1;

      String inpput ="";
      while (!salir){
          System.out.println("Escriba un numero positivo , escriba uno negativo para terminar");
          int n = teclado.nextInt();

          if (n < 0){
              salir = true;

          }else {
              numeros ++;
          }
      }

    }
}
