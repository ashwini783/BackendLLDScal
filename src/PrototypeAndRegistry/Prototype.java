package PrototypeAndRegistry;

public interface Prototype<T> { // return type is generic because if anyclass is implementing it it will return the copy
                                  //of that object

    public T Copy();
}
