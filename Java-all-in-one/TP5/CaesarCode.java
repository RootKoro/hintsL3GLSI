public class CaesarCode {

    /****************************************************
     * cryptage
     *********************************************************/

    public static String crypter(String message, int cle) {
        String messageACrypter = "";
        message = message.toLowerCase();
        int debut = 97, fin = 122;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) >= debut && message.charAt(i) <= fin) {
                int convertisseur = (int) message.charAt(i) + cle;
                if (convertisseur > fin)
                    messageACrypter += (char) (convertisseur - fin - 1 + debut);
                else
                    messageACrypter += (char) (convertisseur);
            } else
                messageACrypter += message.charAt(i);
        }
        return messageACrypter;
    }

    /****************************************************
     * decryptage
     *******************************************************/

    public static String decrypter(String message, int cle) {
        String messageCrypte = "";
        message = message.toLowerCase();
        int debut = 97, fin = 122;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) >= debut && message.charAt(i) <= fin) {
                int convertisseur = (int) message.charAt(i) - cle;
                if (convertisseur < debut)
                    messageCrypte += (char) (fin - debut + convertisseur + 1);
                else
                    messageCrypte += (char) (convertisseur);
            } else
                messageCrypte += message.charAt(i);
        }
        return messageCrypte;
    }

    public static void main(String[] args) {
        String helpMessage = "Executer \'java CaesarCode -h\' ou \'java CaesarCode --help\' ou \'java CaesarCode\' pour savoir comment utiliser ce programme";
        String nonOptionMessage = "Option non prise en compte !";
        String crypteOptionMessage = "java CaesarCode -c messageACrypter [-k cle (un entier)] pour crypter un mot avec une cle entiere";
        String DecrypteOptionMessage = "java CaesarCode -d messageACrypter [-k cle (un entier)] pour decrypter un mot avec une cle entiere";

        if (args.length != 0) {
            if (args.length == 1 && (args[0].contentEquals("-h") || args[0].contentEquals("--help"))) {
                System.out.println(crypteOptionMessage);
                System.out.println(DecrypteOptionMessage);
                System.out.println(helpMessage);
            } else if (args.length > 1) {
                String message = "";
                int i = 1;
                for (; i < args.length && !(args[i].contentEquals("-k"));)
                    message += " " + args[i++];
                if (args[0].contentEquals("-c") && message.length() > 0) {
                    if (i < args.length && args[i].contentEquals("-k")) {
                        try {
                            int key = Integer.parseInt(args[++i]);
                            System.out.println(crypter(message, key));
                        } catch (Exception NumberFormatException) {
                            System.out.println(helpMessage);
                        }
                    } else
                        System.out.println(crypter(message, 13));
                } else if (args[0].contentEquals("-d") && message.length() > 0) {
                    if (i < args.length && args[i].contentEquals("-k")) {
                        try {
                            int key = Integer.parseInt(args[++i]);
                            System.out.println(decrypter(message, key));
                        } catch (Exception NumberFormatException) {
                            System.out.println(helpMessage);
                        }
                    } else
                        System.out.println(decrypter(message, 13));
                } else if (message.length() > 0 && !(args[0].contentEquals("-c") || args[0].contentEquals("-d")))
                    System.out.println(nonOptionMessage);
                else
                    System.out.println(helpMessage);
            } else
                System.out.println(helpMessage);
        } else {
            System.out.println(crypteOptionMessage);
            System.out.println(DecrypteOptionMessage);
            System.out.println(helpMessage);
        }
    }
}