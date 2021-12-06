class Exo2 {
    public static void main(String[] args) {
        if (args.length > 0) {
            for (int i = 0; i < args[0].length(); i += 2)
                System.out.print(args[0].charAt(i));

            System.out.println("\ndebut : " + args[0].charAt(0) + "\tfin : " + args[0].charAt(args[0].length() - 1));
        } else
            System.out.println("Try again with some args");
    }
}