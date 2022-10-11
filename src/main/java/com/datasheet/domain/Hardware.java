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

@Table(name = "Hardware")

public class Hardware {
    @Id
    private UUID id;

    @OneToMany
    private CPU cpu;

    @OneToMany
    private RAM ram;

    @OneToMany
    private Storage storage;

}
