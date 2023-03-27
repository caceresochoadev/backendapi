package com.example.demo.controlador;

import com.example.demo.modelo.Persona;
import com.example.demo.servicio.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/persona")
@CrossOrigin("*")
public class PersonaController {
    @Autowired
    private PersonaService personaService;
    @GetMapping("/all")
    public List<Persona> getCars(){
        return personaService.getPersonas();
    }
}
