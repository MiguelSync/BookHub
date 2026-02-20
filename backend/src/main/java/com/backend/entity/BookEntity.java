package com.backend.entity;

import com.backend.enums.BookEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "book")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private int status;

    /**
     * Verify is a book is avaiable
     * @return Return if the book is avaiable
     */
    public boolean isAvaiable() {
        return this.status == BookEnum.STATUS_AVAIABLE.getValue();
    }
}
