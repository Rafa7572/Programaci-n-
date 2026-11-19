public class matriz12 {


        public static int[][] reflejarDiagonal(int[][] matriz) {

            // Comprobamos que la matriz sea cuadrada
            if (matriz.length != matriz[0].length) {
                System.out.println("La matriz no es cuadrada");
                return null;
            }

            int tamaño = matriz.length;

            // Creamos una matriz nueva
            int[][] resultado = new int[tamaño][tamaño];

            // Recorremos la matriz
            for (int i = 0; i < tamaño; i++) {
                for (int j = 0; j < tamaño; j++) {

                    resultado[i][j] = matriz[j][i];

                }
            }

            return resultado;
        }

        public static void main(String[] args) {

            int[][] matriz = {
                    {1, 2, 3, 4, 5},
                    {6, 7, 8, 9, 0},
                    {3, 2, 1, 4, 5},
                    {9, 5, 8, 6, 7},
                    {0, 9, 8, 5, 4}
            };

            int[][] reflejada = reflejarDiagonal(matriz);

            if (reflejada != null) {

                for (int i = 0; i < reflejada.length; i++) {
                    for (int j = 0; j < reflejada[i].length; j++) {
                        System.out.print(reflejada[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }

