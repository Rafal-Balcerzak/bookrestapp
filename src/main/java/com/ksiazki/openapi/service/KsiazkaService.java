package com.ksiazki.openapi.service;

import com.ksiazki.openapi.model.Ksiazka;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class KsiazkaService {
    public List<Ksiazka> listaKsiazek = Arrays.asList(
            new Ksiazka("PL55 3785 2894 5895 8595 5883 5555", "W_pustyni_i_w_puszczy"),
            new Ksiazka("PL66 2234 1231 2322 5324 1523 5343", "Pan_Tadeusz"),
            new Ksiazka("PL11 2421 4253 5312 2341 3424 2423", "Kubus_Puchatek")
    );
}
