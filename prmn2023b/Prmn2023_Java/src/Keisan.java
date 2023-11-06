public class Keisan {
    int sum(int[] num,int x) {
        for (int i = 0; i < 5; i++) {
            x = x + num[i];
        }
        return x;
    }
    void hantei(int x){
        if(x >= 100){
            System.out.println("great!!");
        }else if(x >= 50){
            System.out.println("big");
        }else{
            System.out.println("small");
        }
    }
}
