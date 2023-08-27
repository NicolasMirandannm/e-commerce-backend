package ecommerce.commun.exceptions;

import ecommerce.commun.ExceptionMessageValidator;

public class UniqueIdentifierException extends RuntimeException {
    public UniqueIdentifierException(String OptionalMessage) {
        super(ExceptionMessageValidator.perform(OptionalMessage) ? OptionalMessage : "Identificador inválido!");
    }

}
