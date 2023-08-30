package ecommerce.shared.valueObject;

import ecommerce.commun.exceptions.UniqueIdentifierException;
import org.junit.Assert;
import org.junit.Test;

public class UniqueIdentifierTest {

    @Test
    public void should_create_a_instance_of_uniqueIdentifier_with_valid_uuid_parameter() {
        var validUUID = "9bb4b9ef-8059-41de-ac1e-fe24c8b62566";

        var uniqueIdentifier = UniqueIdentifier.create(validUUID);

        Assert.assertNotNull(uniqueIdentifier);
        Assert.assertEquals(uniqueIdentifier.getValue(), validUUID);
    }

    @Test
    public void should_throw_a_uniqueIdentifierException_when_parameter_is_an_invalid_uuid() {
        var exception = Assert.assertThrows(UniqueIdentifierException.class, () -> {
            UniqueIdentifier.create("invalid_id");
        });

        Assert.assertEquals(exception.getMessage(), "Identificador inválido!");
    }

    @Test
    public void should_throw_a_uniqueIdentifierException_when_parameter_is_null() {
        var exception = Assert.assertThrows(UniqueIdentifierException.class, () -> {
            UniqueIdentifier.create(null);
        });

        Assert.assertEquals(exception.getMessage(), "Identificador vazio!");
    }

    @Test
    public void should_create_a_instance_of_uniqueIdentifier_without_parameter() {
        var uniqueIdentifier = UniqueIdentifier.create();

        Assert.assertNotNull(uniqueIdentifier);
        Assert.assertNotNull(uniqueIdentifier.getValue());

    }
}
