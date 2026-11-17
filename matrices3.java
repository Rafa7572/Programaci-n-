import java.util.Arrays;
public class matrices3 {
    public static void imprimirMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {

        int[][] numeros = {
                {1, 3, 5},
                {0, 2, 7}
        };

        imprimirMatriz(numeros);
    }
}


