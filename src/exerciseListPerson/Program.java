package exerciseListPerson;

import exerciseListPerson.entities.Person;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person(35));
        personList.add(new Person(25));
        personList.add(new Person(15));
        personList.add(new Person(23));
        personList.add(new Person(55));

        int biggest = 0;
        for (int i = 0; i < personList.size(); i++) {
            int current = personList.get(i).getAge();
            if (current > i) {
                biggest = current;
            }
        }
        System.out.println(biggest);



    }

}
