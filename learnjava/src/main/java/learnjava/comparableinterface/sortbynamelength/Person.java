package learnjava.comparableinterface.sortbynamelength;

public class Person implements Comparable<Person> {

    private String name;

    Person(final String name) {
        this.name = name;
    }

    @Override
    public int compareTo(final Person other) {
        // sort in asending order
        return this.name.length() - other.name.length();
    }

    public String getName() {
        return this.name;
    }
}