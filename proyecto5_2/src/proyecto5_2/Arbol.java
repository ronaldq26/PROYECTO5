package proyecto5_2;

class Arbol
{
    private NodoArbol raiz;
  
    public Arbol()
    {
        raiz = null;
    }
    
    public synchronized void insertarNodo(int valorInsertar)
    {
        if(raiz == null)
            raiz = new NodoArbol(valorInsertar); 
        else
            raiz.insertar(valorInsertar);       
    }
    
    //RECORRIDO EN PREORDEN
    public synchronized void recorridoPreorden()
    {
        ayudantePreorden(raiz);
    }
    //recorrido en preorden
    
    private void ayudantePreorden(NodoArbol nodo)
    {
        if(nodo == null)
            return;
        
        System.out.print(nodo.datos + " ");     
        ayudantePreorden(nodo.nodoizquierdo);   
        ayudantePreorden(nodo.nododerecho);     
    }
    
    // RECORRIDO INORDEN
    public synchronized void recorridoInorden()
    {
        ayudanteInorden(raiz);
    }
    
    // recorrido inorden
    private void ayudanteInorden( NodoArbol nodo)
    {
        if(nodo == null)
            return;
        
        ayudanteInorden(nodo.nodoizquierdo);
        System.out.print(nodo.datos + " ");
        ayudanteInorden(nodo.nododerecho);
    }
    
    //RECORRIDO POSTORDEN
    public synchronized void recorridoPosorden()
    {
        ayudantePosorden(raiz);        
    }
    
    //recorrido postorden
    private void ayudantePosorden(NodoArbol nodo)
    {
        if( nodo == null )
            return;
        
        ayudantePosorden(nodo.nodoizquierdo);
        ayudantePosorden(nodo.nododerecho);
        System.out.print(nodo.datos + " ");
    }
}
