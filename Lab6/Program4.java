import java.util.Scanner;

class HrsException extends Exception {
    public HrsException(String message) { 
		super(message); 
	}
}
class MinException extends Exception {
    public MinException(String message) { 
		super(message); 
	}
}
class SecException extends Exception {
    public SecException(String message) { 
		super(message); 
	}
}

class Time {
    private int hours, minutes, seconds;
    
    public void setTime(int h, int m, int s) throws HrsException, MinException, SecException {
        if (h > 24 || h < 0) throw new HrsException("Hour must be between 0 and 24");
        if (m >= 60 || m < 0) throw new MinException("Minute must be between 0 and 59");
        if (s >= 60 || s < 0) throw new SecException("Second must be between 0 and 59");
        
        this.hours = h;
        this.minutes = m;
        this.seconds = s;
        System.out.println("Correct Time -> " + h + ":" + m + ":" + s);
    }
}

class Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Time t = new Time();
        
        System.out.print("Enter hours: ");
        int h = scanner.nextInt();
        System.out.print("Enter minutes: ");
        int m = scanner.nextInt();
        System.out.print("Enter seconds: ");
        int s = scanner.nextInt();
        
        try {
            t.setTime(h, m, s);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }
    }
}