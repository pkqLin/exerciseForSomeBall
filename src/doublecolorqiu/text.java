package doublecolorqiu;

import java.awt.Color;

public class text {
    public static void main(String[] args) {
        Ball ball = new Ball();
        // System.out.println("ball number "+ ball.number);
        // System.out.println("ball color "+ ball.color);
        // System.out.println("ball size "+ ball.size);

        // 对于对象赋值的两种方法
        // 1.直接定义时赋值 类里面进行方法语句写数据
        // 2.赋值语句赋值

        ball.setColor(Color.blue);
        ball.setNumber(5);
        ball.setSize(500);
        System.out.println("ball.color " + ball.getColor() + "; ball number " + ball.getNumber() + "; ball size "
                + ball.getSize());

        // 直接调用属性赋值
        // ball.color = "black";
        // System.out.println("ball.color "+ball.color+"; ball number "+ball.number+";
        // ball size "+ball.size );
        // 直接点属性改值，对于JAVA而言等同于侵犯了类的隐私
        // 所以直接点属性改值，需要进一步说明权限
        // 权限说明 ：
        // 公有 public 所有的包使用
        // 私有private 本类使用
        // 保护 protect 本类子类一个包里面的类使用
        // 默认 本类 一个包里面的类使用
    }
}

