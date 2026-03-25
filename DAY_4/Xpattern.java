import java.util.*;
class x_single_loop{
    public static void main(String[] args){
        Scanner z=new Scanner(System.in);

        int n=z.nextInt();
        for(int k=1;k<=n*n;k++)
        {
            int i=(k-1)/n;
            int j=(k-1)%n;

            if(i==j || i+j==n-1){
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }

            if(j==n-1){
                System.out.println();
            }
        }     
    }
}
