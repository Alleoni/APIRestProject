package br.com.grupoFinal.controller;

import br.com.grupoFinal.entities.Beer;
import br.com.grupoFinal.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/beer")
public class BeerController {

    @Autowired
    private BeerService beerService;

    @GetMapping("/teste")
    public ResponseEntity<?> teste() {
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping("/{id}")
    public List<Beer> findById(@PathVariable Long id){
        return beerService.getBeerById(id);
    }

    @GetMapping("/random")
    public List<Beer> getRandomBeer(){
        return beerService.getRandomBeer();
    }

}
