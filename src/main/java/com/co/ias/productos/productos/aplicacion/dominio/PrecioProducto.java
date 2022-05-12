package com.co.ias.productos.productos.aplicacion.dominio;

import org.apache.commons.lang3.Validate;

public class PrecioProducto {
    private final Integer value;

    public PrecioProducto(Integer value) {
        Validate.notNull(value,"el precio del producto no puede ser nulo");
        Validate.inclusiveBetween(0,10000,value,"el rango de precio de los productos debe estar entre cero (o) y 10000");
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "PrecioProducto{" +
                "value=" + value +
                '}';
    }
}
