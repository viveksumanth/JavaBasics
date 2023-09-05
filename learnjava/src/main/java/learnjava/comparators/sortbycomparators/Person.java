package learnjava.comparators.sortbycomparators;

public class Person implements Comparable<Person> {

    private int id;
    private String name;
    private int age;
    private int salary;

    Person(final int id, final String name, final int age, final int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Person other) {
        // sort in asending order
        return this.name.length() - other.name.length();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getSalary() {
        return this.salary;
    }
}