package Examples;
import java.util.List;
import java.util.ArrayList;


public class ArrayListExample {
    public static void main(String[] args) {
        //  Collection<Integer> nums= new ArrayList<Integer>();
        //  Collection nums=new ArrayList();
        List<Integer> nums=new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        // nums.add("5");

        System.out.println(nums.get(2));

        System.out.println(nums.indexOf(2));

        for(Object n:nums)
        {
            int num=(Integer)n; // instead of<Integer> but throws error in case of Line 15
            System.out.println(num);	
        }

        for(int n:nums)
        {
            System.out.println(n);	
        }
    }

    
}