package iterator.examples.vectors;

public class Vector {
	public int[] _datos;

    public Vector(int valores){ 
        _datos = new int[valores];
        for (int i = 0; i < _datos.length; i++){
            _datos[i] = i; 
        }
    }    
    
    public int getValor(int pos){ 
        return _datos[pos]; 
    }

    public void setValor(int pos, int valor){ 
        _datos[pos] = valor; 
    }

    public int dimension(){ 
        return _datos.length; 
    }
    
    public VectorIterator iterador(){
        return new VectorIterator(this); 
    }
}
