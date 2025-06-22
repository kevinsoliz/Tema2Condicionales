package ControlFlow;

public class SwitchStatements {
    public static void main(String[] args) {
        String role = "admin";

        switch(role) {
            case "admin":
                System.out.println("You are an admin");
                break;
            case "user":
                System.out.println("You are a user");
                break;
            default:
                System.out.println("You are a guest");
        }
    }
}
