/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pet.modulo.cliente_business.modelo;

import java.io.Serializable;

public abstract class Entidade implements Serializable {

    public Entidade() {
    }

    public abstract int getId();

    public void setId() {
        throw new IllegalAccessError("Método não suportado.");
    }

    @Override
    public boolean equals(Object o) {

        if (o instanceof Entidade) {

            Entidade entidade = (Entidade) o;
            return getId() == entidade.getId();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return getId();
    }

}
