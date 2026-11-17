public class matrices4 {


        public static void imprimirMatriz(int[][] matriz) {

            // Recorremos las filas desde la última hasta la primera
            for (int i = matriz.length - 1; i >= 0; i--) {

                // Recorremos las columnas desde la última hasta la primera
                for (int j = matriz[i].length - 1; j >= 0; j--) {

                    System.out.print(matriz[i][j] + " ");
                }
            }
        }

        public static void main(String[] args) {

            int[][] matriz = {
                    {1, 3, 5},
                    {0, 2, 7}
            };

            imprimirMatriz(matriz);
        }
    }

