package view;

import model.Basket;
import model.Fruits;
import model.FruitsComparator;

import java.util.Optional;

public class CalculateLongestFruitName implements Calculate<Basket>{

    @Override
    public void calculate(Basket basket) {
        Optional<Fruits> maxFruit = basket.getBasket().keySet().stream().max(new FruitsComparator());
        System.out.printf("Самое длинное название - %s, его длина %s символов%n", maxFruit.get().getName(),maxFruit.get().getNameLength());
    }
}
