package died.guia05.ejercicio04;

public class Ciudad {
	
	private String nombre;
	private int codpos;

	public Ciudad() {
		// TODO Auto-generated constructor stub
		super();
	}
	public Ciudad(String nombre, int codpos) {
		super();
		this.nombre=nombre;
		this.codpos=codpos;
	}
	public String toString() {
		return "Ciudad [nombre=" + nombre + "; codigo postal=" + codpos + "]";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj.getClass() == this.getClass()) {
			return this.getCodpos() == ((Ciudad)obj).getCodpos();
		}
		return false;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodpos() {
		return codpos;
	}
	public void setCodpos(int codpos) {
		this.codpos = codpos;
	}

}
