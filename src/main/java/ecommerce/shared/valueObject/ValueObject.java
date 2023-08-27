package ecommerce.shared.valueObject;

public abstract class ValueObject<T> {
    protected T value;

    public ValueObject(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }
}
