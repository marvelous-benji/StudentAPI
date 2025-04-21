package com.wilson.studentApi.student;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.NotFound;

import java.time.LocalDate;
import java.time.Period;



@NoArgsConstructor
@Data
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(name="student",indexes = {
        @Index(name = "idx_email", columnList = "email", unique = true)
})
public class Student {

    @Id
    @GeneratedValue
    private int id;

    @Column(length = 80)
    private String firstName;


    @Column(length = 80)
    private String lastName;


    private LocalDate dateOfBirth;

    @Column(unique=true, length = 150)
    @ToString.Include private String email;

    @Transient
    private int age;


    public int getAge() {
        return Period.between(dateOfBirth,LocalDate.now()).getYears();
    }

}
