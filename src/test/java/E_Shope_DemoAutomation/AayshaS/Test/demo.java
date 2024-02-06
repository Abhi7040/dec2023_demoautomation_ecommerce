package E_Shope_DemoAutomation.AayshaS.Test;

public class demo {

        // Static variables
        static int age = 20;
        static String name = "Shri";
        int num=90;

        // Instance method
      public void test() {
            // 1. Access by using class name (Recommended way)
            System.out.println(demo.age);
            System.out.println(demo.name);

            // 2. Direct access
            System.out.println(age);
            System.out.println(name);
//         System.out.println(num);  //non static variable can't access into static method

            // 3. Using object reference
            demo obj = new demo();
            System.out.println(obj.age);
            System.out.println(obj.name);
            data();
        }

        public static void data(){

        }

        // Static method
        public static void main(String[] args) {
            // 1. Access by using class name (Recommended way)
            System.out.println(demo.age);
            System.out.println(demo.name);

            // 2. Direct access
            System.out.println(age);
            System.out.println(name);


        }}
