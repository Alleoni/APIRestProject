package br.com.grupo6.projetoGrupo6.controller;

import br.com.grupo6.projetoGrupo6.entities.Beer;
import br.com.grupo6.projetoGrupo6.service.BeerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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

    @GetMapping("/{id}")
    public List<Beer> findById(@PathVariable Long id){
        return beerService.getBeerById(id);
    }

    @GetMapping("/random")
    public List<Beer> getRandomBeer(){
        return beerService.getRandomBeer();
    }

}
