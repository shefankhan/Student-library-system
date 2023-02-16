package com.example.Student_Library_Management_System.Models;

import com.example.Student_Library_Management_System.Enums.genre;
import jakarta.persistence.*;
import org.hibernate.mapping.Value;

@Entity
@Table(name="book")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int pages;
    @Enumerated(value =EnumType.STRING)
    private genre genre;

    @ManyToOne
    @JoinColumn
    private Author author;



    //also child for card
    @ManyToOne
    @JoinColumn
    private Card card;

    public Books() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public com.example.Student_Library_Management_System.Enums.genre getGenre() {
        return genre;
    }

    public void setGenre(com.example.Student_Library_Management_System.Enums.genre genre) {
        this.genre = genre;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
