package com.datasheet.domain;

import lombok.*;
import javax.persistence.*;


/**
 * @author jelfry on 11/10/2022.
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity

@Table(name = "Computer")
public class Computer {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @Column
        private String brand;

        @Column
        private String model;

        @Column
        private String format;

        @Column
        private String serialTag;

        //TODO agregar tipo de datos para trabajar con tipo de datos de imagen blob

        @OneToOne
        private Business business;

        @OneToOne
        private Software software;

        @OneToMany

        private Hardware hardware;

        @OneToMany
        private Changes changes;
}
