package it.epicode.U5_W1_D3.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
//@Table(name = "toppings")
@Data
public class Topping extends FoodAndDrink {

    @ManyToMany
    @ToString.Exclude
    List<Pizza> pizzas = new ArrayList<>();

    @Override
    public String Descrizione() {
        return getName();
    }

    @Override
    public String prezzo() {
        return getPrice() + "€";
    }

    @Override
    public String calorie() {
        return getCalories() + "Kcal";
    }
}
