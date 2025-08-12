import java.util.HashMap;

public class FirstUniqueChar {
    public static int firstUniqChar(String s){
        HashMap<Character , Integer> count = new HashMap<>();

        for (char ch : s.toCharArray()){
            count.put(ch, count.getOrDefault(ch, 0)+1);
        }

        for (int i = 0; i < s.length(); i++){
            if (count.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s1 = "Mrunali";
        String s2 = "LoveLeetCode";
        String s3 = "aabb";

        System.out.println("First unique index in " + s1 + " " + firstUniqChar(s1));
        System.out.println("First unique index in " + s2 + " " + firstUniqChar(s2));
        System.out.println("First unique index in " + s3 + " " + firstUniqChar(s3));

    }
}
