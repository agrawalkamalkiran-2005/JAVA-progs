public class ThreadPriorities {
    public static void main(String[] args) throws InterruptedException {
        Thread high = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " running with priority " + Thread.currentThread().getPriority());
        }, "HighPriorityThread");
        Thread low = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " running with priority " + Thread.currentThread().getPriority());
        }, "LowPriorityThread");
        high.setPriority(Thread.MAX_PRIORITY); 
        low.setPriority(Thread.MIN_PRIORITY);  
        System.out.println("Before start: " + high.getName() + " priority=" + high.getPriority()
                + ", " + low.getName() + " priority=" + low.getPriority());
        high.start();
        low.start();
        high.join();
        low.join();
        System.out.println("After completion: " + high.getName() + " priority=" + high.getPriority()
                + ", " + low.getName() + " priority=" + low.getPriority());
    }
}
