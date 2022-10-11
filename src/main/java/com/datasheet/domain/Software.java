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

@Table(name = "Software")

public class Software {
    @Id
    private UUID id;

    @Column
    private String operatingSystem;

    @Column
    private String productKey;

}
