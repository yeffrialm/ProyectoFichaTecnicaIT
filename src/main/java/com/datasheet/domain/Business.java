package com.datasheet.domain;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

/**
 * @author jelfry on 11/10/2022.
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity

@Table(name = "Business")

public class Business {
    @Id
    private UUID id;

    @Column
    private String name;

    //TODO agregar tipo de dato para trabajar con imagen tipo blob


}
