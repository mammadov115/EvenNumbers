import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        number = input.nextInt();


        System.out.println("Even numbers up to the entered number");
        for(int i = 1;i<=number;i++){
            if(i%2 == 0){
                System.out.println(i);   
            }
        }

        
    }
}
