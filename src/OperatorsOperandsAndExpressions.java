public class OperatorsOperandsAndExpressions {

    public static void main(String[] args) {

        int result = 1+2; //1+2=3
        System.out.println("1+2 =" + result);
        int previousResult = result;
        System.out.println("previous Result =" + previousResult);
        result= result-1;
        System.out.println("3-1=" + result);
        System.out.println("previous Result =" + previousResult);

        result = result*10; // 2*10=20
        System.out.println("2*10=" +result);
        result =result/5;  //20/5=4
        System.out.println("20/5=" +result);
        result =result%3; //the remainder of 4%3=1
        System.out.println("remainder of 4%3 is=" +result);

        //result= result+1
        result++; //1+1=2
        System.out.println("1+1=" +result);
        result--; //2-1=1
        System.out.println("2-1=" +result);
        // result = result +2;
        result +=2; //1+2=3
        System.out.println("1+2=" +result);

        //result = result*10;
        result*= 10; //3*10=30
        System.out.println("3*10=" +result);

        //result =result/10;
        result/= 10; //30/10= 3
        System.out.println("30/10=" +result);

        //result= result-2;
        result-=2; //3-2=1
        System.out.println("3-2=" +result);

        boolean isAliean = false;
        if (isAliean == false) {
            System.out.println("it is not an alien!");
            System.out.println("and i am scared of aliens");

            int TopScore = 80;
            if (TopScore < 100) {
                System.out.println("you've got the high score");
            }
            int SecondTopScore = 85;
            if ((TopScore > SecondTopScore) && (TopScore<100)){
                System.out.println("greater than second top score and less than 100");
            }
            if ((TopScore>90)|| SecondTopScore<=90){
                System.out.println("either or both conditions are true");
            }

            int newValue = 50;
            if (newValue == 50){
                System.out.println("there is true");
            }
            boolean isCar = false;
            if (isCar !=true){
                System.out.println("this is not supposed to happen");
            }


        }

    }
}
