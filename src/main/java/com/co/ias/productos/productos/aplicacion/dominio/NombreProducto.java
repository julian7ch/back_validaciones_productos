package com.co.ias.productos.productos.aplicacion.dominio;

import org.apache.commons.lang3.Validate;

public class NombreProducto {
    private final String value;

    public NombreProducto(String value) {
        Validate.notNull(value,"el nombre del producto no puede ser nulo");
        Validate.isTrue(value.length()<=40,"el nombre del articulo no puede superar 40 caracteres");
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
