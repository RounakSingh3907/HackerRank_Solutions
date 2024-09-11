import java.util.Scanner;

public class solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                int length = s1.length();
                //Complete this line
                System.out.print(s1);
                for (int j = 1; j <=15-length; j++) {
                    System.out.print(" ");
                }
                if(x<100&&x>9)
                {
                    System.out.println("0"+x);
                }
                else if(x<10&&x>=0)
                {
                    System.out.println("00"+x);
                }
                else
                {
                    System.out.println(x);
                    
                }
            }
            System.out.println("================================");

    }
}



