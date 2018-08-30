import java.util.Scanner;
public class FirstLast6
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int a[] = new int[size];
        for(int i=0; i<a.length;i++) {
            a[i] = s.nextInt();
            } 
            if(a[0]==6 || a[a.length-1]==6) {
                System.out.println("True");
            } else {
                System.out.println("False");
                

        }

    }

}

        