class pattern8
{   
 public static void main(String[] args) {
int i,j;
int n=5;
for(i=1;i<=n;i++)
{
    int colspace=n-i;
    for(int s=1;s<=colspace;s++)
    System.out.print(" ");

    for(j=1;j<=2*i-1;j++)
    {
     System.out.print("*");
    }
    System.out.println();
}

 }
}
