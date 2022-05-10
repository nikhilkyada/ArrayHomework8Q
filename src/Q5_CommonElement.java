import java.util.Arrays;
import java.util.HashSet;

public class Q5_CommonElement {

    public static void main(String args[]){

        //Arrays
        String[] a={"care","Train","Game","car"};
        String[] b={"care","Train","game","car"};

        System.out.println("Array String a"+ Arrays.toString(a));//for information purpose
        System.out.println("Array String b"+ Arrays.toString(b));//for information purpose
//It stores rendom value but not duplicate
        HashSet<String> count = new HashSet<String>();

//<<<<<<<<<<<<<<<<<<<<<<<<<<<  need to ask for clarification >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        for ( int i=0;i<a.length;i++){
            for (int j = 0;j<b.length;j++){
                if (a[i].equals(b[j])){
                    count.add(a[i]);
                }
            }
        }
        System.out.println("Common Elements=" +(count));//Print out 'count'
    }
}
