public class LengthOfLastWord {
   static int lengthOfLastWord (String s){
        s = s.trim();
        int lastSpaceIndex = s.lastIndexOf( ' ');
        return s.length() - lastSpaceIndex - 1 ;
    }

    public static void main(String[] args) {
       String input = "Checking length of last word  " ;
       int result= lengthOfLastWord(input);
        System.out.println("Given String is: " + input );
        System.out.println("Length of last word: " + result);
    }
}
