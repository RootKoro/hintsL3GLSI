public class Calc {
    public static void main(String[] args) {
        if (args.length == 3) {
            int operande1 = Integer.parseInt(args[0]), operande2 = Integer.parseInt(args[2]);
            switch (args[1]) {
                case "+":
                    System.out.println(operande1 + operande2);
                    break;

                case "-":
                    System.out.println(operande1 - operande2);
                    break;

                case "*":
                    System.out.println(operande1 * operande2);
                    break;

                case "x":
                    System.out.println(operande1 * operande2);
                    break;

                case ":":
                    System.out.println((float) operande1 / operande2);
                    break;

                case "/":
                    System.out.println((float) operande1 / operande2);
                    break;

                default:
                    System.out.println("Operation non prise en charge !");
                    break;
            }
        } else
            System.out.println(
                    "Reessayer en passant en argument une operation simple avec les operandes separes des operateurs par des espaces\nExemple : 3 x 2");
    }
}