package com.co.ias.productos.productos.aplicacion.dominio;

import org.apache.commons.lang3.Validate;

public class IdProducto {
    private final Integer value;

    public IdProducto(Integer value) {
        Validate.notNull(value,"el ID del producto no puede ser nulo");
        Validate.isTrue(value<=999999999,"el ID del producto debe contener menos de 9 digitos");
        Validate.isTrue(value>=0,"el ID del producto debe ser positivo");
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
