package com.practica.Tareas;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/tareas")
public class TareaController {
    private final TareaService tareaService;

    public TareaController(TareaService tareaService) {
        this.tareaService = tareaService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Tarea>> getAllTareas(){
        return ResponseEntity.ok( tareaService.getTarea());
    }

    @GetMapping("/byid/{id}")
    public Tarea getTareaById(@PathVariable String id){
        return tareaService.getTareaById(id);
    }

    @PostMapping("/save")
    ResponseEntity <Tarea> saveTarea(@RequestBody Tarea tarea){
        tareaService.saveTarea(tarea);
        return ResponseEntity.ok(tarea);
    }

    @PutMapping("/update")
    ResponseEntity <Tarea> updateTarea(@RequestBody Tarea tarea){
        tareaService.updateTarea(tarea);
        return ResponseEntity.ok(tarea);
    }

    //Metodo para eliminar un student
    @DeleteMapping("/delete/{id}")
    public  Tarea deleteTarea(@PathVariable String id){
        return tareaService.deleteTarea(id);
    }

}
