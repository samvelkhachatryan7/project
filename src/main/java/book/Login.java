package book;


import java.util.Scanner;

public class Login {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void loginToProgram(){
        System.out.println("please write your username: ");
        String userName = new Scanner(System.in).nextLine();
        System.out.print("please write your password: ");
        String password = new Scanner(System.in).nextLine();
        if (userName.equals(JsonFunctionality.getDataFromJson("userName"))
                && password.equals(JsonFunctionality.getDataFromJson("password"))) {
            System.out.println("welcome to programme dear: " + JsonFunctionality.getDataFromJson("name"));
        }
        else {
            System.out.println("username or password is incorrect, try again");
            loginToProgram();
        }
    }
}
