public class Main {
    public static void main(String[] args) {
        System.out.println("Númerosprimos");
        for (int i = 2; i <= 1000; i++) {
            boolean esPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                }
            }
            if (esPrimo == true) {
                System.out.print(" " + i + ",");
            }
        }
    }
}