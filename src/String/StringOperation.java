package String;

public class StringOperation {

    public static void main(String[] args) {

        String s = new String("Kunal");
        // Get a character at a certain index
        char c2 = s.charAt(1);
        System.out.println(c2);

        // Convert string to character array
        char[] arr = s.toCharArray();
        System.out.println(arr);

        //if you want to combine two string
        String firstName = new String("Kunal");
        String lastName = new String("Sapate");

        String fullName = firstName +" "+ lastName;
        System.out.println(fullName);

        //if you want to find length of string
        System.out.println(fullName.length());

        System.out.println(s==firstName);
        //check equality of string
        System.out.println(s.equals(firstName));

        //extract of string:substring

        String subStr = s.substring(2,5);
        System.out.println(subStr);

    }
}
