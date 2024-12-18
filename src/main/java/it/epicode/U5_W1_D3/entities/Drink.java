package it.epicode.U5_W1_D3.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
//@Table(name = "drinks")
@Data
public class Drink extends FoodAndDrink {


    @Override
    public String Descrizione() {

            return this.getName();
    }

    @Override
    public String prezzo() {
        return this.getPrice() + "€";
    }

    @Override
    public String calorie() {
        return this.getCalories() + " kcal";
    }
}
