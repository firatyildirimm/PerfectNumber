import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int control=0;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        for(int i=1;i<number;i++){
            if(number%i==0){
                control+=i;
            }
        }
        if(control == number){
            System.out.println(number + " is a perfect number.");
        }else{
            System.out.println(number + " is not a perfect number.");
        }

    }
}
