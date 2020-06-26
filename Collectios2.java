package collectios2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Collectios2 {

    public static void main(String[] args) {
        System.out.println("how many employee do you have? ");
        Scanner t = new Scanner(System.in);
        Scanner z = new Scanner(System.in);

        int employeenum = t.nextInt();
        HashMap<String, Integer> names = new HashMap<>();
        String name = null;
        for (int i = 0; i < employeenum; i++) {
            System.out.print("enter an employee name: ");
            name = z.nextLine();
            names.put(name, 0);
        }

        for (int i = 0; !"0".equals(name); i++) {
            System.out.println("please enter the employee name: ");
            name = z.nextLine();
            if ("0".equals(name)) {
                break;
            }
            if (names.containsKey(name)) {
                System.out.print("please enter the payment value: ");
                int pay = t.nextInt();
                int prepay = names.get(name), totalpay = pay + prepay;
                names.put(name, totalpay);
                System.out.println("if you want another operation enter the name of the employee, if you don't enter \"0\"");
            } else {
                System.out.println("you entered a wrong name please try again");
            }
        }
        System.out.println(names);
    }

}
