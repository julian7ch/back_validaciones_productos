package com.co.ias.productos;

import com.co.ias.productos.productos.aplicacion.dominio.*;
import com.co.ias.productos.productos.aplicacion.modelos.ProductoDTO;

public class AplicacionTest {
    public static void main(String[] args) {
        try {
            NombreProducto nombreProducto = new NombreProducto("televisor");
            IdProducto idProducto= new IdProducto(23);
            DescuentoDeProducto descuentoDeProducto =new DescuentoDeProducto(1);
            TipoDeProducto tipoDeProducto =new TipoDeProducto(2);
            PrecioProducto precioProducto= new PrecioProducto(null);

            Producto producto = new Producto(nombreProducto,idProducto, descuentoDeProducto,tipoDeProducto, precioProducto );

            //para salida de datos
            ProductoDTO productoDTO= ProductoDTO.desdeDominio(producto);

            //para entrada al repositorio
            Producto producto1 = productoDTO.haciaDominio();

        }catch (NullPointerException | IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        };
    }
}
