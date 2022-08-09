package oop.t5_Polymorphism.WildFarm;

public abstract class Food {
    private Integer quantity;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Food(Integer quantity) {
        this.quantity = quantity;
    }
}
