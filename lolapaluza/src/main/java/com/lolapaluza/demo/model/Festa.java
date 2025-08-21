package com.lolapaluza.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "festa")
public class Festa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "quantidadeDePessoas")
    private int quantidadeDePessoas;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "festa_id", referencedColumnName = "id")
    private List<Pessoa> pessoas;


}
