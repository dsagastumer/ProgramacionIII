package AgendaTelefonica;

public class Nodo {
	public String NumeroTelefonico;
	public String NombreContacto;
	public String Compania;
	Nodo Siguiente;
	
	public Nodo() {}
	
	//constructor que recibe los parametros y los guarda en sus respectivas variables
	public Nodo(String numtel,String nombre,String compania)
	{
		this.NumeroTelefonico=numtel;
		this.NombreContacto=nombre;
		this.Compania=compania;
	}
	
	
	public String getNumeroTelefonico() {
		return NumeroTelefonico;
	}
	public void setNumeroTelefonico(String NumeroTelefonico) {
		this.NumeroTelefonico = NumeroTelefonico;
	}
	public String getNombreContacto() {
		return NombreContacto;
	}
	public void setNombreContacto(String NombreContacto) {
		this.NombreContacto = NombreContacto;
	}
	public String getCompania() {
		return Compania;
	}
	public void setCompania(String Compania) {
		this.Compania = Compania;
	}
	public Nodo getSiguiente() {
		return Siguiente;
	}
	public void setSiguiente(Nodo Siguiente) {
		this.Siguiente = Siguiente;
	}
	
	
	
}
