```java
package MyThread;


 
class MyThread extends Thread {

    public void run() {
        System.out.println("Hello Real Time Programming");
        System.out.println("Thilagan..");
        System.out.println("running...");
    }

    public static void main(String args[]) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        System.out.println("Name of t1:" + t1.getName());
        System.out.println("Name of t2:" + t2.getName());
        System.out.println("id of t1:" + t1.getId());

        t1.start();
        t2.start();

        t1.setName("STIW3054");
        System.out.println("After changing name of t1:" + t1.getName());
    }
}
```
![untitled1](https://user-images.githubusercontent.com/36805996/36637884-b1e57506-1a20-11e8-8315-4287b7750c5b.png)
