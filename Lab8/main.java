class CounterThread extends Thread {
    private int lower, upper;

    public CounterThread(String name, int lower, int upper) {
        super(name);  // Setting the thread name
        this.lower = lower;
        this.upper = upper;
    }

    @Override
    public void run() {
        System.out.println("Thread - " + getName());
        for (int i = lower; i <= upper; i++) {
            System.out.println("Counter - " + i);
            try {
                Thread.sleep(5); // Delay of 5 milliseconds
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
            }
        }
    }

    public static void main(String[] args) {  // Corrected the method name
        // Input values
        String threadName = "First";
        int lowerRange = 10;
        int upperRange = 15;

        // Creating and starting the thread
        CounterThread counterThread = new CounterThread(threadName, lowerRange, upperRange);
        counterThread.start();
    }
}
