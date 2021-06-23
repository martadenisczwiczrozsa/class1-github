package exercise6;

import exercise6.entity.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        List<Person> people = getPerson(n);
        System.out.println(people.toString());

    }
    public static List<Person> getPerson(int n) {
        List<Person> people = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int id = i;
            Person person = new Person(id);
            people.add(person);
        }
        return people;
    }
}
