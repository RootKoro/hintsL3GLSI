public class Occ {
    public static void main(String[] args) {

        if (args.length > 1) {
            boolean occ = false;

            for (int i = 1; i < args.length; i++) {
                if (args[i].contentEquals(args[0])) {
                    System.out.println("Trouve");
                    occ = true;
                    break;
                }
            }

            if (occ == false)
                System.out.println("Non trouve ");
        } else
            System.out.println("Reessayez avec au moins deux arguments");
    }
}
