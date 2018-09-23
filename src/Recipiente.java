
public abstract class Recipiente {
	static int CAPACIDAD_MAXIMA_DEFAULT = 2000;
	int capacidadMaxima;
	int cantidadDisponible;
	
	
	/**
	 * Constructor sin parametros. Setea la capacidad maxima a un valor por defecto
	 */
	public Recipiente (){
		capacidadMaxima = Recipiente.CAPACIDAD_MAXIMA_DEFAULT;
	}
	
	/**
	 * Constructor con paraemtro. Setea la capacidad maxima al valor indicado
	 * @param capacidadMaxima el valor de la maxima capacidad de este recipiente
	 * 
	 * @throws IllegalArgumentException si el parametro excede la capacidad maxima por defecto
	 */
	public Recipiente (int capacidadMaxima){
		if (capacidadMaxima <=0 || capacidadMaxima > Recipiente.CAPACIDAD_MAXIMA_DEFAULT)
			throw new IllegalArgumentException ("Capacidad maxima invalida");
		this.capacidadMaxima = capacidadMaxima;
	}
	
	/**
	 * Devuelve el tipo de ingrediente que este recipiente almacena	
	 * @return el ingrediente almacenado
	 */
	public abstract Ingrediente getTipoIngredienteAlmacenado();
	
	/**
	 * Agrega contenido al recipiente
	 * 
	 * @param cantidadAgregada la cantidad de contenido a agregar
	 * @throws CapacidadExcedidaException cuando intenta agregarse mas contendio del que el recipiente puede alojar
	 * @throws IllegalArgumentException cuando la cantidad a agregar es un numero negativo
	 * 
	 */
	public void agregar (int cantidadAgregada) throws CapacidadExcedidaException{
		//TODO implementar
	}
	
	
	/**
	 * Extrae contendio del recipiente
	 * 
	 * @param cantidadAExtraer la cantidad a extraer
	 * @throws CapacidadExcedidaException cuando intenta extraerse una cantidad mayor a la diponible en el recipiente
	 * @throws IllegalArgumentException cuando la cantida a extraer es un numero negativo
	 */
	public void extraer (int cantidadAExtraer) throws CapacidadExcedidaException{
		//TODO implementar
	}
	
	/**
	 * Devuleve un string representando este Recipiente. El string posee el siguiente formato:
	 * "Recipiente contiene <Ingrediente> [<cantidadDisponible>/<capacidadMaxima>]"
	 * 
	 * Ej.
	 * "Recipiente contiene AGUA [1500/2000]"
	 */
	public String toString(){
		//TODO implementar
		return "";
	}
	
	/**
	 * Getter
	 * @return la capacidad maxima de este recipiente.
	 */
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}
	
	/**
	 * Getter
	 * @return la cantidad de contenido disponible en el recipiente.
	 */
	public int getCantidadIngredienteDisponible() {
		return cantidadDisponible;
	}
		
}
