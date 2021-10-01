package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
        public static void main(String []argh){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of entries: ");
        int n = in.nextInt();
        Map<String, Integer> phoneBook = new HashMap<>();

        for(int i = 0; i < n; i++){
            System.out.print("Enter name: ");
            String name = in.next();
            System.out.print("Enter phone number: ");
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name, phone);
        }

        System.out.print("What name do you want to look up in the phone book? ");
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (s != null) {
                if (phoneBook.containsKey(s)) {
                    System.out.println(s + "=" + phoneBook.get(s));
                }else {
                    System.out.println("Not found");
                }
            }
        }
        in.close();
    }
}
