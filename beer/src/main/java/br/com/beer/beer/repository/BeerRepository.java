package br.com.beer.beer.repository;

import br.com.beer.beer.Beer;
import br.com.beer.beer.entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BeerRepository extends JpaRepository<Beer, Long> {

    Optional<Beer> findByName(String name);
}
