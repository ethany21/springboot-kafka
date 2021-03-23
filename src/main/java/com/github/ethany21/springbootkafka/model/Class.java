package com.github.ethany21.springbootkafka.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Class {

    private Integer libraryEventId;
    private Student book;
}
