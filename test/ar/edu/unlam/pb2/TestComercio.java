package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestComercio {

	@Test
	public void testQueSeAgregueUnProductoALaListaDelComercio() {
		Producto miProducto1 = new Producto(3000.0, "234G", "Termo");
		Comercio miComercio = new Comercio("El Chino Loco");
		
		Boolean agrego = miComercio.agregarProducto(miProducto1);
		assertTrue(agrego);
		
		
		Integer valorEsperado = 1;
		Integer valorObtenido = miComercio.obtenerCantidadProductos();	
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void testQueObtengaUnProductoDeLaListaDelComercio() {
		Comercio miComercio = new Comercio("El Chino Loco");
		Producto miProducto1 = new Producto(3000.0, "234G", "Termo");
		Producto miProducto2 = new Producto(300.0, "234D", "Bombilla");
		Producto miProducto3 = new Producto(700.0, "234K", "Mate");
		
		miComercio.agregarProducto(miProducto3);
		miComercio.agregarProducto(miProducto2);
		miComercio.agregarProducto(miProducto1);
		
		String codigo = "234G";
		Producto productoEncontrado = miComercio.buscarProductoPorCodigo(codigo);
		
		assertEquals(codigo, productoEncontrado.getCodigo());
	}

}
