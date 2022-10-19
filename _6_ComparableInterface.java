package generics;

/**
 *
 * @Sir Darey
 */


public class _6_ComparableInterface {
    private static class Data <T extends Comparable<T>> implements Comparable<T>{ 
        private final T myVar;

        public Data(T myVar) {
            this.myVar = myVar;
        }
        
        public T getMyVar() {
            return myVar;
        }

        @Override
        public int compareTo(T o) {
            return o.compareTo(getMyVar());
        }      
    }
    
    public static void main(String[] args) { 
        Data <String> data = new Data<>("abc");
        System.out.println(data.compareTo("acb"));
    }
}
