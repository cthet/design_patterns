package prototype;

public class Client {
    public static void main(String[] args) {
        ConcretePrototypeA prototypeA1 = new ConcretePrototypeA("A1");
        ConcretePrototypeA prototypeA2 = (ConcretePrototypeA) prototypeA1.clone();

        System.out.println(prototypeA1);//ConcretePrototypeA [field=A1]
        System.out.println(prototypeA2);//ConcretePrototypeA [field=A1]

        ConcretePrototypeB prototypeB1 = new ConcretePrototypeB("B1");
        ConcretePrototypeB prototypeB2 = (ConcretePrototypeB) prototypeB1.clone();

        System.out.println(prototypeB1);//ConcretePrototypeB [field=B1]
        System.out.println(prototypeB2);//ConcretePrototypeB [field=B1]
    }
}
