import java.util.Scanner;

public class MiEntradaSalida{
    public static String leerCadena (String mensaje){
        Scanner teclado = new Scanner(System.in);
        System.out.println(mensaje + ":");
        String CadenaIntroducida = teclado.nextLine();
        return CadenaIntroducida;
    }


    public static int leerEntero (String mensaje){
        Scanner teclado = new Scanner(System.in);
        System.out.println(mensaje +":");
        int enteroIntroducido = Integer.parseInt(teclado.nextLine());
        return enteroIntroducido;
    }
}
