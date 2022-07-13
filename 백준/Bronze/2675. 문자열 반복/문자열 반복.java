import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();

        String p = "";
        String result = "";
        int i;
        int j;

        for(i=0; i<a; i++){
            int b = sc.nextInt();
            String c = sc.next();
            for (j=0; j<c.length(); j++){
                p = c.charAt(j) + "";
                result += p.repeat(b);
            }
            result += "\n";
        }
        System.out.println(result);
    }

}