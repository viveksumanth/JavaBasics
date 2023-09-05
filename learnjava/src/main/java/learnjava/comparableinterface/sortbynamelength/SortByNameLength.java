package learnjava.comparableinterface.sortbynamelength;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortByNameLength {
    public static void main(String[] args) {
        final Person vivek = new Person("Vivek"); //(length 5)
        final Person sumanth = new Person("Sumanth Chintakula"); // (length 18)
        final Person anoosha = new Person("Anoosha Seelam"); // length 14
        final Person lakshmi = new Person("Lakshmi"); // length 7

        final List<Person> personList = new ArrayList<>(Arrays.asList(
             sumanth, vivek, anoosha, lakshmi
        ));
        
        Collections.sort(personList);

        for(Person eachPerson: personList) {
            System.out.println(eachPerson.getName());
        }
    }
}
