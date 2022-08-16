package oop.exams.Exam18Apr2022.zoo.repositories;

import oop.exams.Exam18Apr2022.zoo.entities.foods.Food;

public interface FoodRepository {
    void add(Food food);

    boolean remove(Food food);

    Food findByType(String type);
}
