import java.util.Scanner;
class palindrome{
    public static void main(String args[])
    {
        int i,sum=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
while(n>0){
        int digit=n%10;
        sum=sum*10+digit;
        n=n/10;
        
        }
        if(sum==temp)
        System.out.println("palindrome");
        else 
                System.out.println("not a palindrome");

    }
}