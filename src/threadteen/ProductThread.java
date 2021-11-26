package threadteen;

public class ProductThread extends Thread {
    private ObjectData data;

    public ProductThread(ObjectData data) {
        this.data = data;
    }

    @Override
    public void run() {
        while (true) {
            try {
                synchronized (data) {
                    data.write();
                    Thread.sleep(3000);
                    data.notify();
                    data.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
