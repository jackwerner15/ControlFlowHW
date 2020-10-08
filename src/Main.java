public class Main {

    public static void main(String[] args) {
        
          // #1.
        //  The value of K after the for loop is run will be 20 (C).  
        //  We know that we start with i = 0 and run the condition until i =4 
        // Thus, the loop would iterate as:
        // i = 0 : 80=80-12=68
        // i = 1 : 68=68-12 = 56
        // i = 2 : 56=56-12 = 44
        // i = 3 : 44=44-12 = 32
        // i = 4 : 32=32-12 = 20
        // i = 5, loop breaks

        // so K = 20


        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
            
        




        




