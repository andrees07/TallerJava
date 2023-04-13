public class Main {
    public static void main(String[] args) {
        int tamaño=10,i=0,j;
        while (i<10) {
            j=0;
            while (j<10){
                if (j >= tamaño) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            tamaño--;
            i++;
        }
    }
}