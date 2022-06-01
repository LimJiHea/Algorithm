import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int y;

        int []a = new int[n];   //n개의 자릿수를 가진 배열 선언
        int i;

        for (i=0; i<n; i++){
            a[i]= sc.nextInt();
            if (a[i]<x){
                System.out.print(a[i]+" ");
            }
        }
    }

}
