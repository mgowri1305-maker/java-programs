import java.util.Scanner;

class switchdemo{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();

System.out.println("enter your choice");
System.out.println("+");
System.out.println("-");
System.out.println("*");
System.out.println("/");
System.out.println("%");
System.out.println("enter op");
char op=s.next().charAt(0);
int result;
        switch(op)
        {
            case'+':
            {
                result=a+b;
            System.out.println(result);
            }
            break;

            case'-':
            {
             result=a-b;
            System.out.println(result);
            }
            break;
            case'*':
            {
             result=a*b;
           System.out.println(result);
            }
            break;
            case'/':
            {
            result=a/b;
           System.out.println(result);
            }
            break;
            case'%':
            {
             result=a%b;
            System.out.println(result);
            }
            break;
            default:
                {
                System.out.println("default value");
        }
    }
} 
}