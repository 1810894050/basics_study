package com.java1;

class Clerk{
    private int productCount =  0;
    //生产产品
    public synchronized void produceProduct(){
        if (productCount<20){
            productCount++;
            System.out.println(Thread.currentThread().getName()+"生产第"+productCount+"个产品");

            notify();

        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //消费产品
    public synchronized void consumeProduct(){
        if (productCount>0){
            System.out.println(Thread.currentThread().getName()+"消费第"+productCount+"个产品");
            productCount--;

            notify();

        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}

//生产者
class Producer extends Thread{
    private Clerk clerk;
    public Producer(Clerk clerk){
        this.clerk=clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"：开始生产产品-----");
        while (true){
            try {
                sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.produceProduct();
        }
    }
}

//消费者
class  Consumer extends Thread{
    private Clerk clerk;
    public  Consumer(Clerk clerk){
        this.clerk=clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+":开始消费上平——————");
        while (true){
            try {
                sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.consumeProduct();
        }
    }
}

public class ProduoctTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer p1=new Producer(clerk);
        p1.setName("生产者1");

        Consumer c1=new Consumer(clerk);
        c1.setName("消费者1");

        p1.start();
        c1.start();
    }
}
