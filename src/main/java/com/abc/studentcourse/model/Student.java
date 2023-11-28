package com.abc.studentcourse.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.*;


@Data
@Getter
@Setter
@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
@Table(name="students")
public class Student{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column
    private long id;

    @Column
    @Size(max = 20, message = "First name must be less than 20 characters")
    private String fistName;
    @Column
    @Size(max = 20, message = "Last name must be less than 20 characters")
    private  String lastName;
    @Column
    @Email(message = "Please provide valid email address")
    private String emailid;
}