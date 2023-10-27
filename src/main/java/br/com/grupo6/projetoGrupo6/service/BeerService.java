package br.com.grupo6.projetoGrupo6.service;

import br.com.grupo6.projetoGrupo6.api.BeerApi;
import br.com.grupo6.projetoGrupo6.entities.Beer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeerService {

@Autowired
private  BeerApi beerApi;

    public List<Beer> getRandomBeer(){
        return beerApi.getRandomBeer();
    }

    public List<Beer> getBeerById(Long id){
        return beerApi.getBeerById(id);
    }

}
