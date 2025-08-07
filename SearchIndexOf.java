import java.util.ArrayList;
import java.util.Collections;


public class SearchIndexOf {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 4,5,8,3,9,7,10);
        int target = 9;
        int indexOf = numbers.indexOf(target);
        if(indexOf != -1){
            System.out.println("Index of the "+ target + " is: " + indexOf);
        }else {
            System.out.println("No such number found");
        }
    }
}
