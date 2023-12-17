package ArraysBasic;



public class SubArrays {
    static void subArrays(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                //printsubarrays
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
            }
        }

    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//       int n  =sc.nextInt();
//        int[] arr=new int[n];
        int[] arr= new int[]{1,2,3,4};
       subArrays(arr);
       System.out.println();
//            for(int i=0;i<n;i++){
//                System.out.print(arr[i]+" ");
//            }
    }
}
