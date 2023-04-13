import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double area,base,altura,base_mayor;
        int opcion;

        System.out.println("¿Vas a calcular el área de cual figura?");
        System.out.println("1. Triángulo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Trapecio");
        System.out.println("Elige una opción");
        opcion = teclado.nextInt();
        switch (opcion)
        {
            case 1:
                System.out.println("¿Cúal es la altura del Triángulo?");
                altura = teclado.nextDouble();
                System.out.println("¿Cúal es la base del triangulo?");
                base = teclado.nextDouble();
                area= base*altura/2;
                System.out.println("El área del triángulo es: " + area);
                break;
            case 2:
                System.out.println("¿Cúal es la altura del rectángulo?");
                altura = teclado.nextDouble();
                System.out.println("¿Cúal es la base del rectángulo?");
                base = teclado.nextDouble();
                area = base*altura;
                System.out.println("El área del rectángulo es: " + area);
                break;
            case 3:
                System.out.println("¿Cúal es la altura del trapecio?");
                altura = teclado.nextDouble();
                System.out.println("¿Cúal es la base menor del trapecio?");
                base = teclado.nextDouble();
                System.out.println("¿Cúal es la base mayor del trapecio?");
                base_mayor = teclado.nextDouble();
                area = ( base + base_mayor ) / 2 * altura;
                System.out.println("El área del trapecio es: " + area);
                break;
            default:
                System.out.println("La opcion elegida no existe");
                break;
        }

    }
}