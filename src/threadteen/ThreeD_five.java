import java.util.Random;
import java.util.Scanner;
public class ThreeD_five{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int term = 0;       //期数
        int prize = 0;      //奖金总额
        int bet_1;            //下注号码
        int bet_2;            //下注号码
        int bet_3;            //下注号码
        int bet_4;            //下注号码
        int bet_5;            //下注号码
        int winNum;         //开奖号码
        System.out.print("共进行期数: ");
        int allTerm = scan.nextInt();
        long startTime = System.currentTimeMillis() ;
        while(term < allTerm){
            term++;
            bet_1 = creatNum();            //下注号码
            bet_2 = creatNum();            //下注号码
            bet_3 = creatNum();            //下注号码
            bet_4 = creatNum();            //下注号码
            bet_5 = creatNum();            //下注号码
            int betNum[] = {bet_1, bet_2, bet_3, bet_4, bet_5};
            betNum = betNum(betNum);
            winNum = creatNum();
            for(int bet : betNum){
                if(bet == winNum) prize += 1000;
                System.out.println(term + " " + bet +" "+winNum);
            }
        }
        int income = term*(-10) + prize;
        long endTime = System.currentTimeMillis() ;
        System.out.println("共进行 "+term+" 期\n花费 "+term*10+" 元\n赢得 "+prize+" 元\n总收益 "+income+" 元\n计算用时 "+ (endTime - startTime) +"ms");
        scan.close();
    }

    public static int creatNum(){
        Random num = new Random();
        int numH = num.nextInt(10);
        int numT = num.nextInt(10);
        int numD = num.nextInt(10);
        return numH*100 + numT*10 + numD;
    }

    public static int[] betNum(int[] num){
        boolean mark = false;
        for(int a:num){
            for(int b:num){
                if(a == b) mark = true;
                break;
            }
        }
        if(mark){
            int bet_1 = creatNum();            //下注号码
            int bet_2 = creatNum();            //下注号码
            int bet_3 = creatNum();            //下注号码
            int bet_4 = creatNum();            //下注号码
            int bet_5 = creatNum();            //下注号码
            int newNum[] = {bet_1, bet_2, bet_3, bet_4, bet_5};
            return newNum;
        } else {
            int newNum[] = num;
            return newNum;
        }

    }
}