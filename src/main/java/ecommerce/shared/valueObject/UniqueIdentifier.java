package ecommerce.shared.valueObject;

import java.util.UUID;

public class UniqueIdentifier extends ValueObject<String> {
    private UniqueIdentifier(String id) {
        super(id);
    }

    public static UniqueIdentifier create(String id) {
        return null;
    }

    public static UniqueIdentifier create() {
        return null;
    }
}
