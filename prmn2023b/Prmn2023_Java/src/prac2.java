import java.util.Scanner;
public class prac2 {
    public static void main(String[] args){
        int[] num = new int[5]; //配列の定義(C言語とほぼ同じ考え方)
        int x = 0;
        Scanner scan = new Scanner(System.in); //標準入力をするインスタンス
        for(int i=0;i<5;i++){
            System.out.printf("数字 %d つ目",i);
            num[i] = scan.nextInt();
            System.out.println(""); //改行
        }
        Keisan k = new Keisan();
        x=k.sum(num,x);
        System.out.printf("合計値：%d",x);
        System.out.println("");
        k.hantei(x);
    }
}
