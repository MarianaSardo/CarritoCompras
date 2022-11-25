
package modelo;

import java.util.Iterator;

public interface IConjunto<T> {
    
    public abstract void agregar (T algo) throws OperacionInvalidaException;
    public abstract void eliminar(T algo)  throws OperacionInvalidaException;
    public abstract int cantidad();
    Iterator<T> getIterator();
    
    
   
    
    
}
