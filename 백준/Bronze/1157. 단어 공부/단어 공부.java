import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next().toUpperCase(); //대문자 변환

        int [] cnt = new int[26];       //카운트
        int i;
        int j;
        
        for (i=0; i<s.length(); i++){
            int num = s.charAt(i)-'A';
            cnt[num]++;
        }

        int max = 0;
        char c = '?';

        for (j=0; j<cnt.length; j++){
            if (max < cnt[j]){
                max = cnt[j];
                c = (char)(j+'A');
            }else if (max == cnt[j]){
                c = '?';
            }
        }

        System.out.println(c);


    }

}