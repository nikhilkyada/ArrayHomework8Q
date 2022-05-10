import java.util.Arrays;

public class Q1EqualityoftwoArrey {

    public static void main(String[] args){
        //Initialized Int Arrays a and b
        int [] a = {1,2,3};
        int [] b = {1,2,3};

        //To compare 2 arrays= i used 'equals()' inbuilt method
        boolean equels= Arrays.equals(a,b);
        System.out.println("Equality of Two Array is "+equels );
    }
}
