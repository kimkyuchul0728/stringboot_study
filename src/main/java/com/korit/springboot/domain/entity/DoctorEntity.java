package com.korit.springboot.domain.entity;


import io.swagger.v3.oas.annotations.callbacks.Callback;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "doctor_tb")
public class DoctorEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "doctor_id")
    private Integer id;
    private String doctorName;
    private Integer departmentId;

}
