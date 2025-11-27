class ThreadInfo extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        ThreadInfo t = new ThreadInfo();
        t.setName("Kamal.Thread");
        t.start();
        System.out.println("Thread Name: " + t.getName());
        System.out.println("Thread ID: " + t.getId());
        System.out.println("Is Alive: " + t.isAlive());
    }
}
