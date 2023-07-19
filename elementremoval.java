import java.util.*;
public class elementremoval {
    public int math(int ar[], int b) {
        int count = 0;
        for (int i = 0; i < b; i++)
        {
            count += ar[i] * (i + 1);
        }
        return count;


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int[] ar=new int[b];
        elementremoval maths=new elementremoval();
        for(int i=0; i<b;i++){
            ar[i]=sc.nextInt();

        }
        System.out.println(maths.math(ar,b));
    }}

