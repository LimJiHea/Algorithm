import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;
        int b;

            for (int i=1;;i++){
                a = sc.nextInt();
                b = sc.nextInt();
                    if (a == 0 && b ==0) {
                        break;
                    }else{
                        System.out.println(a+b);
                    }
            }
    }

}