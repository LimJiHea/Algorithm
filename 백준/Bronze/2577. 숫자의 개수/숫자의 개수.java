import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String hap = a*b*c+"";

        String[] arr = hap.split("");
        
        int i;
        int in0 =0;
        int in1 =0;
        int in2 =0;
        int in3 =0;
        int in4 =0;
        int in5 =0;
        int in6 =0;
        int in7 =0;
        int in8 =0;
        int in9 =0;

        for (i=0; i<arr.length;i++){
            if (arr[i].equals("0")){
                in0++;
            }else if (arr[i].equals("1")){
                in1++;
            }else if (arr[i].equals("2")){
                in2++;
            }else if (arr[i].equals("3")){
                in3++;
            }else if (arr[i].equals("4")){
                in4++;
            }else if (arr[i].equals("5")){
                in5++;
            }else if (arr[i].equals("6")){
                in6++;
            }else if (arr[i].equals("7")){
                in7++;
            }else if (arr[i].equals("8")){
                in8++;
            }else if (arr[i].equals("9")){
                in9++;
            }
        }

        System.out.println(in0);
        System.out.println(in1);
        System.out.println(in2);
        System.out.println(in3);
        System.out.println(in4);
        System.out.println(in5);
        System.out.println(in6);
        System.out.println(in7);
        System.out.println(in8);
        System.out.println(in9);

    }

}