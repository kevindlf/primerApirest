package com.uch.apirest.controllers;

import com.uch.apirest.models.Auto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class NamesControllers {

    @GetMapping("/names")
    public String holaMundo() {
        return "Hola Mundo en api rest";
    }

    @GetMapping("/autos")
    public List<Auto> getAutos() {
        Auto[] autos = new Auto[3];

        // Inicializar los objetos Auto y añadirlos al arreglo
        autos[0] = new Auto("Toyota", "Corolla", 2020);
        autos[1] = new Auto("Honda", "Civic", 2019);
        autos[2] = new Auto("Ford", "Focus", 2018);

        List<Auto> autoList = Arrays.asList(autos);

        // Usar forEach para modificar la marca de cada auto
        autoList.forEach(auto -> {
            auto.setMarca("test");
            auto.setAño(auto.getAño() + 7);
        });

        return autoList;
    }
}
