package project;

public class Soldier extends Human implements Shoot {
    private String subdivision;
    private int militaryBookletId;
    public Soldier(String firstName){
        super(firstName);
    }

    public String getSubdivision() {
        return subdivision;
    }

    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }

    public int getMilitaryBookletId() {
        return militaryBookletId;
    }

    public void setMilitaryBookletId(int militaryBookletId) {
        this.militaryBookletId = militaryBookletId;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Subdivision: " + subdivision );
        System.out.println("MilitaryBookletId: " + militaryBookletId);

    }

    @Override
    public void shoot() {
        System.out.println("efficiency 30%");
    }
}
