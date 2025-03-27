class CheckArgument extends Exception {
    public CheckArgument(String message) {
        super(message);
    }
}

public class Program5 {
    public static void main(String[] args) {
        try {
            if (args.length < 4) {
                throw new CheckArgument("Exception occurred - CheckArgument");
            }
            int sumOfSquares = 0;
            for (String arg : args) {
                int num = Integer.parseInt(arg);
                sumOfSquares += num * num;
            }
            System.out.println(sumOfSquares);
        } catch (CheckArgument e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide integer values.");
        }
    }
}