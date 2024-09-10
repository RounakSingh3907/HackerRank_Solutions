import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String []arr = s.split(" ");
        int max=Integer.parseInt(arr[0]);
        int min =Integer.parseInt(arr[0]);
        for (String e : arr) {
            if(Integer.parseInt(e)>max)
            {
                max=Integer.parseInt(e);
            }
            else if(Integer.parseInt(e)<min)
            {
                min=Integer.parseInt(e);
            }   
        }
        long sum_min=0;
        long sum_max=0;
        int c=0;
        int t=0;
        for (String e : arr) {
            
            if(Integer.parseInt(e)==max&&c==0)
            {
                c=1;
            }
            else
            {
                sum_min+=Integer.parseInt(e);
            }
            if(Integer.parseInt(e)==min&&t==0)
            {
                t=1;
            }
            else
            {
                sum_max+=Integer.parseInt(e);
            }
        }
        System.out.print(sum_min+" "+sum_max);
    }
}
