package exerciseGetListPerson.entity;

public class Person {

    private String name;
    private int id;
    private String nameId;

    public Person() {
    }

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Person(String nameId, String name, int id) {
        this.nameId = nameId;
        this.name = name;
        this.id = id;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameId() {
        return nameId;
    }

    public void setNameId(String nameId) {
        this.nameId = nameId;
    }

    @Override
    public String toString() {
        return name + '\n' +
               nameId
                ;
    }
}
