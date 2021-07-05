package br.com.beer.beer.service;

import br.com.beer.beer.entity.Beer;
import br.com.beer.beer.dto.BeerDTO;
import br.com.beer.beer.exception.BeerAlreadyRegisteredException;
import br.com.beer.beer.mapper.BeerMapper;
import br.com.beer.beer.repository.BeerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BeerService {

    private final BeerRepository beerRepository;
    private final BeerMapper beerMapper = BeerMapper.INSTANCE;

    public BeerDTO createBeer(BeerDTO beerDTO) throws BeerAlreadyRegisteredException {
        Optional<Beer> optSavedBeer = beerRepository.findByName(beerDTO.getName());
        if (optSavedBeer.isPresent()) {
            throw new BeerAlreadyRegisteredException(beerDTO.getName());
        }
        Beer beer = beerMapper.toModel(beerDTO);
        Beer savedBeer = beerRepository.save(beer);
        return beerMapper.toDTO(savedBeer);
    }
}