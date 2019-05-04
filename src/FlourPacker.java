public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        //Bigcount is count of large flour bags. 5 kilos each
        //Smallcount is count of small flour bags. 1 kilo each
        //Goal is the amount of kilos needed to assemble a package
        //Only full bags

        int originalGoal = goal;

        //Handling negative numbers
        if(bigCount < 0 || smallCount < 0 || goal < 0){return false;}

        int bcKilos = 0;
        int scKilos = 0;
        int totalKilos = 0;


        while(bigCount > 0){
            if((bcKilos + 5) <= goal){bcKilos += 5;}
            bigCount--;
        }

        goal = goal - bcKilos;

        while(smallCount > 0){
            if((scKilos + 1) <= goal){scKilos += 1;}
            smallCount--;
        }

        totalKilos = scKilos + bcKilos;


        if(originalGoal == totalKilos){return true;} else {return false;}
//        System.out.println("BC = " + bcKilos);
//        System.out.println("SC = " + scKilos);
//        System.out.println("Total = " + totalKilos);
//        System.out.println("Original Goal = " + originalGoal);

    }

}
