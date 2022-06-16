import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int []n = new int[10];
        boolean b;
        int cnt = 0;

        for (int i=0; i<n.length; i++){
            n[i] = sc.nextInt() % 42;
            }


        for (int i=0; i<n.length; i++){
            b = false;
            for (int j=i+1; j<n.length; j++){
                if (n[i]==n[j]){
                    b = true;
                    break;
                }
            }
            if (b == false){
                cnt++;
            }
        }

        System.out.println(cnt);
    }

}