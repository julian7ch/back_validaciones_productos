package com.co.ias.productos.productos.aplicacion.modelos;

import com.co.ias.productos.productos.aplicacion.dominio.*;

public class ProductoDTO {
    //atributos encapsulados
    private Integer idProducto;
    private String nombre;
    private Integer descuento;
    private Integer tipoDeProducto;
    private Integer precio;

    public ProductoDTO(Integer idProducto, String nombre, Integer descuento, Integer tipoDeProducto, Integer precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descuento = descuento;
        this.tipoDeProducto = tipoDeProducto;
        this.precio = precio;
    }

    //metodos para tranformar información hacia el domincio y del domicio al DTO
    public static ProductoDTO desdeDominio(Producto producto){
        return new ProductoDTO(
                producto.getIdProducto().getValue(),
                producto.getNombreProducto().getValue(),
                producto.getProductoDescuento().getValue(),
                producto.getTipoDeProducto().getValue(),
               producto.getPrecioProducto().getValue());

    }

    public Producto haciaDominio(){
        return new Producto(
                new NombreProducto(nombre),
                new IdProducto(idProducto),
                new DescuentoDeProducto(descuento),
                new TipoDeProducto(tipoDeProducto),
                new PrecioProducto(precio));
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDescuento() {
        return descuento;
    }

    public void setDescuento(Integer descuento) {
        this.descuento = descuento;
    }

    public Integer getTipoDeProducto() {
        return tipoDeProducto;
    }

    public void setTipoDeProducto(Integer tipoDeProducto) {
        this.tipoDeProducto = tipoDeProducto;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ProductoDTO{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", descuento=" + descuento +
                ", tipoDeProducto=" + tipoDeProducto +
                ", precio=" + precio +
                '}';
    }
}
