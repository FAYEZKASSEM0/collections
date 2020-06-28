package test2;

import java.util.HashMap;
import java.util.Scanner;

public class Test2 {
    static HashMap<String, Integer> names = new HashMap<>();
    static String name = null;
    static int employeenum = 0;
    static Scanner t = new Scanner(System.in);
    static Scanner z = new Scanner(System.in);

    
    static int ifthere(String name) {
        System.out.print("please enter the payment value: ");
        int pay = t.nextInt();
        int prepay = names.get(name);
        return pay + prepay;
    }
    
    public static void main(String[] args) {
        System.out.println("how many employee do you have? ");
        employeenum = t.nextInt();

        for (int i = 0; i < employeenum; i++) {
            System.out.print("enter an employee name: ");
            name = z.nextLine();
            names.put(name, 0);
        }
        
        System.out.println("please enter the employee name: ");
        
        for (; ; ) {
            name = z.nextLine();
            if ("0".equals(name)) 
                break;
            else if (names.containsKey(name)) 
                names.put(name, ifthere(name));
            else 
                System.out.println("you entered a wrong name please try again");
            
            System.out.println("if you want another operation enter the name of the employee, if you don't enter \"0\"");
        }

        System.out.println(names);
    }
}
