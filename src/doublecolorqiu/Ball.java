package doublecolorqiu;

import java.awt.Color;

public class Ball {

    private Color color; // 属性 颜色
    private int number; // 属性 数字
    private int size;// 属性 大小

    // 构造函数 必须与类名一致
    public Ball() {

        color = color.green;
        number = 2;
        size = 80;
    }

    // 设置属性的方法函数
    // public void setColor(String color) {
    // this.color = color;
    // color = color;与上句同意 但上句表达更加准确 避免重名
    // this代表本类属性
    // }
    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

}