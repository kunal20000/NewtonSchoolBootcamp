package String;

public class DeclareString {
    public static void main(String[] args) {
        String way1 = "kunal";
        String way4 = "kunal";

        String way2 = new String("kunal");

        String way3 = new String("sapate");

        System.out.println(way2==way3);
        System.out.println(way1==way4);

    }
}
