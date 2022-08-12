public class Ej3_TiposDeDatos {
    public static void main(String[] args) {
        int numberInt = 123456789;
        long numberLong = 12345678910L;

        double numberDouble = 123.456;
        float numberFloat = 123.45678910F;

        var employeName = "Claudio Borja";
        var salary = 1000;
        var pension = salary*0.03;
        var totalSalary = salary - pension;

        System.out.println(employeName + " SALARY: " + salary + " PENSION: " + pension + " TOTAL SALARY: " + totalSalary);

    }
}
