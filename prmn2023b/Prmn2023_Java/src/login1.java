import java.util.Scanner;
public class login1 {
    String equals(String[][] number,String gakuseki){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            if(number[i][0] == gakuseki){
                System.out.print("パスワードを入力して下さい。:");
                String password = input.next();
                return password;
            }
        }
        System.out.println("error!!");
        System.exit(0);
        return gakuseki;
    }
    void password(String[][] number,String password) {
        for (int i = 0; i < 5; i++) {
            if(number[i][1]==password){
                System.out.println("ログイン完了");
                return;
            }
        }
        System.out.println("不正なアクセス");
    }
}
