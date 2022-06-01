import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> alist = new ArrayList<Integer>();

        ArrayList<Integer> blist = new ArrayList<Integer>();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a;
        int d = b;
        while(a>0 && b>0){
            alist.add(a%10);
            a/=10;
            blist.add(b%10);
            b/=10;
        }

        System.out.println(blist.get(0)*c);
        System.out.println(blist.get(1)*c);
        System.out.println(blist.get(2)*c);
        System.out.println(d*c);

    }
}