package day26;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(
                () -> System.out.println("Đang chạy trên: " + Thread.currentThread().getName()),
                "java-learner");
        worker.start();
        worker.join();
        System.out.println("Đã hoàn thành.");
    }
}
