import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Solution {
    static class RateLimiter {
        private long bucketSize;
        private long lastRefillTime;
        private double refillPerSecond;
        private double curTokens;

        RateLimiter(long size, double rate, double tokens) {
            bucketSize = size;
            refillPerSecond = rate;
            lastRefillTime = System.currentTimeMillis();
            curTokens = tokens;
        }

        synchronized void hit(int[] requestId) {
            long currentTime = System.currentTimeMillis();
            double betweenTimeInSeconds = (currentTime - lastRefillTime) / 1000.0;

            double tokensGained = betweenTimeInSeconds * refillPerSecond;

            curTokens = Math.min(bucketSize, curTokens + tokensGained);

            if (curTokens >= 1.0) {
                System.out.println("tokens left : " + String.format("%.2f", curTokens) + " , " + requestId[0]
                        + " allowed");
                curTokens--;
            } else {
                System.out.println("tokens left : " + String.format("%.2f", curTokens) + " , " + requestId[0]
                        + " dropped");
            }
            requestId[0]++;
            lastRefillTime = currentTime;
        }

    }

    public static void main(String[] args) {
        System.out.println("Application Started..");
        int[] requestId = new int[1];
        RateLimiter rateLimiter = new RateLimiter(4L, 1.00, 4.00);
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(() -> {
            rateLimiter.hit(requestId);
            rateLimiter.hit(requestId);
        }, 0, 1, TimeUnit.SECONDS);

        List<Integer> l = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        Queue<Integer> q = new ArrayDeque<>();
        // List<Integer> i = new ArrayDeque<>();
        List<Integer> z = new LinkedList<>();
        Queue<Integer> t = new LinkedList<>();
        LinkedHashSet set = new LinkedHashSet<>();

    }
}
