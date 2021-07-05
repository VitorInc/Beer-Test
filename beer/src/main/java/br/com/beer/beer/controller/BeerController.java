package br.com.beer.beer.controller;

import br.com.beer.beer.dto.BeerDTO;
import br.com.beer.beer.exception.BeerAlreadyRegisteredException;
import br.com.beer.beer.service.BeerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/beer")

@AllArgsConstructor(onConstructor = @__(@Autowired))

public class BeerController implements BeerControllercDocs{


    private final BeerService beerService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BeerDTO createBeer(@RequestBody @Valid BeerDTO beerDTO) throws BeerAlreadyRegisteredException {
        return beerService.createBeer(beerDTO);
    }


    @Override
    public String helloAPI() {
        return null;
    }
}