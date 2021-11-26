package threadteen;

public class ObjectData {

    private int count;

    public ObjectData() {
        count = 0;
    }

    public void read() {
        System.out.println("read count:" + count);
        System.out.println();
    }

    public void write() {
        count++;
        System.out.println("write count:" + count);
    }

}
