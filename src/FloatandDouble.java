public class FloatandDouble {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println( "Float Minimum Value =" +myMinFloatValue);
        System.out.println("Float Maxmimum Value =" +myMaxFloatValue);


        double myMindoubleValue = Double.MIN_VALUE;
        double myMaxdoubleValue = Double.MAX_VALUE;
        System.out.println( "double Minimum Value =" +myMindoubleValue);
        System.out.println("double Maxmimum Value =" +myMaxdoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("my Int Value =" +myIntValue);
        System.out.println("my Float Value =" +myFloatValue);
        System.out.println("my Double Value =" +myDoubleValue);

        double NumberOfPounds = 200d;
        double ConvertedKilograms = NumberOfPounds * 0.45359237d;
        System.out.println("ConvertedKilograms =" +ConvertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3000000.4567890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}
