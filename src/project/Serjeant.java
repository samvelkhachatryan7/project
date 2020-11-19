package project;

public class Serjeant extends Soldier {
    private String detachment;
    private char logo;
    public Serjeant(String firstName) {
        super(firstName);
    }

    public String getDetachment() {
        return detachment;
    }

    public void setDetachment(String detachment) {
        this.detachment = detachment;
    }

    public char getLogo() {
        return logo;
    }

    public void setLogo(char logo) {
        this.logo = logo;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Detachment: " + detachment);
        System.out.println("Logo: " + '^');
    }
}
