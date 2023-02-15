public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(Person person) {
        this.name = person.name;
        this.age = person.age;
    }
}