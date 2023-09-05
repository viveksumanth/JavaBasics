package learnjava.comparableinterface.sortinreverseorder;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortInReverseOrder {
    public static void main(String[] args) {
        
        final ReverseNumber five1 = new ReverseNumber(5);
        final ReverseNumber two = new ReverseNumber(2);
        final ReverseNumber five2 = new ReverseNumber(5);
        final ReverseNumber nine = new ReverseNumber(9);
        final ReverseNumber minusTwelve = new ReverseNumber(-12);
        
        List<ReverseNumber> numberList = new ArrayList<>(Arrays.asList(
             five1, two, five2, nine, minusTwelve
        ));
        
        Collections.sort(numberList);

        for(ReverseNumber eachNumber: numberList) {
            System.out.println(eachNumber.getNum());
        }
    }
}