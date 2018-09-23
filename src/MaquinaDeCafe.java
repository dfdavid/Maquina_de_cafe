import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaquinaDeCafe implements MaquinaDeEstados {
	protected Producto seleccion;
	protected Estado estado = Estado.APAGADO;
	protected List <Recipiente> recipientes;
	protected Map <Producto, Receta> recetas;
	protected int totalProductosServidos;

	
	/**
	 * Constructor sin parametros.
	 */
	public MaquinaDeCafe(){
		recipientes = new ArrayList<Recipiente>();
		recetas = new HashMap<Producto,Receta>();
		totalProductosServidos = 0;
	}
	
	/**
	 * Retorna la cantidad total de productos que han sido servidos por esta maquina. 
	 * @return
	 */
	public int getTotalProductosServidos() {
		return totalProductosServidos;
	}
	

	/**
	 * Retorna los productos y recetas configurados en esta maquina de cafe
	 * @return un mapa con productos y recetas asociadas
	 */
	public Map<Producto, Receta> getRecetas() {
		return recetas;
	}

	/**
	 * Retorna los recipientes configurados en esta maquina de cafe
	 * @return una lista con Recipientes
	 */
	public List<Recipiente> getRecipientes() {
		return recipientes;
	}
	
	/**
	 * Retorna el producto seleccionado 
	 * @return el producto seleccionada en la maquina
	 */
	public Producto getSeleccion() {
		return seleccion;
	}
	
	/**
	 * Retorna el recipiente para el producto especificado
	 * @param ingrediente el ingrediente requerido
	 * @return el recipiente que contiene el ingrediente requerido, o null si no existe un recipiente para ese ingrediente.
	 */
	public Recipiente getRecipiente (Ingrediente ingrediente){
		for (Recipiente r: recipientes){
			if (ingrediente == r.getTipoIngredienteAlmacenado()){
				return r;
			}
		}
		return null;
	}
	
	/**
	 * Agrega una receta para un producto de la maquina de cafe. Solo es valido en modo mantenimiento
	 * 
	 * @param r la Receta correspondiente al producto a agregar.
	 * @param p el Producot a agregar a configurar en la maquina.
	 * 
	 * @throws IllegalStateException si la maquina no esta en modo mantenimiento
	 */
	public void agregarReceta (Receta r, Producto p){
		if (estado != Estado.MANTENIMIENTO)
			throw new IllegalStateException("No puede modificar recetas desde estado " + estado);
		recetas.put(p,r);
	}

	/**
	 * Selecciona un producto para despachar. Solo es posible si la maquina esta lista para despachar producto.
	 * @param seleccion el producto a despachar
	 * 
	 * @throws IllegalStateException si la maquina no esta lista
	 */
	public void setSeleccion(Producto seleccion) {
		if (estado != Estado.LISTO)
			throw new IllegalStateException("No puede seleccionar producto desde estado "+estado);
		this.seleccion = seleccion;
	}

// A PARTIR DE AQU� SON METODOS A MODIFICAR EN EL EXAMEN (NO MODIFICAR LOS ANTERIORIES)
	
	@Override
	public Estado getEstado() {
		//TODO implementar el metodo
		return null;
	}
	
	@Override
	public void operar() {
		//TODO implementar el metodo
	}

	@Override
	public void restablecer() {
		//TODO implementar el metodo
	}

	@Override
	public void encender() {
		//TODO implementar el metodo
	}

	@Override
	public void apagar() {
		//TODO implementar el metodo
	}

	@Override
	public void mantener() {
		//TODO implementar el metodo		
	}
	
	/**
	 * Retorna una lista de ingredientes faltantes para las recetas cargadas en la maquina
	 * 
	 * @return Lista de ingredientes faltantes.
	 */
	public List<Ingrediente> getFaltantes(){
		//TODO implementar el metodo
		return null;
	}
	
	
	/**
	 * Ejecuta la receta para el producto especificado, extrayendo de cada recipientes 
	 * la cantidad necesaria de ingredientes para preparar la receta.
	 * 
	 * @param el producto seleccionado
	 * 
	 * @throws ProductoException si por algun motivo no se puede extraer la cantidad requerida de cada ingrediente.
	 * SUGERENCIA -> utilice validarProducto previamente para determinar si es posible preparar producto.
	 */
	public void prepararProducto(Producto seleccion) throws ProductoException {
		//TODO implementar el metodo
		throw new IllegalStateException();//REMOVER ESTA LINEA	
	}
	
	
	/**
	 * Valida si es posible despachar el producto especificaod
	 * 
	 * @param p el producto a despachar
	 * @throws ProductoException si el producto especificado es null, o no esta configurado en esta m�quina, o existen
	 * ingredientes faltantes en la receta.
	 * 
	 */
	public void validarProducto(Producto p) throws ProductoException{
		//TODO implementar el metodo
		throw new IllegalStateException();//REMOVER ESTA LINEA
	}
	
	
	/**
	 * Verifica si existe suficiente cantidad de un ingrediente especificado
	 * @param ingrediente el ingrediente requerido
	 * @param candidadRequerida la cantida requerida
	 * @return true si existe suficiente ingrediente, false en caso contrario.
	 */
	public boolean hayIngredienteDisponible (Ingrediente ingrediente, int candidadRequerida){
		//TODO implementar el metodo
		throw new IllegalStateException();//REMOVER ESTA LINEA
	}

	/**
	 * Limpia los productos y recetas cargadas en la maquina. Solo es valido en modo mantenimiento
	 * 
	 * @throws IllegalStateException si la maquina no esta en modo mantenimiento
	 */
	
	public void limpiarRecetas (){
		//TODO implementar el metodo
	}

}
