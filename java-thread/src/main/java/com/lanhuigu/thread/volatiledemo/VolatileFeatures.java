package com.lanhuigu.thread.volatiledemo;

/**
 * 单线程演示volatile变量特性
 */
public class VolatileFeatures {
    /**
     * 使用volatile声明64为的long型变量
     */
    private volatile long v1 = 0L;

    /**
     * 单个volatile变量的写
     */
    public void set(long l) {
        v1 = l;
    }

    /**
     * 符合（多个）volatile变量的读/写
     */
    public void getAndIncrement() {
        v1++;
    }

    /**
     * 单个volatile变量的读
     */
    public long get() {
        return v1;
    }
}