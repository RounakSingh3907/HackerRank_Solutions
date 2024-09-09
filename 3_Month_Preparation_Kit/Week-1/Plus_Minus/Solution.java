
import java.util.Scanner;
 public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String []arr = s.split(" "); 
        int cp=0;// counts no of positive integers
        int cn=0;// counts no of positive integers
        int cz=0;// counts no of zeroes
        for (String e : arr) {
            if(Integer.parseInt(e)>0)
            {
                cp+=1;
            }
            else if(Integer.parseInt(e)<0)
            {
                cn+=1;
            }
            else if(Integer.parseInt(e)==0)
            {
                cz+=1;
            }
        }
        
        float rp=(float)cp/n;
        float rn=(float)cn/n;
        float rz=(float)cz/n;
        System.out.printf("%.6f\n",rp);
        System.out.printf("%.6f\n",rn);
        System.out.printf("%.6f\n",rz);

    }
}