package AgendaTelefonica;

public class GuiaTelefonica {
public Nodo inicio;
	
	//constructor que asigna un valor nulo al iniciar el programa
	public GuiaTelefonica()
	{
		this.inicio=null;
	}
	
	public void agregarContacto(String NumeroTelefono,String NombrePropietario,String Compania)
	{
		Nodo nuevoContacto= new Nodo(NumeroTelefono,NombrePropietario,Compania);
		//si la lista aun no cuenta con un registro se le agrega al inicio
		if(this.inicio==null)
		{
			this.inicio=nuevoContacto;
		}
		else 
		{
			Nodo contactoActual=this.inicio;
			 
			while(contactoActual.Siguiente!=null)
			{
				//busca el ultimo contacto que tiene la lista
				contactoActual=contactoActual.Siguiente;
			}
			//al encontrar el ultimo contacto, usando el apuntador siguiente le agrega el nodo
			contactoActual.Siguiente=nuevoContacto;
			
			
		}
	}
	public void listarContactos()
	{
		Nodo contactoActual=inicio;
		//System.out.println("NOMBRE          "+"TELEFONO"+"            COMPANIA");
		   System.out.format("%-15s %-15s %-15s%n", "Nombre", "Telefono", "Compania");
		while(contactoActual!=null)
		{
		System.out.format("%-15s %-15s %-15s%n",contactoActual.NombreContacto,contactoActual.NumeroTelefonico,contactoActual.Compania);	
		contactoActual=contactoActual.Siguiente;
		}
	}
	
	public void eliminarContacto(String nombre)
	{
		if(inicio==null)
		{
			return; //la lista está vacia y no hay nada que eliminar
		}
		//verifica si el nodo a eliminar es el inicio de la lista
		if(inicio.NombreContacto.equals(nombre))
		{
			inicio=inicio.Siguiente;
			return;
		}
		
		Nodo contactoActual=inicio;
		Nodo contactoAnterior=null;
		
		//buscar el nodo a eliminar
		while(contactoActual !=null && !contactoActual.NombreContacto.equals(nombre))
		{
			contactoAnterior=contactoActual;
			contactoActual=contactoActual.Siguiente;
		}
		if(contactoActual==null)
		{
			return;
		}
		
		//eliminar el nodo enlazando el nodo anterior con el siguiente nodo
		contactoAnterior.Siguiente=contactoActual.Siguiente;
	}
	
	@SuppressWarnings("null")
	public void editarContacto(String nombre,String nuevoNumero)
	{
		
		Nodo contactoActual=inicio;
		
		while(contactoActual!=null)
		{
			if(contactoActual.NombreContacto.equals(nombre))
			{
				contactoActual.NumeroTelefonico=nuevoNumero;
				System.out.println("SE EDITO EL CONTACTO");
				return;
			}
			contactoActual=contactoActual.Siguiente;
		}
		
	
	System.out.println("EL CONTACTO "+nombre+" NO EXISTE EN LA AGENDA");
	
	}
	
	

}
