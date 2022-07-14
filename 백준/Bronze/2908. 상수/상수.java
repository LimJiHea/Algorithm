import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        String as = "";
        String bs = "";

        while(a> 0){

            as += a%10+"";

            a/= 10;

        }

        while(b>0){
            bs += b%10+"";

            b/=10;
        }

        if ( Integer.parseInt(as) > Integer.parseInt(bs) ) {
            System.out.println(as);
        }else{
            System.out.println(bs);
        }

    }

}