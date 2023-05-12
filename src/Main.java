import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("input size = ");
            n = input.nextInt();
            if (n >= 30 || n < 0) {
                System.out.println("size <= 30 or size > 0");
            }
        } while (n < 0 || n >= 30);
        float[] arr = new float[n];
        for (int i = 0; i < n; i++) {
            do{
                System.out.println("input arr index = " + i);
                arr[i] = input.nextFloat();
                if(arr[i]<0 || arr[i]>10){
                    System.out.println("diem >= 0 or diem <=10");
                }
            }while (arr[i]<0 || arr[i]>10);
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>5){
                count+=1;
            }
        }
        System.out.println("So luong sinh vien thi do:" +count);
    }
}