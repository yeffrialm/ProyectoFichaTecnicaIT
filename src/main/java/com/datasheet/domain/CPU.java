package com.datasheet.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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

@Table(name = "CPU")

public class CPU {
    @Id
    private UUID id;

    @Column
    private String brand;

    @Column
    private String family;

    @Column
    private String socket;

    @Column
    private String fsb;


}
