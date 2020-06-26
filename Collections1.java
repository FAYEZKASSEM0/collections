package collections1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Collections1 {

    public static void main(String[] args) {
        System.out.println("please enter a number: ");
        ArrayList<Integer> nums = new ArrayList<>();
        int count[] = new int[10];
        Scanner t = new Scanner(System.in);
        int num = 1;
        for (int i = 0; num != 0; i++) {
            System.out.print("enter another number or enter 0 to finish");
            num = t.nextInt();
            if (num != 0) {
                nums.add(num);
                count[num] = count[num] +1;
            } else {
                break;
            }
        }
        TreeSet<Integer> set = new TreeSet<>(nums);
        System.out.println(set);
         for (int i = 0; i < 10; i++) 
            System.out.println(i + " .... > " + count[i]);
        }

    }
