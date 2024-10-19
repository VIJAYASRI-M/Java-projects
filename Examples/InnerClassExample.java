package Examples;

class ClassA {
        public void print(){
            System.out.println("Inner class example");
        }

         static class InnerClass {
            public void printInnerclass(){
                System.out.println("Inside Inner class");
            }
        }
}

class InnerClassExample{
    public static void main(String args[]){

        ClassA obj = new ClassA();
        obj.print();
        // Examples.ClassA.InnerClass obj1 = obj.new InnerClass(); if the Innerclass is not static
        Examples.ClassA.InnerClass obj1 = new Examples.ClassA.InnerClass();
        obj1.printInnerclass();
    }
}