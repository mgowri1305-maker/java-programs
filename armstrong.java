import java.util.Scanner;
class armstrong{
    public static void main(String args[])
    {
        int arm=0,temp,count=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
temp=n;
        while(temp!=0)
        {
            count++;
            temp=temp/10;
        }
        temp=n;
while(n>0){
        int digit=n%10;
        arm=arm+(int)Math.pow(digit,count);
        n=n/10;
        }
        if(temp==arm)
        System.out.println("armstrong");
        else
     System.out.println(" not an armstrong");

    }
}