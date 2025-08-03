public class ReverseString {
    public static void reverseString (char[] s){
        int left = 0;
        int right = s.length-1;

        while (left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
    public static void main(String[] args)
    {
       // char[] s = {'H', 'E', 'L', 'L', 'O'};
        char[] s = {'M', 'R', 'U', 'N', 'A', 'L', 'I'};
        System.out.println("Original string : " + new String(s));
        reverseString(s);
        System.out.println("Reversed string : " + new String(s));
    }
}
