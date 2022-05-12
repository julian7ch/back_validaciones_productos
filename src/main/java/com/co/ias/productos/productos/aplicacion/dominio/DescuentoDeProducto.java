package com.co.ias.productos.productos.aplicacion.dominio;

import org.apache.commons.lang3.Validate;

public class DescuentoDeProducto {
    private final Integer value;

    public DescuentoDeProducto(Integer  value) {
        Validate.notNull(value,"el descuento del producto no puede ser nulo");
        Validate.isTrue(value>=0,"el descuento del producto debe ser un valor positivo");
        Validate.isTrue(value<=80,"el descuento del producto no puede superar el 80 porciento");

//        Integer start=0,end=80;
//        Validate.inclusiveBetween(start,end,value);
        this.value = value;
    }

    public Integer  getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}

