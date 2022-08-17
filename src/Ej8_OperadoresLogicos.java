public class Ej8_OperadoresLogicos
{
    public static void main(String[] args) {
        int numeroUno = 8;
        int numeroDos = 5;

        System.out.println("a es igual a b? ->"+ (numeroUno == numeroDos));
        System.out.println("a es diferente de b? ->" + (numeroUno != numeroDos));

        System.out.println("a es mayor que b? ->" + (numeroUno > numeroDos));
        System.out.println("a es menor que b? ->" + (numeroUno < numeroDos));
        System.out.println("a es mayor o igual a b? ->" + (numeroUno >= numeroDos));
        System.out.println("a es menor o igual a b? ->" + (numeroUno <= numeroDos));

        if(numeroUno == numeroDos){
            System.out.println("a es igual a b");
        } else if (numeroUno != numeroDos) {
            System.out.println("a es diferente de b");
        } else if (numeroUno > numeroDos || numeroUno >= numeroDos ) {
            System.out.println("Numero uno es mayor o igual que numero dos");
        } else if (numeroUno < numeroDos || numeroUno <= numeroDos) {
            System.out.println("Numero uno es menor o igual a numero dos");
        }
    }
}
