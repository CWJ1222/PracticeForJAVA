class Counter {
    private int count = 0;

    // synchronized 메서드로 동기화된 영역을 지정합니다.
    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}

public class Ex84 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // 여러 스레드가 공유 리소스인 counter에 접근합니다.
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        try {
            // 두 스레드가 모두 완료될 때까지 메인 스레드를 기다립니다.
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}
