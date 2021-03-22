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

    private Integer studentId;
    private String name;
    private String major;
    private LocalDate birthDate;


}
