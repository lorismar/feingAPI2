package com.example.FeignAPI2.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table( name = "usuario")
@NoArgsConstructor
public class UsuarioModel implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @Getter
    @Setter
    public Long id;


    @Getter
    @Setter
    public String nome;


    @Getter
    @Setter
    public String instagram;

    @Override
    public String toString() {
        return "UsuarioModel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", instagram='" + instagram + '\'' +
                '}';
    }
}

