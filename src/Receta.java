import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Receta {
    protected Map<Ingrediente, Integer> ingredientes;
    
    public Receta (){
        ingredientes = new HashMap<Ingrediente,Integer>();
    }
    
    /**
     * Agrega un ingrediente a la receta
     * @param ing el Ingredienta a agregar a la receta
     * @param cantidad la cantidad de ingrediente a agregar a la receta
     * 
     * @throws IllegalArgumentException cuando el ingrediente o la cantidad de ingredinte a agregar es invaElida (ej. negativa)
     * 
     */
    public void agregarIngrediente(Ingrediente ing, Integer cantidad) throws Exception
    {
        //TODO implementar el metodo
        // ingredientes posibles: CAFE, LECHE, AZUCAR, CACAO, AGUA
        if (Ingrediente.CAFE == ing && cantidad>0 && cantidad<2000){
            ingredientes.put(ing, cantidad);
        }
        else if (Ingrediente.LECHE == ing && cantidad>0 && cantidad<2000){
            ingredientes.put(ing, cantidad);
        }
        else if (Ingrediente.AZUCAR == ing && cantidad>0 && cantidad<2000){
            ingredientes.put(ing, cantidad);
        }
        else if (Ingrediente.CACAO == ing && cantidad>0 && cantidad<2000){
            ingredientes.put(ing, cantidad);
        }
        else if (Ingrediente.AGUA == ing && cantidad>0 && cantidad<2000){
            ingredientes.put(ing, cantidad);
        }
        else{
            throw new IllegalArgumentException();
        }
    }
    
    /**
     * Retorna el peso total de la receta (sumatoria de todos los ingredientes de la receta)
     * @return el peso total de la receta
     */
    public int volumenTotalReceta(){
        int volumen_total=0;
        for (int cantidad: ingredientes.values()){
            volumen_total=volumen_total+cantidad;
        }
        return volumen_total;
    }
    
    /**
     * Getter
     * @return
     */
    public Map<Ingrediente, Integer> getMapaDeIngredientes(){
        return ingredientes;
    }
    
    /**
     * Obtiene la lista de ingredientes de esta receta
     * @return la lista de ingredientes de la receta
     */
    public List<Ingrediente> getIngredientes(){
        return new ArrayList<Ingrediente>(ingredientes.keySet());
    }
    
    /**
     * Retorna la cantidad del ingrediente solicitado para esta receta. Si la receta
     * no requiere este ingrediente, retorna 0
     * @param ingrediente el ingrediente solicitado
     * @return la cantidad de ingrediente requerida por la receta.
     */
    public int getCantidadDeIngrediente (Ingrediente ingrediente){
        if (ingredientes.containsKey(ingrediente))
            return ingredientes.get(ingrediente);
        else 
            return 0;
    }
        
}
