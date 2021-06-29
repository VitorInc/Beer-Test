package br.com.beer.beer.repository.entity;

import br.com.beer.beer.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeerRepository extends JpaRepository<Beer, Long> {

    Beer findByName(String name);
}
