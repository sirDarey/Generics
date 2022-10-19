package generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @Sir Darey
 */

/*
 There are 5 Type Parameters when it comes to Generics in Java

    1. T - Type
    2. E - Element
    3. K - Key
    4. V - Value
    5. N - Number
*/

public class _4_GenericMethods {
    
    private static class Data {
        public <T> void printArrayData(T [] data) {
            for (T element : data) 
                System.out.print(element + " ");
            System.out.println();
        }
        public <T> void printListData(List <T> data) {
            for (T element : data) 
                System.out.print(element + " ");
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Data data = new Data();
        
        Integer [] intArray = {5,6,7,8};
        String [] stringArray = {"one", "two", "three"};
        data.printArrayData(intArray);
        data.printArrayData(stringArray);
        
        List <Integer> intList = new ArrayList<>();
        List <String> stringList = new ArrayList<>();
        
        intList.add(5);
        intList.add(6);
        intList.add(7);
        intList.add(8);
        data.printListData(intList);
        
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        data.printListData(stringList);
    }
}
