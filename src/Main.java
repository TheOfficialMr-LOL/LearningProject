
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
       
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        int[] sample_num={2,1,43,5,2};
        for(int i:sample_num) {
            numbers.add(i);
        }
        
        Collections.sort(numbers);
        System.out.println(numbers);

        
    }
}
