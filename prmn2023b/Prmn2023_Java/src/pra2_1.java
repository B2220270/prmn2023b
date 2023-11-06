import java.util.Scanner;
public class pra2_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //標準入力をするインスタンス
        System.out.print("名前を入力して下さい。:");
        String name = input.next();
        System.out.println("学籍番号を入力して下さい。:");
        int num = input.nextInt();

        System.out.println("氏名:"+name+"学籍番号:"+num);
    }
}
