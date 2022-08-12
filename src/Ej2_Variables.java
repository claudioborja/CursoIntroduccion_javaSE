public class Ej2_Variables {
    public static void main(String[] args) {
        int speed;
        speed = 10;
        System.out.println(speed);

        int salary = 1000;
        String firstname = "Claudio Borja";

        System.out.println("My name is, "+ firstname + " and my salary is " + salary);

        int bonus = 200;
        salary += bonus;

        System.out.println("My bonus is " + bonus + " and my salary whit bonus is " + salary);

        String lastname = "Saltos";
        String fullname;
        fullname = firstname + lastname;

        System.out.println("My full name is: " +fullname);

    }
}
