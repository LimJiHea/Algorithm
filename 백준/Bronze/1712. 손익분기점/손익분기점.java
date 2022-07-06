import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();


        //b c 가 같은 경우 생각하기
        //자료형을 int로 해서 마지막 예제 틀림
        //반복문을 돌리면 시간초과뜸
        // 반복문을 사용하지 않고 방정식을 통해 품
       


        if(b >= c){
            System.out.println("-1");
        }else if (b < c){
            long result = a/(c-b);
            System.out.println(result + 1);
            }
    }

}