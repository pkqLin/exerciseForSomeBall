package threalearning;

class ThreadNew  extends Thread {
    private String name;

    public ThreadNew(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " 线程运行开始!");
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "运行  :  " + i);
            try {
                sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " 线程运行结束!");
    }

}


public class ThreadStart {
    /**
     * @Description: 两个线程同步执行，结果会有所不同
     * @Param:
     * @return:
     * @Author: 林杰
     * @Date: 2021/1/18 14:59
     */
/*    public static void main(String[] args) {
        ThreadNew mTh1 = new ThreadNew("A");
        ThreadNew mTh2 = new ThreadNew("B");
        //调用方法1 继承Thread创建
        //start()方法的调用后并不是立即执行多线程代码，而是使得该线程变为可运行态（Runnable），什么时候运行是由操作系统决定的。
        mTh1.start();
        mTh2.start();
    }*/

    /**
     * @Description: 加入join，在很多情况下，主线程生成并起动了子线程，如果子线程里要进行大量的耗时的运算，主线程往往将于子线程之前结束，但是如果主线程处理完其他的事务后，需要用到子线程的处理结果，也就是主线程需要等待子线程执行完成之后再结束，这个时候就要用到join()方法了。
     * @Param:
     * @return:
     * @Author: 林杰
     * @Date: 2021/1/18 15:29
     */
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "主线程运行开始!");
        ThreadNew mTh1 = new ThreadNew("A");
        ThreadNew mTh2 = new ThreadNew("B");
        mTh1.start();
        mTh2.start();
        /**1：sleep(long millis): 在指定的毫秒数内让当前正在执行的线程休眠（暂停执行）
         * 加入join后就会等待子线程执行完，再执行子线程；否则主线程执行完，子线程仍然在执行
         * 2：join():指等待t线程终止。
         * 使用方式。
         * join是Thread类的一个方法，启动线程后直接调用，即join()的作用是：“等待该线程终止”，这里需要理解的就是该线程是指的主线程等待子线程的终止。也就是在子线程调用了join()方法后面的代码，只有等到子线程结束了才能执行。
         */
        try {
            mTh1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            mTh2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "主线程运行结束!");

    }
}
