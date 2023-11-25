package com.practica.Tareas;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TareaService {

    private final TareaRepository tareaRepository;

    public TareaService(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    public List<Tarea> getTarea(){
        return tareaRepository.findAll();
    }
    public Tarea getTareaById(String id){
        return tareaRepository.findById(id).orElse(null);
    }
    public Tarea saveTarea(Tarea tarea){
        tarea.setCreated(LocalDateTime.now());
        return tareaRepository.save(tarea);
    }
    public Tarea updateTarea(Tarea tarea){
        //Para actualizar una tarea, esta debe existir
        //Si no existe, no hacemos nada o podemos retornar una tarea null

        Tarea tareaExistente = tareaRepository.findByName(tarea.getName());

        if(tareaExistente != null){
            Tarea tareaTemp = tareaExistente;
            tareaTemp.setName(tarea.getName());
            tareaTemp.setDescription(tarea.getDescription());
            tareaTemp.setCompletada(tarea.getCompletada());
            return tareaRepository.save(tareaTemp);
        }else{
            return tareaRepository.save(tarea);
        }
    }
    public Tarea deleteTarea(String id){
        //Para eliminar este debe existir
        Optional<Tarea> tareaExistente = tareaRepository.findById(id);
        Tarea tareaBorrar = tareaExistente.get();
        if(tareaExistente.isPresent()){
            //eliminamos
            tareaRepository.delete(tareaBorrar);
        }
        return tareaBorrar;
    }
}
