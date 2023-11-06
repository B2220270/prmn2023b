import java.util.Scanner;
public class login1 {
    void equals(String[][] number,String gakuseki){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            if(number[i][0].equals(gakuseki)){
                System.out.print("パスワードを入力して下さい。:");
                String password = input.next();
                if(number[i][1].equals(password)){
                    System.out.println("ログイン完了");
                    return;
                }
                System.out.println("不正なアクセス");
                return;
            }
        }
        System.out.println("error!!");
        System.exit(0);
    }
}
