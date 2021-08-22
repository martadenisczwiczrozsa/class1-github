package exerciseReturnListPerson;

import exerciseReturnListPerson.entity.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        //h - crie uma classe chamada Pessoa que contém um campo: um id (int).
        // Então crie um método que recebe um int chamado "targetId", uma lista de pessoas; e retorna uma outra lista de pessoas.
        // O método deve retornar todas as pessoas que possuirem o id igual ao targetId

        Scanner sc = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();
        personList.add(new Person(123));
        personList.add(new Person(22));
        personList.add(new Person(4));
        personList.add(new Person(123));
        personList.add(new Person(7));

        System.out.printf("Enter a target number: ");
        int targetId = sc.nextInt();


        List<Person> numbersList = getPerson(personList, targetId);
        System.out.println(numbersList);
        sc.close();

    }

    public static List<Person> getPerson(List<Person> personList, int targetId){

        List<Person> resultList = new ArrayList<>();

        for(int i = 0; i < personList.size(); i++) {

            Person person = personList.get(i);
            Integer currentNumber = person.getId();

            if(currentNumber == targetId){
                resultList.add(person);
            }
        }
        return resultList;

    }
}

