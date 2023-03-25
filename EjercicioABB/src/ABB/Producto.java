package ABB;

public class Producto extends Comparable<Producto>{
    private int id;
    private String nombre;
     
    public Producto(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     
    @Override
    public boolean equals(Object p2) {
        Producto producto2 = (Producto)p2;
        if (this.getId() == producto2.getId() && this.getNombre().equals(producto2.getNombre())) {
            return true;
        }else {
            return false;
        }
    }
 
    @Override
    int compare(Producto value) {
        if (this.id > value.getId()) {
            return 1;
        }else if (this.id < value.getId()) {
            return -1;
        }else {
            //Si son iguales
            return 0;
        }
    }
 
    @Override
    public String toString() {
        return "Producto [id=" + id + ", nombre=" + nombre + "]";
    }
}

		abstract class Comparable<V> {
		abstract int compare(V elementoAComparar);
}