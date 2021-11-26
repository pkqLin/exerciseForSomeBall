package threadteen;

public class Test {
    public static void main(String args[]){
        ObjectData data =new ObjectData();
        //生产者count+1
        ProductThread pt = new ProductThread(data);
        //消费者读取count的值
        ConsumerThread ct =new ConsumerThread(data);

        ct.start();
        pt.start();
    }
}
