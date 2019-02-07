
package countbyanything;
import java.util.Scanner;

public class CountByAnything {

    
    public static void main(String[] args) {
        int start;
        int end = 300;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter count by value: ");
        int next = input.nextInt();
        for(start = 3; start <= end; start = start + next){
            count++;
            System.out.println(start + " ");
            if(start % 30 == 0){
                System.out.println("");
                count = 0;
            }
        }
    }
    
}
