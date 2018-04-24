package died.guia05.ejercicio05;

public class Equipo implements Comparable<Equipo> {

	private String nombre;
	private Integer puntos;
	private Integer partidosJugados;
	private Integer golesFavor;
	private Integer golesContra;
	
	
	public String getNombre() {	return nombre;}
	public Integer getPuntos() {return puntos;}
	public Integer getPartidosJugados() {return partidosJugados;}
	public Integer getGolesFavor() {return golesFavor;}
	public Integer getGolesContra() {return golesContra;}


	private void setNombre(String nombre) {	this.nombre = nombre;}
	private void setPuntos(Integer puntos) {this.puntos = puntos;}
	private void setPartidosJugados(Integer partidosJugados) {this.partidosJugados = partidosJugados;}
	private void setGolesFavor(Integer golesFavor) {this.golesFavor = golesFavor;}
	private void setGolesContra(Integer golesContra) {this.golesContra = golesContra;}


	public Equipo() {this("-");}
	public Equipo(String nombre) {
		this.setNombre(nombre);
		this.setGolesContra(0);
		this.setGolesFavor(0);
		this.setPartidosJugados(0);
		this.setPuntos(0);
	}
	
	public void registrarPartido(Integer gf, Integer gc) {
		this.setGolesFavor(gf+golesFavor);
		this.setGolesContra(gc+golesContra);
		this.setPartidosJugados(partidosJugados+1);
		int diferencia = gf-gc;
		if(diferencia==0)this.setPuntos(puntos+1);
		else if(diferencia>=4)this.setPuntos(puntos+4);
		else if(diferencia>0)this.setPuntos(puntos+3);
	}
	@Override
	public boolean equals(Object eq) {
		if(((Equipo)eq).getNombre()==this.nombre)return true;
		return false;
	}
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", puntos=" + puntos + ", partidosJugados=" + partidosJugados
				+ "]";
	}
	@Override
	public int compareTo(Equipo otroEquipo) {
		if(Integer.compare(otroEquipo.getPuntos(),this.puntos) != 0) 
			return Integer.compare(otroEquipo.getPuntos(),this.puntos);
		else if(Integer.compare(otroEquipo.getGolesFavor()-otroEquipo.getGolesContra(),this.golesFavor-this.golesContra)!=0) 
			return Integer.compare(otroEquipo.getGolesFavor()-otroEquipo.getGolesContra(), this.golesFavor-this.golesContra);
		else
			return Integer.compare(otroEquipo.getGolesFavor(), this.golesFavor);
	}
	
	
}
