package proyecto5_2;

import javax.swing.JOptionPane;

public class PruebaArbol
{
    public static void main(String args [])
    {
        Arbol arbol = new Arbol();
        int valor;
        String Dato;
        
        System.out.println("valores ingresados en los nodos: ");
        
        Dato = JOptionPane.showInputDialog("Ingresar la cantidad  total de nodo que tendra el arbol");
        int n = Integer.parseInt(Dato);
        
        for(int i = 1; i <= n; i++ )
        {
            Dato = JOptionPane.showInputDialog("ingresar el " + i + " numero para colocar en el Arbol");
            valor = Integer.parseInt(Dato);
            System.out.print(valor + " ");
            arbol.insertarNodo(valor);
        }
        
        System.out.println("\n\nRecorrido Preorden");
        arbol.recorridoPreorden();
        
        System.out.println("\n\nRecorrido Inorden");
        arbol.recorridoInorden();
        
        System.out.println("\n\nRecorrido Postorden");
        arbol.recorridoPosorden();
    }
}