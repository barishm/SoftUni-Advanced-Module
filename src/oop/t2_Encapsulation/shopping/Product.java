package oop.t2_Encapsulation.shopping;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        setName(name);
        setCost(cost);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if(cost < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.cost = cost;
    }
}
