package project;

public class Main {
    public static void main(String[] args) {
        Soldier soldier1 = new Soldier("Samvel");
        soldier1.setYear(1998);
        soldier1.setFirstName("Samvel");
        soldier1.setLastName("Khachatryan");
        soldier1.setMilitaryBookletId(33012);
        soldier1.setSubdivision("anti-tank battery");
        soldier1.setGender('M');
        soldier1.setPhone(123321);


        BatteryCommander batteryCommander = new BatteryCommander("Erem");
        batteryCommander.setFirstName("Erem");
        batteryCommander.setLastName("Amyan");
        batteryCommander.setYear(1990);
        batteryCommander.setSalary(800);
        batteryCommander.setExperience(8);
        batteryCommander.setGender('M');
        batteryCommander.setPhone(121212);


        soldier1.printInfo();
        System.out.println("------------");
        batteryCommander.printInfo();


        Serjeant serjeant = new Serjeant("Ando");
        serjeant.setFirstName("Ando");
        serjeant.setLastName("Karapetyan");
        serjeant.setMilitaryBookletId(12221);
        serjeant.setYear(1997);
        serjeant.setSubdivision("anti-tank battery");
        serjeant.setPhone(6566566);
        serjeant.setGender('M');
        serjeant.setDetachment("1st");
        serjeant.setLogo('^');
        serjeant.printInfo();

    }
}
