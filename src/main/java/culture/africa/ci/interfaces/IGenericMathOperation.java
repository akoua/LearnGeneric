package culture.africa.ci.interfaces;

@FunctionalInterface
public interface IGenericMathOperation<T extends Number, U extends Number> {
    <V extends Comparable<V>> Number calculate(T nb1, U nb2);
}
