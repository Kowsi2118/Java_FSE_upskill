public class TypeCastingExample {
    public static void main(String[] args) {
        double doubleValue = 10.99;
        int intValue = (int) doubleValue; 
        System.out.println("Double to Int: " + intValue);
        int intVar = 42;
        double doubleVar = intVar;
        System.out.println("Int to Double: " + doubleVar);
    }
}

