public class PrimitiveTypeRecapandStringDataType {

    public static void main(String[] args) {

        // byte
        // short
        // int
        // long
        // double
        // char
        // boolean
        String myString = "this is my string";
        System.out.println("my string is equal to=" +myString);
        myString = myString + ", this is more";
        System.out.println("my string is equal to=" +myString);
        myString = myString + "\u00A9 2020";
        System.out.println("my string is equal to=" + myString);
        String numberString ="250.55";
        numberString = numberString+ "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString+ myInt;
        System.out.println("last string is equal to=" + lastString);
        double DoubleNumber = 120.47d;
        lastString= lastString+ DoubleNumber;
        System.out.println("last string is equal to" + lastString);
        

    }
}
