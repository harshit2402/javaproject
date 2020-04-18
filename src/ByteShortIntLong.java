public class ByteShortIntLong {

    public static void main(String[] args) {
 int myValue =10000;

      int myMinIntValue = Integer.MIN_VALUE;
      int myMaxIntValue = Integer.MAX_VALUE;
      System.out.println(" My minimum int value =" + myMinIntValue);
      System.out.println(" My maximum int value =" + myMaxIntValue);
      System.out.println("BUSTED Max Value =" + (myMaxIntValue+1));
      System.out.println("BUSTED Min Value =" +(myMinIntValue-1));

      int myMaxIntTest = 2147483637;
      Byte myMinByteValue = Byte.MIN_VALUE;
      Byte myMaxByteValue = Byte.MAX_VALUE;
      System.out.print("My minimum Byte value =" + myMinByteValue);
      System.out.print("My maximmum Byte value =" + myMaxByteValue);


        Short myMinShortValue = Short.MIN_VALUE;
        Short myMaxShortValue = Short.MAX_VALUE;
        System.out.print("My minimum Short value =" + myMinShortValue);
        System.out.print("My maximmum Short value =" + myMaxShortValue);

        Short bigShortLiteralValue =32767;

        Long myLongValue = 100L;
        Long myMinLongValue = Long.MIN_VALUE;
        Long myMaxLongValue = Long.MAX_VALUE;
        System.out.print("My minimum Long value =" + myMinLongValue);
        System.out.print("My maximmum Long value =" + myMaxLongValue);
        Long BigLongLiteralValue = 2147483637L;
        System.out.print("BigLongLiteralValue");

        int myTotal =(myMinIntValue/2);
        Byte myNewByteValue =(byte) (myMinByteValue/2);
        Short myNewShortValue =(short) (myMinShortValue/2);

    }
}
