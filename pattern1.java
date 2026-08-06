class pattern1
{
    public static void main(String args[])
    {
int i,j;
int n=5;
//square
for(i=1;i<=n;i++)
{
    for(j=1;j<=n;j++)
    {
        System.out.print("* ");
    }
     System.out.println(" ");
}
     System.out.println("");

//right triangle

for(i=1;i<=n;i++)
{
    int col=i;
    for(j=1;j<=col;j++)
    {
        System.out.print("* ");
    }
     System.out.println(" ");
}
  System.out.println("");
 //inverted right angle

 for(i=n;i>=1;i--)
{
    for(j=1;j<=i;j++)
    {
        System.out.print("* ");
    }
     System.out.println(" ");
}
 System.out.println("");
//number triangle
for(i=1;i<=n;i++)
{
    for(j=1;j<=i;j++)
    {
        System.out.print(j +" ");
    }
     System.out.println("");
}
 System.out.println("");
// tri rev tri

for(i=1;i<=n;i++)
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

//left space tri 
for(i=1;i<=n;i++)
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

//inverse top to bottom tri
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

//middle pyr 9
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
System.out.println();
//rev py 9
for(i=5;i>=1;i--)
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

System.out.println();
//pyr 5
for(i=1;i<=n;i++)
{
    int colspace=n-i;
        for(int s=1;s<=colspace;s++)
        {
         System.out.print(" ");
        }
        for(j=1;j<=i;j++)
        System.out.print("* ");
        System.out.println("");
    }
    }
    }