import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a=1;
        int b=0;

        while (sc.hasNext()){
            if (0<a && b <10){
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println(a+b);
            }
        }
    }

}