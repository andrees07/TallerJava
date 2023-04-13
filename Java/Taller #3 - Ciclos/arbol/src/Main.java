public class Main {
    public static void main(String[] args) {
        int i = 0,in=9, j ,filas = 15,columnas = 21,tamaño = 10;

        do {
            j = 1;
            tamaño = tamaño - 1;
            do {
                    if (i <= 10) {
                    if (j <= (columnas / 2)-1) {
                        if (j > tamaño) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    } else if (j > columnas / 2) {
                        if (j > in) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                }
                if (i > 10 & i <= 12) {
                    if (j >= 9 & j < 12) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (i > 12 & i < columnas) {
                        if (j >= 8 & j < 13) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                j++;
            }while   (j < columnas);
            System.out.println();
            i++;
            in++;
        }while (i<filas);
    }
}