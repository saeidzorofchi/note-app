package com.zorofchi.notes.simplenotesapp.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "notes")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;


    private String content;
}
