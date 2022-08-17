public class Ej10_funciones {
    public static void main(String[] args) {
        double radio = 3;
        System.out.println("Area del circulo: "+ Math.ceil(circleArea(radio)));
        System.out.println("Pesos a dolares: " + convertToDolar(500, "COP"));

    }
    public static double circleArea(double radio){
        return Math.PI * Math.pow(radio,2);
    }

    public static double sphereArea(double radio){
        return 4 * Math.PI * Math.pow(radio,2);
    }

    public static double sphereVolumen(double radio){
        return (4/3) * Math.PI * Math.pow(radio, 3);
    }

    /**
     * Descripción: Función que especificando su moneda convierte una cantidad de dinero a dolares
     *
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en dolares
     *
     * */
    public static double convertToDolar(double quantity, String currency){
        switch (currency){
            case "MXN":
                quantity = quantity * 0.52;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }
}
