El proyecto implementa una sistema de una m�quina de caf�.
La m�quina posee Recipientes que contienen los Ingredientes necesarios para preparar diferentes tipos de Producto.
La m�quina permite configurarse para despachar diferentes productos. Cada producto tiene asociada una Receta.

1. Implementar la clase Silo, que extiende de Recipiente, e implementa los siguientes constructores:
	public Silo (Ingrediente ingredienteAlmacenado, int capacidadMaxima)
	public Silo (Ingrediente ingredienteAlmacenado)
   
2. Implementar los m�todos de la clase Receta seg�n la documentaci�n
	public void agregarIngrediente(Ingrediente ing, Integer cantidad)
	public int volumenTotalReceta()
	
3.  Implementar los m�todos de la clase Recipiente seg�n la documentaci�n
	public void agregar (int cantidadAgregada)
	public void extraer (int cantidadAExtraer)
	public String toString()

4.	Implementar los m�todos de la interfaz MaquinaDeEstados en la clase MaqunaDeCafe. 
	. encender:
		- lanza IllegalStateException si la maquina no est� APAGADA
		- cambia el Estado de la maquina a LISTO
		- establece la seleccion de producto en null
	. apagar:
		- lanza IllegalStateException si la maquina est� OPERANDO
		- cambia el Estado de la maquina a APAGADO.
		
	. operar:
		- verifica si puede despachar el producto seleccionado
		- lanza IllegalStateException si 
			- la maquina no est� LISTA
			- no se puede despachar el producto seleccionado 
		- despacha el producto seleccionado
		- cambia el Estado de la maquina a OPERANDO
		
	. restablecer:
		- cambia el Estado de la maquina a LISTO
		- establece la seleccion de producto en null
	
	. mantener:
		- lanza IllegalStateException si la maquina no est� LISTA
		- cambia el Estado de la maquina a MANTENIMIENTO
		
	
4. Implementar los m�todos metodos faltantens de la clase MaquinaDeCafe, seg�n la documentaci�n
	public List<Ingrediente> getFaltantes()
	public void prepararProducto(Producto seleccion)
	public void validarProducto(Producto p) throws ProductoException
	public boolean hayIngredienteDisponible (Ingrediente ingrediente, int candidadRequerida)
	public void limpiarRecetas ()

	