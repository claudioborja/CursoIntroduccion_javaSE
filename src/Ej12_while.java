public class Ej12_while {
    static boolean isTurnOnLigth = false;
    public static void main(String[] args) {
        turnOnOffLigth();
        int contador = 0;

        while(isTurnOnLigth && contador < 10){
            printSOS();
            contador++;
        }
    }

    public static void printSOS(){
        System.out.println("... ___ ...");
    }

    public static boolean turnOnOffLigth(){
        isTurnOnLigth = (isTurnOnLigth)?false:true;
        return isTurnOnLigth;
    }
}
