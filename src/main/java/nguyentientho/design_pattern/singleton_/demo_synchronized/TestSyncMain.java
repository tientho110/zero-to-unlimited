package nguyentientho.design_pattern.singleton_.demo_synchronized;

public class TestSyncMain {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.start();
        MyThread2 t2 = new MyThread2();
        t2.start();
    }
}
