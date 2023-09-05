package learnjava.comparators.sortbycomparators;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortByComparators {
    public static void main(String[] args) {
        
        final Person vivek = new Person(5, "Vivek", 24, 25000);
        final Person sumanth = new Person(1, "Sumanth Chintakula", 34, 250000);
        final Person anoosha = new Person(7, "Anoosha Seelam", 25, 45000);
        final Person lakshmi = new Person(12, "Lakshmi", 31, 23000);

        final List<Person> personList = new ArrayList<>(Arrays.asList(
             sumanth, vivek, anoosha, lakshmi
        ));
        
        // comperator interface
        System.out.println("\nsorting by person age:");
        Collections.sort(personList, new PersonAgeComparator());
        for(Person eachPerson: personList) {
            System.out.println(eachPerson.getName() + " " + eachPerson.getAge());
        }

        System.out.println("\nsorting by person salary: ");
        Collections.sort(personList, new PersonSalaryComparator());
        for(Person eachPerson: personList) {
            System.out.println(eachPerson.getName() + " " + eachPerson.getSalary());
        }
        
        // comparable interface
        System.out.println("\nsorting by person name length: ");
        Collections.sort(personList);
        for(Person eachPerson: personList) {
            System.out.println(eachPerson.getName());
        }
        
        // comperator with anonymous inner class
        Comparator<Person> rollNumberComparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if (p1.getId() > p2.getId()) {
                    return 1;
                } else if (p1.getId() < p2.getId()) {
                    return -1;
                } 
                return 0;
            }
        };

        Collections.sort(personList, rollNumberComparator);
        System.out.println("\nsorting by person id: ");
        for(Person eachPerson: personList) {
            System.out.println(eachPerson.getName() + " " + eachPerson.getId());
        }
    }
}