package threadteen;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DoubleColorBall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("共进行期数: ");
        int allTerm = scan.nextInt();
        for (int i = 0; i < allTerm; i++) {
            int[] nos = create();
            int[] nos2 = create();
            // System.out.println(nos);
            if(Arrays.equals(nos, nos2)){
                System.out.println("---恭喜您中奖了---");
                System.out.println(Arrays.toString(nos));
                System.out.println(Arrays.toString(nos2));
            }

        }

    }

    /**
     * 机选一注
     *
     * @return
     */
    public static int[] create() {
        int[] nos = new int[7];
        Random r = new Random();
        LoopI:
        for (int i = 0; i < 6; ) {
            nos[i] = r.nextInt(32) + 1;
            // 先生成再用当前数字与之前产生的数字比较找重复
            for (int j = 0; j < i; j++) {
                if (nos[i] == nos[j]) {
                    // System.out.println("第" + (i + 1) + "数字:" + nos[i] + "与第" + (j + 1) + "个数字重复了");
                    continue LoopI;
                }
            }
            i++;
        }
        nos[6] = r.nextInt(16) + 1;
        Arrays.sort(nos, 0, 6); //对数组的前6位排序
        return nos;
    }

    public static void printArray(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + ", ");
        }
    }
}