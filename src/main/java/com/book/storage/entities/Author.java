package com.book.storage.entities;


import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Data
@Component
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private int age;
    private Date birthday;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="authorId")
    private Set<Book> books;

}
