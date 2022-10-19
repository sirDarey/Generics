package generics;

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

class Data <K, V> { // A Generic Class
    //K and V can be of any type
    
    private final K key;
    private final V value;

    public Data(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
    
    public <E, N> void  display (E element, N number) { //A Generic Method
        //E and N can be of any type
        System.out.println("Element: "+element +"\tNumber: "+number);
    }
}

public class _3_TypeParameters {
    
    public static void main(String[] args) {
        Data data = new Data(1, "First");
        Data data2 = new Data('b', 2.0);
        
        
        System.out.println("Key: "+data.getKey() +"\tValue: " +data.getValue());
        System.out.println("Key: "+data2.getKey() +"\tValue: " +data2.getValue());
        
        data.display("String", "Number");
        data.display(9, 5.5);
        data.display('c', 8.6f);
    }
}
