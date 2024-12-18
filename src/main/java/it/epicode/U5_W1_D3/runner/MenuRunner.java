package it.epicode.U5_W1_D3.runner;


import it.epicode.U5_W1_D3.entities.Drink;
import it.epicode.U5_W1_D3.entities.Menu;
import it.epicode.U5_W1_D3.entities.Pizza;
import it.epicode.U5_W1_D3.entities.Topping;
import it.epicode.U5_W1_D3.repo.DrinkRepository;
import it.epicode.U5_W1_D3.repo.MenuRepository;
import it.epicode.U5_W1_D3.repo.PizzaRepository;
import it.epicode.U5_W1_D3.repo.ToppingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Order(3)
public class MenuRunner implements ApplicationRunner {

    @Autowired
    private MenuRepository menuRepo;
    @Autowired
    private PizzaRepository pizzaRepo;
    @Autowired
    private DrinkRepository drinkRepo;
    @Autowired
    private ToppingRepository toppingRepo;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {


        Menu menu = new Menu();
        List<Pizza> pizze = pizzaRepo.findAll();
        List<Drink> drinks = drinkRepo.findAll();
        List<Topping> toppings = toppingRepo.findAll();
        menu.setPizzas(pizze);
        menu.setToppings(toppings);
        menu.setDrinks(drinks);

        menuRepo.save(menu);

        menu.stampaMenu();



    }

}
