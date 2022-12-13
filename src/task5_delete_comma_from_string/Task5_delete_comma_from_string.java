/*
 * delete comma(,) from string
 * mohamed ahmed elsayed elfikey
 * id 1900306
 */
package task5_delete_comma_from_string;
import java.util.Scanner;


public class Task5_delete_comma_from_string {

 
    public static void main(String[] args) {
        String my_name_with_comma="mohamed,ahmed,elsayed";
        String my_name_without_comma=my_name_with_comma.replace(",", " "); // used repalace function to repalace "," to "space"
        System.out.println("my_name_after replacement is "+my_name_without_comma);
             
        
        
    }
    
}
