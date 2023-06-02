package AgendaTelefonica;

import java.util.Scanner;

public class Main {
	static GuiaTelefonica contacto =new GuiaTelefonica();
	public static void main(String[]args)
	{
		
		
		contacto.agregarContacto("52698456", "Elmer", "Tigo");
		contacto.agregarContacto("41589654", "Julia", "Tigo");
		contacto.agregarContacto("74856936", "Sofia", "Tuenti");
		contacto.agregarContacto("45768939", "Lucia", "Claro");
		contacto.agregarContacto("43448595", "Lucas", "Tigo");
		contacto.agregarContacto("45986325", "Mario", "Tigo");
		contacto.agregarContacto("32459874", "Oscar", "Claro");
		contacto.agregarContacto("85963245", "Oswaldo", "Tigo");
		contacto.agregarContacto("23459506", "Vinicio", "Tigo");
		
		//llamamos a la funcion de nuestro menu
		Opciones();
	}
	
	public static void Opciones()
	{
		int opcion;
		do {
		
		Scanner datoEntrada= new Scanner(System.in);
		
		System.out.println("**BIENVENIDO A MI AGENDA TELEFONICA**");
		System.out.println("\n");
		System.out.println("1.INGRESAR NUEVO CONTACTO");
		System.out.println("2.LISTAR CONTACTOS");
		System.out.println("3.ELIMINAR CONTACTO");
		System.out.println("4.EDITAR CONTACTO");
		System.out.println("5.SALIR");
		System.out.println("\n");
		opcion=datoEntrada.nextInt();
		
		switch(opcion)
		{
		case 1:
				ingresarNuevoContacto();
				datoEntrada.nextLine();
			break;
		case 2:
				contacto.listarContactos();
				datoEntrada.nextLine();
			break;
		case 3:
			eliminarContacto();
			datoEntrada.nextLine();
			break;
		case 4:
			editarContacto();
			datoEntrada.nextLine();
			break;
		default:
			System.out.println("OPCION NO VALIDA");
			break;
		}
		}while(opcion!=5);
		
		System.out.println("SALIENDO DEL PROGRAMA.....");
		
	}
	public static void ingresarNuevoContacto()
	{
		Scanner datoEntrada= new Scanner(System.in);
		String nombre,telefono,compania;
		System.out.println("Ingrese nombre: ");
		nombre=datoEntrada.next();
		System.out.println("Ingrese telefono: ");
		telefono=datoEntrada.next();
		System.out.println("Ingrese compania: ");
		compania=datoEntrada.next();
		
		contacto.agregarContacto(telefono, nombre, compania);
		System.out.println("CONTACTO AGREGADO CORRECTAMENTE.");
		System.out.println("\n");
		
	}
	
	public static void eliminarContacto()
	{
		Scanner datoEntrada= new Scanner(System.in);
		String nombre;
		System.out.println("Ingrese nombre de contacto a eliminar: ");
		nombre=datoEntrada.next();
		
		
		contacto.eliminarContacto(nombre);
		System.out.println("CONTACTO ELIMINADO CORRECTAMENTE.");
		System.out.println("\n");
		
	}
	
	public static void editarContacto()
	{
		Scanner datoEntrada= new Scanner(System.in);{
		String nombre;
		String nuevoContacto;
		System.out.println("Ingrese nombre de contacto a editar: ");
		nombre=datoEntrada.next();
		
		System.out.println("Ingrese nuevo numero telefonico: ");
		nuevoContacto=datoEntrada.next();
		contacto.editarContacto(nombre, nuevoContacto);
		
		
		
		}
	}
	
}
