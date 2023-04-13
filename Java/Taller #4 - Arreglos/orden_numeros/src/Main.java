public class Main {

    public static int[][] numeros;
    public static void llenar(int[][] numeros){
        int k = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                numeros[i][j] = k;
                k++;
            }
        }
    }

    public static void llenarforma(int[][] numeros){
        int k = 6 , residuo;
        for (int i = 0; i < 4; i++) {
            residuo = i % 2;
            if (residuo!=0) {
                for (int j = 4; j >= 0; j--) {
                    numeros[i][j] = k;
                    k++;
                }
                k=k+5;
            }
        }
    }

    public static void mostrar(int[][] numeros){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (numeros[i][j] <10){
                    System.out.print("0" + numeros[i][j] + " ");
                }
                else {
                    System.out.print(numeros[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        numeros = new int[4][5];
        llenar(numeros);
        mostrar(numeros);
        System.out.println();
        llenarforma(numeros);
        mostrar(numeros);
    }

}