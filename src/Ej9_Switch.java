public class Ej9_Switch {
    public static void main(String[] args) {
        String colorModeSelected = "Ligth";
        switch (colorModeSelected){
            case "Ligth":
                System.out.println("Seleccionaste Ligth Mode");
                break;
            case "Nigth":
                System.out.println("Seleccionaste Nigth Mode");
                break;
            case "Blue Dark":
                System.out.println("Seleccionaste Blue Dark Mode");
                break;
            case "Dark":
                System.out.println("Seleccionaste Dark Mode");
                break;
            default:
                System.out.println("Selecciona una opción valida");
        }
    }
}
