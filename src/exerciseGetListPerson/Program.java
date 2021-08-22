package exerciseGetListPerson;

import exerciseGetListPerson.entity.Person;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        // i - crie uma classe chamada Pessoa que contém dois campos: um id (int) e um nome (String).
        // Depois, crie um método (na classe Programa/Main) que recebe um número (int) chamado 'N'  e devolve uma lista de pessoas.
        // O método deve criar e devolver N pessoas (quantidade que veio no tamanho). O id de cada pessoa deve ir de 0 até N-1;
        // o nome de cada pessoa deve ser "Gandalf" com o id da pessoa concatenado no nome (ex.: pessoa com id 5, o nome deve ser "Gandalf5")

        int n = 5;

        List<Person> resultList = getListPerson(n);

        for (int i = 0; i < resultList.size(); i++) {
            Person person = resultList.get(i);
            System.out.println(person.getNameId());
            System.out.println(person.getName());
        }
    }

    public static List<Person> getListPerson(int n){
        List<Person> resultList = new ArrayList<>();

        for (int i = 0; i < n; i ++) {
            int id = i;
            String nameId = "Gandalf" + id ;
            String name = "Gandalf" ;
            Person person = new Person(nameId, name, id);
            resultList.add(person);
        }
        return resultList;
    }

}
