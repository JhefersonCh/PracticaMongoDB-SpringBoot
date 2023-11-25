package com.practica.Tareas;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TareaRepository extends MongoRepository <Tarea, String> {
    Tarea findByName(String name);

}
