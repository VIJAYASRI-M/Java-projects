package Examples;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class SetAndMap {
    public static void main(String[] args) {
        //    	Set<Integer> nums=new HashSet<Integer>(); -- unsorted 	
        //    	Set<Integer> nums=new TreeSet<Integer>(); -- sorted
    	Collection<Integer> nums=new TreeSet<Integer>();
    	nums.add(62);
    	nums.add(54);
    	nums.add(82);
    	nums.add(21);
    	
    	Iterator<Integer> values = nums.iterator();
    	
    	while(values.hasNext())
    		System.out.println(values.next());
    	
        for(int n:nums)
        {
            System.out.println(n);
        }

        /**
         * MAP
         */
        //    	Map<String, Integer> students=new HashMap<>(); --Async
    	Map<String, Integer> students=new Hashtable<>(); //--sync
    	
    	students.put("Navin",56);
    	students.put("Harsh",23);
    	students.put("Sushil",67);
    	students.put("Kiran",92);
    	students.put("Harsh",45);
    	
    	System.out.println(students.keySet());// return all keys
    	
    	for(String key : students.keySet())
    	{
    		System.out.println(key + ":" + students.get(key));
    	}
    }
}
