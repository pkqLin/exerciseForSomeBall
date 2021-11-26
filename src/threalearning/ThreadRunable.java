package threalearning;


class ThreadRun implements Runnable {
    private String name;

    public ThreadRun(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "运行  :  " + i);
            try {
                Thread.sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}

public class ThreadRunable {
    /**
     * @Description: 两个线程同步执行，结果会有所不同
     * @Param:
     * @return:
     * @Author: 林杰
     * @Date: 2021/1/18 14:59
     */
    public static void main(String[] args) {
        //调用方法2 Thread2类通过实现Runnable接口，使得该类有了多线程类的特征。run（）方法是多线程程序的一个约定。所有的多线程代码都在run方法里面。Thread类实际上也是实现了Runnable接口的类。
/*        实现Runnable接口比继承Thread类所具有的优势：
        1）：适合多个相同的程序代码的线程去处理同一个资源
        2）：可以避免java中的单继承的限制
        3）：增加程序的健壮性，代码可以被多个线程共享，代码和数据独立
        4）：线程池只能放入实现Runable或callable类线程，不能直接放入继承Thread的类
        提醒一下大家：main方法其实也是一个线程。在java中所以的线程都是同时启动的，至于什么时候，哪个先执行，完全看谁先得到CPU的资源。
        在java中，每次程序运行至少启动2个线程。一个是main线程，一个是垃圾收集线程。因为每当使用java命令执行一个类的时候，实际上都会启动一个ＪＶＭ，每一个ｊＶＭ实习在就是在操作系统中启动了一个进程。*/
        new Thread(new ThreadRun("C")).start();
        new Thread(new ThreadRun("D")).start();
    }
}
