package com.jpeony.thread.waitnotify.notifyall;

/**
 * @author yihonglei
 *  2019/2/15 11:23
 */
public class ThreadC extends Thread{
    private Object lock;

    public ThreadC(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        MyService service = new MyService();
        service.serviceMethod(lock);
    }
}