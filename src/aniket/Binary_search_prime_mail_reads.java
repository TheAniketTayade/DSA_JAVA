package aniket;
import java.util.Scanner;
public class Binary_search_prime_mail_reads {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int renumbering = in.nextInt();
        int output = 1;
        while (renumbering != 1){
            renumbering = renumbering - prime_N(renumbering);
            output++;
        }
        System.out.println(output);
    }
    static int prime_N(int N){
        int x, y, flg;
        int counter = 0;

        for (x = 1; x <= N; x++) {
            if (x == 1 || x == 0)
                continue;
            flg = 1;
            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }
            if (flg == 1){
                counter++;
            }
        }
        return counter;
    }
}
