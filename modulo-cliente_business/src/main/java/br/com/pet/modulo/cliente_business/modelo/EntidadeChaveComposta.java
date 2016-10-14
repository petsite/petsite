/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pet.modulo.cliente_business.modelo;

import java.io.Serializable;

public abstract class EntidadeChaveComposta extends Entidade {

    private boolean persistido;

    @Override
    public int getId() {
        throw new UnsupportedOperationException("Método não suportado.");
    }

    public abstract Serializable getIdentificador();

    public void marcarPersistido() {
        persistido = true;
    }

    public boolean isPersistido() {
        return persistido;
    }
}
