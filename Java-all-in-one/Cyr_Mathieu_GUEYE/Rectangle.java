
public class Rectangle {
    public static void main(String[] args) {
        // try {
        System.out.println("Le perimetre du rectangle de dimension (" + args[0] + " , " + args[1] + ") est : "
                + (2 * (Integer.parseInt(args[0]) + Integer.parseInt(args[1]))));
        System.out.println("Sa surface est : " + (Integer.parseInt(args[0]) * Integer.parseInt(args[1])));
        /*
         * } catch (IndexOutOfBoundsException e) {
         * System.out.println("ressayer avc des parametres"); } catch (Exception e) {
         * System.out.
         * println("Une erreur s'est produit lors de l'execution du programme"); }
         */
    }
}