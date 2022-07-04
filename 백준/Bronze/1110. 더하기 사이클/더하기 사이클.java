import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nn = n;     //원래 수 저장
        int cnt = 0;

        while(true){
            n = ((n%10)*10 + (((n/10)+(n%10))%10));
            cnt ++;
            if (n == nn){
                break;
            }
        }

        System.out.println(cnt);
    }

}