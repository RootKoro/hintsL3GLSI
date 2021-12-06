import java.lang.NumberFormatException;

class Exo4 {
    public static void main(String[] args) {
        try {
            if (args.length > 1)
                System.out.println(Integer.parseInt(args[0]) + " + " + Integer.parseInt(args[1]) + " = "
                        + (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));
            else
                System.out.println("Try again with at least two args");
        } catch (NumberFormatException e) {
            System.out.println("Try again with only numbers");
        }
    }
}