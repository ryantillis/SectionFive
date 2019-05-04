public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        int range = 0;

        if(first > second){range = second;} else{range = first;}

        if(first < 10 || second < 10){return -1;}

        int testNumber = 1;
        int common = 0;


        while(testNumber <= range){

            testNumber++;
            if(first % testNumber == 0 && second % testNumber == 0 && testNumber > common){
                common = testNumber;

            }

        }

    return common;}

}
