package generics;

/**
 *
 * @Sir Darey
 */



public class _2_UnderstandingGenerics {
    private static class GenericClass <T> {
        private T data;

        public GenericClass(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }
    }
    
    public static void main(String[] args) {
        GenericClass <String> generic = new GenericClass<>("Some String");
        String data = generic.getData();
        System.out.println(data);
    }
}
