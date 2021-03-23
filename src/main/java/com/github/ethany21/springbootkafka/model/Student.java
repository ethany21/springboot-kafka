package com.github.ethany21.springbootkafka.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

    private Integer bookId;
    private String bookName;
    private String bookAuthor;

}
