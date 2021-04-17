package com.ksiazki.openapi;

import com.ksiazki.openapi.model.Ksiazka;
import com.ksiazki.openapi.service.KsiazkaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ksiazka")
public class KsiazkaApi {

   private final KsiazkaService ksiazkaService;

    public KsiazkaApi(KsiazkaService ksiazkaService) {
        this.ksiazkaService = ksiazkaService;
    }

    @GetMapping
    public List<Ksiazka> getAllKsiazki(){
        return ksiazkaService.listaKsiazek;
    }

    @GetMapping("/nazwa/{nazwa}")
    public Ksiazka getKsiazkaByNazwa(@PathVariable String nazwa){
        return ksiazkaService.listaKsiazek.stream()
                .filter(ksiazka -> ksiazka.getNazwa().equals(nazwa)).findFirst().get();
    }

    @GetMapping("/iban/{iban}")
    public Ksiazka getKsiazkaByIban(@PathVariable String iban){
        return ksiazkaService.listaKsiazek.stream()
                .filter(ksiazka -> ksiazka.getIban().equals(iban)).findFirst().get();
    }
}
