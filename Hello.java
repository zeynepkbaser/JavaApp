public class Hello {

    public static void main(String[] args) {
/*

        
    *
   ***
  *****
 *******
*********


*/
      

     System.out.println("Hello from Java");

        for (int i = 1; i <= 5; i++) {
            // Print leading spaces
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            // Print asterisks for the current row
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }

        
    }
}
