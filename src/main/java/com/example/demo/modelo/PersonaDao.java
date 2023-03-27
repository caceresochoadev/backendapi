package com.example.demo.modelo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class PersonaDao implements PersonaRepositoryDao {

    public List<Persona> getPersonas(){
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("carlos","caceres",44,1.70));
        personas.add(new Persona("juan","perez",42,1.72));
        return personas;
    }
}
