
public class Pelicula {
	
	private int id;
	private String nombre;
	private int emision;
	private int cronologico;
	private String estado;
	
<<<<<<< HEAD
	public Pelicula (String nombre){
		this.nombre = nombre;
		this.emision = 0;
		this.cronologico = 0;
		this.estado = "";
	}
	
=======
	public Pelicula(int id, String nombre, int emision, int cronologico, String estado) {
		
		this.id = id;
		this.nombre = nombre;
		this.emision = emision;
		this.cronologico = cronologico;
		this.estado = estado;
	}

>>>>>>> 5e256133cfd7ada6fcf66e0473e11164421b15fe
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
