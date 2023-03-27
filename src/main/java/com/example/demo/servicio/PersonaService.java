package com.example.demo.servicio;

import com.example.demo.modelo.Persona;
import com.example.demo.modelo.PersonaDao;
import com.example.demo.modelo.PersonaRepositoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepositoryDao personaDao;

    public List<Persona> getPersonas(){
        return personaDao.getPersonas();
    }

}
