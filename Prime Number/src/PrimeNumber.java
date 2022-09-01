import java.util.Scanner;

//this is program to find prime number betwenn 100 and 200
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Prime numbers between 100 and 200");

		////initialize the numbers between whom we want to check prime number
        int low = 100, high = 200;

        //to check prime number between the numbers
        while (low < high) {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) {
            	
                // condition for non prime number
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && low != 0 && low != 1)
                System.out.print(low + " ");//final result

            ++low;
        }
    }
}