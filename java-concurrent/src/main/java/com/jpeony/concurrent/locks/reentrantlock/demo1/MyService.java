package com.jpeony.concurrent.locks.reentrantlock.demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 加锁和释放锁
 *
 * @author yihonglei
 */
public class MyService {
    private final static Logger logger = LoggerFactory.getLogger(MyService.class);
    private ReentrantLock lock = new ReentrantLock();

    public void serviceMethod() {
        try {
            lock.lock();
            logger.info("{}, begin", Thread.currentThread().getName());
        } finally {
            logger.info("{}, end", Thread.currentThread().getName());
            lock.unlock();
        }
    }
}
