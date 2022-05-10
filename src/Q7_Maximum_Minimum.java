public class Q7_Maximum_Minimum {

    public static void main(String[] args) {
        int[] a={8,3,0,10,20,1,30,40,50}; //Array is declared

        int max=a[0]; //Maximum temporary  variable
        int min=a[0]; //Minimum temporary variable

        //To find out Minimum
        for (int s=1;s<a.length;s++)
        {
            if (a[s]<min)
            {
                min=a[s]; //"compare every index value with 0 index value, if found ,it will declare that vale minimum
            }
        }
        System.out.println("Minimum is ="+min); //printing minimum value

        //To find out Maximum
        for (int i=1;i<a.length;i++)
        {
            if (a[i]>max) //Condition is " compare max variable value with every index vale from 1"
            {
                max=a[i];
            }
        }
        System.out.println("Maximum is ="+max); //printing maximum value
    }
}
