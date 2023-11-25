package com.practica.Tareas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tarea {
    @Id
    private String id;
    @Indexed(unique = true)
    private String name;
    private String description;
    private LocalDateTime created;
    private String completada;

    public Tarea(String name, String description, LocalDateTime created, String completada) {
        this.name = name;
        this.description = description;
        this.created = created;
        this.completada = completada;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public String getCompletada() {
        return completada;
    }

    public void setCompletada(String completada) {
        this.completada = completada;
    }
}
