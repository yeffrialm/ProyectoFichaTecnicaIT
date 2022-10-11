package com.datasheet.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
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

@Table(name = "Changes")

public class Changes {
    @Id
    private UUID id;

    @Column
    private String description;

    @Column
    private LocalDateTime ChangesDateTime;

    //TODO agregar tipo de dato para trabajar con tipo de datos imagen codigoQR


}
