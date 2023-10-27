package br.com.grupo6.projetoGrupo6.api;

import br.com.grupo6.projetoGrupo6.entities.Beer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "beer-client", url = "https://api.punkapi.com/v2/beers")
public interface BeerApi {

    @GetMapping(value = "/random")
    public List<Beer> getRandomBeer();

    @GetMapping(value = "/{id}")
    List<Beer> getBeerById(@PathVariable("id") Long id);

}
