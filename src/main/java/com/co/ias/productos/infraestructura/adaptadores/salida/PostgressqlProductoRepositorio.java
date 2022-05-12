package com.co.ias.productos.infraestructura.adaptadores.salida;

import com.co.ias.productos.productos.aplicacion.dominio.IdProducto;
import com.co.ias.productos.productos.aplicacion.dominio.Producto;
import com.co.ias.productos.productos.aplicacion.puertos.salida.ProductoRepositorio;
import org.springframework.stereotype.Repository;

@Repository
public class PostgressqlProductoRepositorio implements ProductoRepositorio {
    @Override
    public Integer guardar(Producto producto) {
        return null;
    }

    @Override
    public Producto consultar(IdProducto idProducto) {
        return null;
    }

    @Override
    public void actualizar(Producto producto) {

    }

    @Override
    public void eliminar(IdProducto idProducto) {

    }
}
