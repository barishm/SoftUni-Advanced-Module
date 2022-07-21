package oop.t4_InterfacesAndAbstraction.SayHello;

public class Bulgarian extends BasePerson {
    public Bulgarian(String name){
        super(name);
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}
