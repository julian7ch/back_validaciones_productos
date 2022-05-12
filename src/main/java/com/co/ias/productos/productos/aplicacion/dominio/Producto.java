package com.co.ias.productos.productos.aplicacion.dominio;

public class Producto {
    private final NombreProducto nombreProducto;
    private final IdProducto idProducto;
    private final DescuentoDeProducto productoDescuento;
    private final TipoDeProducto tipoDeProducto;
    private final PrecioProducto precioProducto;

    public Producto(NombreProducto nombreProducto, IdProducto idProducto, DescuentoDeProducto productoDescuento, TipoDeProducto tipoDeProducto, PrecioProducto precioProducto){
        this.nombreProducto=nombreProducto;
        this.idProducto=idProducto;
        this.productoDescuento = productoDescuento;
        this.tipoDeProducto=tipoDeProducto;
        this.precioProducto = precioProducto;
    }

    public NombreProducto getNombreProducto() {
        return nombreProducto;
    }

    public IdProducto getIdProducto() {
        return idProducto;
    }

    public DescuentoDeProducto getProductoDescuento() {
        return productoDescuento;
    }

    public TipoDeProducto getTipoDeProducto() {
        return tipoDeProducto;
    }

    public PrecioProducto getPrecioProducto() {
        return precioProducto;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombreProducto=" + nombreProducto +
                ", idProducto=" + idProducto +
                ", productoDescuento=" + productoDescuento +
                ", tipoDeProducto=" + tipoDeProducto +
                ", precioProducto=" + precioProducto +
                '}';

    }
}
