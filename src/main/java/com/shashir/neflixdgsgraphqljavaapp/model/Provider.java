package com.shashir.neflixdgsgraphqljavaapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "provider")
public class Provider {

    @Id
    @Column(name = "PROVIDER_NUMBER")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String providerNumber;
    private String name;
}
