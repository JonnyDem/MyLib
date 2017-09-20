package mylib;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ваня on 20.09.2017.
 */
public class MyLib {


    public static List<Integer> getOddNumbers(List<Integer> list) {
        List<Integer> oddNumbers = new ArrayList<Integer>();
        for(int i:list){
            if (i % 2 != 0) {
                oddNumbers.add(i);
            }
        }
        System.out.println(oddNumbers);
        return oddNumbers;
    }


    public static List<Integer> getEvenNumbers(List<Integer> list) {
        List<Integer> evenNumbers = new ArrayList<Integer>();
        for(int i:list){
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
        System.out.println(evenNumbers);
        return evenNumbers;
    }
}
