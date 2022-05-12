package com.co.ias.productos.productos.aplicacion.dominio;

import org.apache.commons.lang3.Validate;

public class TipoDeProducto {
    private final Integer value;


    public TipoDeProducto(Integer value){
        Validate.notNull(value,"el tipo de producto no puede ser nulo");
        this.value=value;
    }


    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
