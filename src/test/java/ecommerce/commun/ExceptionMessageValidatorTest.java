package ecommerce.commun;

import org.junit.Assert;
import org.junit.Test;

public class ExceptionMessageValidatorTest {

    @Test
    public void should_return_false_when_message_is_null() {
        var isValidMessage = ExceptionMessageValidator.perform(null);
        Assert.assertFalse(isValidMessage);
    }

    @Test
    public void should_return_false_when_message_is_empty() {
        var isValidMessage = ExceptionMessageValidator.perform("");
        Assert.assertFalse(isValidMessage);
    }

    @Test
    public void should_return_true_when_message_is_valid() {
        var isValidMessage = ExceptionMessageValidator.perform("Mensagem válida");
        Assert.assertTrue(isValidMessage);
    }
}
