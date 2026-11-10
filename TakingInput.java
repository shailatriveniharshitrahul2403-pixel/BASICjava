import java.util.Scanner;
public class TakingInput {
    void main(){
        Scanner rahul =new Scanner(System.in);
        IO.println("enter the age");
        int age = rahul.nextInt();
        IO.println("YOUR AGE IS:"+age);
        rahul.close();
    }
    
}
