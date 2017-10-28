import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Input for Y/N
        //Loop for run or exit program
        //For loop (3 iterations to select numbers)


        //Create Scanner object
        //Create Yes/No prompt
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to try your luck with the slot machine? Type 1 for YES or 2 for NO:");
        int answer = sc.nextInt();


        //Create If/Else based on Yes/No response
        //Create For loop to generate numbers
        //Convert int affirmation to string value

        if (answer == 1)
            {
            for (int i = 0; i <= 2; i++)
                {
                    double j = (Math.random() *10);
                    int k = (int) j;
                    System.out.print("["+k+"]");
                }
            }

            else
                {
            System.out.println("Maybe next time!");

                }
    }
}