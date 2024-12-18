package it.epicode.U5_W1_D3.repo;

import it.epicode.U5_W1_D3.entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ToppingRepository extends JpaRepository<Topping,Long> {

}
