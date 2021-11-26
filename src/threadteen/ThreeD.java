
import java.util.Random;
import java.util.Scanner;
public class ThreeD{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int term = 0;       //期数
        int prize = 0;      //奖金总额
        int bet;            //下注号码
        int winNum;         //开奖号码
        System.out.print("共进行期数: ");
        int allTerm = scan.nextInt();
        long startTime = System.currentTimeMillis() ;
        while(term < allTerm){
            term++;
            bet = creatNum();
            winNum = creatNum();
            if(bet == winNum) prize += 1000;
            System.out.println(term + " " + bet +" "+winNum);
        }
        int income = term*(-2) + prize;
        long endTime = System.currentTimeMillis() ;
        System.out.println("共进行 "+term+" 期\n花费 "+term*2+" 元\n赢得 "+prize+" 元\n总收益 "+income+" 元\n计算用时 "+ (endTime - startTime) +"ms");
        scan.close();
    }

    public static int creatNum(){
        Random num = new Random();
        int numH = num.nextInt(10);
        int numT = num.nextInt(10);
        int numD = num.nextInt(10);
        return numH*100 + numT*10 + numD;
    }
}