package ABB;

public class NodoGenerico<V> {
 
    private V value;
    private NodoGenerico<V> izq;
    private NodoGenerico<V> der;
     
    public NodoGenerico(V value, NodoGenerico<V> izq, NodoGenerico<V> der) {
        super();
        this.value = value;
        this.izq = izq;
        this.der = der;
    }
 
    public V getValue() {
        return value;
    }
 
    public void setValue(V value) {
        this.value = value;
    }
 
    public NodoGenerico<V> getIzq() {
        return izq;
    }
 
    public void setIzq(NodoGenerico<V> izq) {
        this.izq = izq;
    }
 
    public NodoGenerico<V> getDer() {
        return der;
    }
 
    public void setDer(NodoGenerico<V> der) {
        this.der = der;
    }
}