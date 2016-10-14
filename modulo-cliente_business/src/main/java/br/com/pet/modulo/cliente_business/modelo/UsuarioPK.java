/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pet.modulo.cliente_business.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author leonardo
 */
@Embeddable
public class UsuarioPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "sequencial", nullable = false)
    private int sequencial;

    @Column(name = "telefone", nullable = false, length = 20)
    private String telefone;

    public UsuarioPK() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSequencial() {
        return sequencial;
    }

    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
