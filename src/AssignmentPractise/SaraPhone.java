package AssignmentPractise;

public class SaraPhone {
    static int Phone(int N, int K, int M){
//Enter your code here
        int minApps =(int) Math.ceil((double)M/K);
        if(minApps>N){
            return -1;
        }else{
            return minApps;
        }

    }
}
