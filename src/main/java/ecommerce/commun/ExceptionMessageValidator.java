package ecommerce.commun;

public class ExceptionMessageValidator {
    public static Boolean perform(String msg) {
        if (msg == null)
            return false;
        else if (msg.length() == 0)
            return false;
        else
            return true;
    }
}
