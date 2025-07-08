package chap2_7.lambda.fruit;

@FunctionalInterface
public interface GenericMapping<T> {

    Object test(T t);
}
