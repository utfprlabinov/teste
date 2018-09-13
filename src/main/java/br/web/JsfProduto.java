/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.web;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author utfpr
 */
@Named(value = "jsfProduto")
@RequestScoped
public class JsfProduto {

    /**
     * Creates a new instance of JsfProduto
     */
    public JsfProduto() {
    }
 
    public java.util.Collection<br.data.entity.Produto> getAll() {
        return new br.data.crud.CrudProduto().getAll();
    }
}
