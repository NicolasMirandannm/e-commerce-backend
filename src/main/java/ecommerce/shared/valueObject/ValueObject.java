package ecommerce.shared.valueObject;

public abstract class ValueObject<T> {
    private final T value;

    public ValueObject(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }
}
