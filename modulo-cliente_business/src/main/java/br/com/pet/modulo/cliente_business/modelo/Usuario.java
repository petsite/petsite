/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pet.modulo.cliente_business.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 *
 * @author leonardo
 */
@Entity
public class Usuario extends EntidadeChaveComposta implements Serializable {

    @EmbeddedId
    private UsuarioPK identificador;

    @Column(name = "nome", nullable = false, length = 255)
    private String nome;

    @Column(name = "sobrenome", nullable = true, length = 255)
    private String sobreNome;

    public Usuario() {
        identificador = new UsuarioPK();
    }

    @Override
    public UsuarioPK getIdentificador() {
        return identificador;
    }

    public void setIdentificador(UsuarioPK identificador) {
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

}
