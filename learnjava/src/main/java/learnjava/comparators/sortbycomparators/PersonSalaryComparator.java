package learnjava.comparators.sortbycomparators;

import java.util.Comparator;

public class PersonSalaryComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        if (p1.getSalary() > p2.getSalary()) {
            return 1;
        } else if (p1.getSalary() < p2.getSalary()) {;
            return -1;
        } else {
            return 0;
        }
    }
    
}
