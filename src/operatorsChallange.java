public class operatorsChallange {
    public static void main (String[]args) {

        double firstNumber = 20.00d;
        double secondNumber = 80.00d;
        double sumTotal = ( firstNumber + secondNumber)*100;
        System.out.println("sum of First and Second number is =" + sumTotal);
        double theRemainder = sumTotal % 40.00d;
        System.out.println("remainder will be" + theRemainder);

        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("is No remainder =" +isNoRemainder);
        if (!isNoRemainder){
            System.out.println("got some remainder");

        }



    }
}
