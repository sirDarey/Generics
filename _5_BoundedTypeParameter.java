package generics;

/**
 *
 * @Sir Darey
 */

/*
 Adding boundaries to the data types helps to restrict the type of data that can be accepted by a generic method
*/

public class _5_BoundedTypeParameter {
    private static class Data <K, V> { // A Generic Class
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

        public <E extends String, N extends Number> void  display (E element, N number) { //A Bounded Generic Method
            //E and N can be of any type
            System.out.println("Element: "+element +"\tNumber: "+number);
        } 
    }
    
    public static void main(String[] args) {
        Data <Integer, String> data = new Data<>(1, "First");
        Data <Character, Double> data2 = new Data<>('b', 2.0);
        
        
        System.out.println("Key: "+data.getKey() +"\tValue: " +data.getValue());
        System.out.println("Key: "+data2.getKey() +"\tValue: " +data2.getValue());
        
        //data.display("String", "Number"); Gives error
        data.display("String", 2.0); //Works fine as arguments match the boundaries specified
    }
}
