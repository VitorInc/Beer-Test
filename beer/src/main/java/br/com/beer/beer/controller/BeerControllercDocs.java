package br.com.beer.beer.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api("Manags beer stock")
public interface BeerControllercDocs {

    @ApiOperation(value = "Hello world!!")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Returns a simple hello word")

    })
    String helloAPI();
}
