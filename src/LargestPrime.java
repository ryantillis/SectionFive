public class LargestPrime {

    public static int getLargestPrime(int number) {

        int lastPrimeFactor = 0;

        if(number <= 1){return -1;}
        else{
            int testNumber = 0;
            while(testNumber <= number){
                testNumber++;

                //Identify factor to check for prime
                if(number % testNumber == 0){
                    boolean prime = true;
                    //Check remainder from 2 to test number
                    for (int i = 2; i < testNumber; i++) {if (testNumber % i == 0) {prime = false;}}
                 if(prime){lastPrimeFactor = testNumber;}
                }}}

        return lastPrimeFactor;}
}
