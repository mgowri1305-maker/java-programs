class pattern7
{   
 public static void main(String[] args) {
int i,j;
int n=5;
for(i=5;i>=1;i--)
{
    int colspace=n-i;
    for(int s=1;s<=colspace;s++)
    System.out.print(" ");

    for(j=1;j<=i;j++)
    {
     System.out.print("*");
    }
    System.out.println();
}
 System.out.println();

 }
}
