public class FactorPrinter {

    public static void printFactors(int number) {

        String factorString = "";

        if(number < 1){
            System.out.println("Invalid Value");}
        else{

            int testNumber = 0;


            while(testNumber <= number){

                testNumber++;
                if(number % testNumber == 0){
                    factorString += " " + testNumber;

                }

            }

            System.out.println(factorString.substring(1));}

        }

}
