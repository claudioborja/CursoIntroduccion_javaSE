import java.util.Scanner;
public class Ej11_doWhile {
    public static void main(String[] args) {
        int respuesta = 0;
        do {
            System.out.println("Selecciona el número de la opción deseada");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Salir");

            Scanner lector = new Scanner(System.in);
            respuesta = Integer.valueOf(lector.nextLine());

            switch (respuesta){
                case 0:
                    System.out.println("Salir");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                default:
                    System.out.println("Selecciona una opción correcta");
            }
        } while (respuesta != 0);
    }
}