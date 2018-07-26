package com.lanhuigu.thread.lock.fair;

public class RunFair {
    public static void main(String[] args) {
        final Service service = new Service(true);

        Thread[] threadArray = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] =  new Thread(()->{
                System.out.println("*线程 " + Thread.currentThread().getName() + "运行了");
                service.serviceMethod();
            });
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
    }
}