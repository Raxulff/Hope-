import java.util.*;
class square_pattern{
    public static void main(String[] args){
        Scanner z=new Scanner(System.in);
        int r=z.nextInt();
        int c=z.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==0 || j==0 || i==r-1 || j==c-1){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
            }
            System.out.println();
        }
    }
}
