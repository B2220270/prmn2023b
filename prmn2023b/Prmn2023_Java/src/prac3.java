import java.util.Scanner;

public class prac3 {
    public static void main(String[] args){
        String[][] number = new String[5][2];
        number[0][0] = "B2001000";
        number[0][1] = "abc";
        number[1][0] = "B2002000";
        number[1][1] = "def";
        number[2][0] = "B2003000";
        number[2][1] = "ghi";
        number[3][0] = "B2004000";
        number[3][1] = "jkl";
        number[4][0] = "B2005000";
        number[4][1] = "mno";
        Scanner scan = new Scanner(System.in);
        System.out.print("学籍番号を入力して下さい。:");
        String gakuseki = scan.next();

        login1 g = new login1();
        g.equals(number,gakuseki);
    }
}
