import java.util.Scanner;
public class Gakuseki {
    boolean equals(String number,String gakuseki){
        return number==gakuseki;
    }
    void print(String number,String gakuseki) {
        if (number.equals(gakuseki)) {
            System.out.println("complete!");
        }else{
            System.out.println("error!");
        }
    }
}
