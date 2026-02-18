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
     * Validate if a book can be deleted
     * @return return if the book can be deleted
     */
    public boolean canDelete() {
        return this.status == BookEnum.STATUS_DISPONIVEL.getValue();
    }
}
