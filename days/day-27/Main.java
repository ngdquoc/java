package day27;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        try {
            CompletableFuture<String> result = CompletableFuture
                    .supplyAsync(() -> "Java", executor)
                    .thenApply(name -> "Đang học " + name);
            System.out.println(result.join());
        } finally {
            executor.shutdown();
        }
    }
}
