package test;

public class Checker {
    public static boolean isNumber(String checkingString) {
        String check = "0123456789";
        boolean found = true;
        for (int i = 0; i < checkingString.length(); i++) {
            for (int j = 0; j < check.length(); j++) {
                if (checkingString.charAt(i) != check.charAt(j))
                    found = false;
                else {
                    found = true;
                    break;
                }
            }
            if (found == false)
                return false;
        }
        return true;
    }
}