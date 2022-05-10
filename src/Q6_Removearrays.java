public class Q6_Removearrays {

    public static void main (String args[]){

        int[] a={10,20,30,40,50,60,70,80,90};//Arrays has benn declared
        int del=40;//Array value to be deleted,if match
        int count=0;//Temporary variable

        //For loop for deleting value
        for (int i=0;i<a.length;i++)//compare delete value with every index value
        {
            if (del==a[i])
            {
                for (int j=i ;j<a.length-1 ; j++) //if value found,it moves every index to -1 position & start traveling forward
                {
                    a[j]=a[j+1];  //declaring index position = position+1
                }
            count=count+1; //increase count value by 1
            break; //Stop the for loop to go forward to shift index of arrays
            }
        }
        if(count==0) //if count value is 0, then go inside the loop
        {
            System.out.println("Element was not found");
        }else  //if increase , go inside the loop
        {
            System.out.println("Element was deleted successfully");
            //loop travels through array till length-1 and printout
            for (int i = 0 ; i<a.length-1 ; i++)
            {
                System.out.println(a[i]+" ");
            }
        }
    }
}
