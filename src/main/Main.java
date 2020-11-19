package main;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.setMark("BMW");
        auto.setModel("525i");
        auto.setYear(2008);
        auto.setFourMatic(true);
        System.out.println(auto.mark + " " + auto.model);
        System.out.println(auto.isFourMatic);


        Auto auto2 = new Auto();
        auto2.setMark("Opel");
        auto2.setModel("Calibra");
        auto2.setYear(2004);
        System.out.println(auto2.getModel());

        Human h = new Human();
        h.setFirstName("Aram");
        System.out.println(h.getFirstName());


        auto.printFullName();
        auto2.printFullName();


        System.out.println(auto.getYear());

    }
}
