package Examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int compareTo(Student comparableStudent) {
        if(this.age > comparableStudent.age)
            return 1;
        else
            return -1;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}

public class ComparableAndComparator {
    public static void main(String[] args) {
        /**
         * Comparator
         */
        Comparator<Integer> com =new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                if(o1%10>o2%10)
                    return 1;
                else
                    return -1;
            }
        };

        Comparator<Student> Studcomparator =new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                if(o1.age>o2.age)
                    return 1;
                else
                    return -1;
            }
        };
        
        List<Integer> nums = new ArrayList<>();
        nums.add(21);
        nums.add(78);
        nums.add(62);
        nums.add(87);
        Collections.sort(nums,com);
        System.out.println(nums);

        List<Student> studsList = new ArrayList<>();
        studsList.add(new Student(21, "VijayaSri"));
        studsList.add(new Student(22, "Sabarish"));
        studsList.add(new Student(22, "Ronaldo"));
        Collections.sort(studsList,Studcomparator);
        for(Student s : studsList){
            System.out.println(s);
         }
        System.out.println("------");

        /**
         * Comparable
         */

         List<Student> studs = new ArrayList<>();
         studs.add(new Student(21, "VijayaSri"));
         studs.add(new Student(22, "Sabarish"));
         studs.add(new Student(22, "Ronaldo"));
         Collections.sort(studs);
         for(Student s : studs){
            System.out.println(s);
         }
    }
}
