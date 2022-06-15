import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       String [] sarr = new String[sc.nextInt()];      

       for (int i=0; i<sarr.length; i++){
           sarr[i] = sc.next();
       }

           for (int i=0; i<sarr.length; i++){
               int cnt = 0;
               int sum = 0;

               for (int j=0; j<sarr[i].length(); j++){
                   if (sarr[i].charAt(j) == 'O'){
                       cnt ++;
                   }else {
                       cnt = 0;
                   }
                   sum+= cnt;
               }
               System.out.println(sum);
           }

    }

}