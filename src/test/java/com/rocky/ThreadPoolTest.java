package com.rocky;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.rocky.model.busibean.CmCustomer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @Author: shtian
 * @Description:
 * @Date: Create in 2018/8/15 13:04
 */
public class ThreadPoolTest {

    public static void main(String[] args) throws Exception {
        ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("db-check-pool-%d").build();
        ExecutorService executorService = new ThreadPoolExecutor(10, 200,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(1024), threadFactory, new ThreadPoolExecutor.AbortPolicy());

        CountDownLatch countDownLatch = new CountDownLatch(5);
        for (int i = 0; i < 5; i++) {
            CmCustomer temp = new CmCustomer();
            temp.setCustName("shitian1");
            executorService.execute(new SqlExeTask(temp,countDownLatch));
        }
        countDownLatch.await();
        System.out.println("----------------");
    }


}


class SqlExeTask implements Runnable {

    private CmCustomer customer;
    private CountDownLatch latch;

    public SqlExeTask(CmCustomer customer,CountDownLatch latch) {
        this.customer = customer;
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":" + customer.getCustName());
        latch.countDown();
    }
}
