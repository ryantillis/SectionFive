public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        int digitSum = 0;
        int testNumber = 0;

        //Case for negative number
        if(number < 0){return -1;}

        while(number > 0){

            //System.out.println("StartNumber = " + number);

            testNumber = number % 10;

            //System.out.println("TestNumber = " + testNumber);
            boolean isEven = false;

            if(testNumber % 2 == 0){isEven = true;}
            else {isEven = false;}

            if(isEven){
                digitSum += testNumber;
                number = number / 10;
                //System.out.println("DigitSum = " + digitSum);
                }
            else {
                number = number / 10;
                continue;}

        }

        //System.out.println("Digitsum = " + digitSum);

        return digitSum;

    }


}


