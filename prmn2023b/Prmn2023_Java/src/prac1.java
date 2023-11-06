import java.util.Scanner;
public class prac1 {
    public static void main(String[] args){
        String number = "B2001000";
        Scanner scan = new Scanner(System.in); //標準入力をするインスタンス
        System.out.print("学籍番号を入力して下さい。:");
        String gakuseki = scan.next();
        Gakuseki g = new Gakuseki();
        g.print(number,gakuseki);
    }
}
