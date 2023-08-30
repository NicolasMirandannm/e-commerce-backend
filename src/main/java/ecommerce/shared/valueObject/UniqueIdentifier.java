package ecommerce.shared.valueObject;

import ecommerce.commun.exceptions.UniqueIdentifierException;

import java.time.temporal.ValueRange;
import java.util.UUID;

public class UniqueIdentifier extends ValueObject<String> {
    private UniqueIdentifier(String id) {
        super(id);
    }

    public static UniqueIdentifier create(String id) {
        if (id == null) throw new UniqueIdentifierException("Identificador vazio!");

        try {
            return new UniqueIdentifier(UUID.fromString(id).toString());
        } catch (IllegalArgumentException ex) {
            throw new UniqueIdentifierException("Identificador inválido!");
        }
    }

    public static UniqueIdentifier create() {
        return new UniqueIdentifier(UUID.randomUUID().toString());
    }
}
