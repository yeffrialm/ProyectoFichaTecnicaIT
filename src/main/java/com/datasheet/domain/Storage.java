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

@Table(name = "Storage")

public class Storage {
    @Id
    private UUID id;

    @Column
    private String diskDrives;

    @Column
    private String hdInterface;

    @Column
    private String brand;

    @Column
    private String model;

    @Column
    private String serial;

    @Column
    private int capacity;

    
}
