package BasicOfProgramming;

public class Find_Monopoly {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int s = sc.nextInt();

        if(p>=(q+r+s)){
            System.out.println("true");
        }else if(q>=(r+s+p)){
            System.out.println("true");
        }else if(r>=(s+q+p)){
            System.out.println("true");
        }else if(s>=(p+q+r)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
