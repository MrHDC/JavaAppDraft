import jdk.nashorn.internal.parser.Scanner;

public class DeQuy {
    public static void main(String[] args) {
        DeQuy deQuy = new DeQuy();
        System.out.println(deQuy.tong2(5));
    }

    int tong(int n) {
        if (n==0) return 0;
        return tong(n-1)+n;
    }

    int tong2(int n){
        if (n==0) return 0;
        if(n%2==0)
        return 2*tong(Math.round(n / 2))+ Math.round(n/2)*Math.round(n/2);
        else
            return 2*tong(Math.round(n / 2))+ Math.round(n/2)*Math.round(n/2) + n;
    }
}
