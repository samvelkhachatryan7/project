package book;


import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Register {
    private final Scanner scanner = new Scanner(System.in);
    private final Map<String, String> registrationData = new HashMap<>();

    public String registration() {
        System.out.print("Enter your firstname: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your username: ");
        String userName = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        System.out.print("Confirm password: ");
        String confirmPassword = scanner.nextLine();
        if (!password.equals(confirmPassword)) {
            System.out.println("passwords aren't match, please fill all mandatory fields again");
            registrationData.clear();
            registration();
        }
        User user = new User(firstName, userName, password);
        Gson gson = new Gson();
        return gson.toJson(user);
    }

}

