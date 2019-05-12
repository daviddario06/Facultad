
public class Pelicula {
	
	private String nombre;
	private int emision;
	private int cronologico;
	private String estado;
	
	public Pelicula (String nombre){
		this.nombre = nombre;
		this.emision = 0;
		this.cronologico = 0;
		this.estado = "";
	}
	
	public int getEmision() {
		return emision;
	}
	
	public int getCronologico() {
		return cronologico;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getEstado() {
		return estado;
	}
}
