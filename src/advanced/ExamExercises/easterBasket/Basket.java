package easterBasket;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Basket {
    private String material;
    private int capacity;
    private List<Egg> data;

    public Basket(String material, int capacity) {
        this.material = material;
        this.capacity = capacity;
        data = new ArrayList<>();
    }
    public void addEgg(Egg egg){
        if(this.data.size() < this.capacity){
            this.data.add(egg);
        }
    }
    public boolean removeEgg(String color){
        return data.removeIf(egg -> egg.getColor().equals(color));
    }
    public Egg getStrongestEgg(){
        return data.stream().sorted(Comparator.comparing(Egg::getStrength).reversed()).findFirst().orElse(null);
    }
    public Egg getEgg(String color){
        return data.stream()
                .filter(person -> person.getColor().equals(color))
                .findFirst()
                .orElse(null);
    }
    public int getCount(){
        return data.size();
    }
    public String report(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s basket contains:%n", this.material));
        for (Egg egg : data) {
            sb.append(String.format("%s%n", egg.toString()));
        }
        return sb.toString().trim();
    }


}
