package folder;

public class Moyenne {

    public static void main(String[] args) {
        if (args.length == 3) {
            int operande1 = Integer.parseInt(args[0]), operande2 = Integer.parseInt(args[2]),
                    operande3 = Integer.parseInt(args[3]);

            System.out.println((float) operande1 + operande2 + operande3 / 3);

        }
    }
}
