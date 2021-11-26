package threadteen;

/**
* @Description: 消费者线程，负责读线程
* @Param:
* @return:
* @Author: 林杰
* @Date: 2021/1/18 14:06
*/

public class ConsumerThread extends Thread {

    private ObjectData data;

    public ConsumerThread(ObjectData data) {
        this.data = data;
    }

    @Override
    public void run() {
        while (true) {
            try {
                synchronized (data) {
                    data.wait();
                    data.read();
                    data.notify();

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}
