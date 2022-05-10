import java.util.Scanner;

public class Q3_StringCount {

    public static void main(String args[]){

        int temp = 0; //Temporory variable

        System.out.println("Enter any sentence to count a or A :");
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();


        for (int i =0;i<a.length();i++){
            char b =a.charAt(i);

            if (b=='a'||b=='A'){
                temp++;
            }
        }
        System.out.println("Number of a and A in the sentance is = "+temp);

    }
}
