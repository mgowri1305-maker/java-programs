class pattern5
{   
 public static void main(String[] args) {
int i,j;
int n=5;for(i=1;i<=n;i++)
{
    for(j=1;j<=i;j++)
    {
        System.out.print("* ");
    }
     System.out.println("");
}

for(i=n-1;i>=1;i--)
{
    for(j=1;j<=i;j++)
    {
        System.out.print("* ");
    }
     System.out.println("");

}
 System.out.println("");
 }
}
