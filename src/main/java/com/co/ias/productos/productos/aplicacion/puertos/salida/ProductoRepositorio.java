package com.co.ias.productos.productos.aplicacion.puertos.salida;

import com.co.ias.productos.productos.aplicacion.dominio.IdProducto;
import com.co.ias.productos.productos.aplicacion.dominio.Producto;

public interface ProductoRepositorio {
    Integer guardar(Producto producto);
     Producto consultar(IdProducto idProducto);
     void actualizar (Producto producto);
     void eliminar (IdProducto idProducto);
}
