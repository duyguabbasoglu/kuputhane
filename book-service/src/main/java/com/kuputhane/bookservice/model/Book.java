package com.kuputhane.bookservice.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "books")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private int year;

    private String isbn;
    private String location;

    private boolean available;

    private LocalDate dueDate;

    @Column(name = "availability_status")
    private String availabilityStatus;

    @Column(name = "published_year")
    private Integer publishedYear;

    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "publisher_id")
    private Integer publisherId;

    @Column(name = "image_url")
    private String imageUrl;
    
    public Boolean getAvailable() {
        return !this.available;
    }

}
