public class NumberPattern {
    public static void main(String args[]){
        int row,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        row=sc.nextInt();
        for(i=1;i<=row;i++){
            for(j=1;j<=i;j++){
                System.out.print((2*j)-1);
            }
            System.out.println();
        }
    }  
}
