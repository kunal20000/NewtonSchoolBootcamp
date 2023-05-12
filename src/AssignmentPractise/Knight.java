package AssignmentPractise;

public class Knight {
    static int Knight(int X, int Y){
//Ener your code here
        int count =0;
        if(X+1<=8 && Y-2>=1){
            count++;
        }
        if(X+1<=8 && Y+2<=8){
            count++;
        }
        if(X-1 >=1 && Y-2>=1){
            count++;
        }
        if(X-1>=1 && Y+2<=8){
            count++;
        }
        if(X-2>=1 && Y-1>=1){
            count++;
        }
        if(X-2>=1 && Y+1<=8){
            count++;
        }
        if(X+2<=8 && Y-1>=1){
            count++;
        }
        if(X+2<=8 && Y+1<=8){
            count++;
        }
        return count;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        Knight(x,y);
    }
}
