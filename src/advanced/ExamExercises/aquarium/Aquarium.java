package aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private String name;
    private int capacity;
    private int size;
    private List<Fish> fishInPool;

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    public int getFishInPool() {
        return fishInPool.size();
    }

    public Aquarium(String name, int capacity, int size) {
        this.name = name;
        this.capacity = capacity;
        this.size = size;
        fishInPool = new ArrayList<>();
    }

    public void add(Fish fish) {
        if(this.fishInPool.size() < this.capacity){
            this.fishInPool.add(fish);
        }

    }

    public Fish findFish(String name) {
        return fishInPool.stream()
                .filter(fish -> fish.getName().equals(name))
                .findFirst()
                .orElse(null);
    }


    public boolean remove(String name) {
        return fishInPool.removeIf(fish -> fish.getName().equals(name));
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Aquarium: %s ^ Size: %d%n", this.name,this.size));
        for (Fish fish : fishInPool) {
            sb.append(String.format("%s%n", fish.toString()));
        }
        return sb.toString().trim();
    }
}
