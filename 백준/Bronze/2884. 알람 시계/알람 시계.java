import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        if (0<= h && h<= 23 && 0<= m){
            if (m>= 45){
                m= m - 45;
            }else {
                m = m + 15;
                if (h==0){
                    h=23;
                }else{
                    h= h-1;
                }
            }
        }

        System.out.println(h+" "+m);

    }

}