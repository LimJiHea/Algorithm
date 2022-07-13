import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().trim();        //앞 뒤 공백제거
        int result;
        if (s.equals("")){
            result = 0;
            System.out.println("0");
        }else{
            String [] arr = s.split(" ");
            result = arr.length;
            System.out.println(result);
        }

    }

}