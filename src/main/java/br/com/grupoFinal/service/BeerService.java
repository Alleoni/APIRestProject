package br.com.grupoFinal.service;

import br.com.grupoFinal.api.BeerApi;
import br.com.grupoFinal.entities.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeerService {

@Autowired
private BeerApi beerApi;

    public List<Beer> getRandomBeer(){
        return beerApi.getRandomBeer();
    }

    public List<Beer> getBeerById(Long id){
        return beerApi.getBeerById(id);
    }

}
