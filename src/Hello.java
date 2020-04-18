public class Hello {
    public static void main(String [] args){
        System.out.println("hello harshit");

        int myFirstNumber =(10+5)+(20*2);
        int mySecondNumber =(10+2);
        int myThirdNumber =(mySecondNumber*2);
        int myTotalNumber =(myFirstNumber+mySecondNumber+myThirdNumber);
        int myLastNumber =(1000-myTotalNumber);
        System.out.println(myLastNumber);
        HelloWorld obj = new HelloWorld();
        obj.printHello();
        obj.printWorld();
    }

}
