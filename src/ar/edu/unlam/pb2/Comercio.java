package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Comercio {
	
	private String nombre;
	private ArrayList<Producto> listaProducto = new ArrayList<Producto>();
	
	public Comercio(String nombre) {
		this.nombre = nombre;
	}

	public Boolean agregarProducto(Producto producto) {
		return this.listaProducto.add(producto);
	}

	public Integer obtenerCantidadProductos() {
		return this.listaProducto.size();
	}

	public Producto buscarProductoPorCodigo(String codigo) {
		for(Producto producto : listaProducto) {
			if(producto.getCodigo().equals(codigo)) { 
				return producto;
			}	
		}
		return null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Producto> getListaProducto() {
		return listaProducto;
	}

	public void setListaProducto(ArrayList<Producto> listaProducto) {
		this.listaProducto = listaProducto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listaProducto == null) ? 0 : listaProducto.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comercio other = (Comercio) obj;
		if (listaProducto == null) {
			if (other.listaProducto != null)
				return false;
		} else if (!listaProducto.equals(other.listaProducto))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	
	
}
