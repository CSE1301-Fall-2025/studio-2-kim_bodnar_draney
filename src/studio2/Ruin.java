public class Ruin {
public static void main(String[] args){
    int startAmount = 2;
    double winChances = 0.70;
    double winLimit = 10;
    int totalSimulations = 50;
    int days = 0;
    int plays = 0;
    int totalLosses = 0;
    double lossRate;
    int totalPlays = 0;
   

    for (totalSimulations = 0; totalSimulations < 100; totalSimulations++) {
      
        while (startAmount > 0 && startAmount < winLimit) {
            plays++;
        if  (Math.random() > winChances) {
            startAmount++;
        } else {
            startAmount--;
        }

        }
        
        if(startAmount < 0){
            System.out.println("you win day " + days );
        } else {
            System.out.println("you lose day " + days );
            totalLosses++;

        }
        System.out.println("plays: " + plays);
        days++;

        totalPlays = plays + totalPlays;
        totalLosses = totalLosses + totalLosses;

        startAmount = 7;
        plays = 0;
   

    }
        System.out.println("total losses: " + totalLosses);

    System.out.println("total plays: " + totalPlays);
    lossRate = (totalLosses / totalPlays) * 100;
    System.out.println("expected ruin rate: " + lossRate + "%");
    
}

}
