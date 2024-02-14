package DSA_Sheet;

public class lengthOFLastWord {

    public static int lengthOFLastWordString(String s){
        String[] words = s.split(" ");

        if(words.length == 0){
            return 0;
        }

        return words[words.length-1].length();

    }

    public static void main(String[] args) {
        String s = "Hello World";
        int res = lengthOFLastWordString(s);

        System.out.println(res);
    }
}
