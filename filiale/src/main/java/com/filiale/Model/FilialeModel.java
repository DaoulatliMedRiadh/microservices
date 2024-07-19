package com.filiale.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FilialeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "filialeId", nullable = false)
    private int filialeId;
    private String filialeName;
    private int entrepriseId;

    public FilialeModel(String filialeName, int entrepriseId) {
        this.filialeName = filialeName;
        this.entrepriseId = entrepriseId;
    }
}
