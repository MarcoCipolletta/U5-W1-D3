package it.epicode.U5_W1_D3.repo;

import it.epicode.U5_W1_D3.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PizzaRepository extends JpaRepository<Pizza, Long> {

}
