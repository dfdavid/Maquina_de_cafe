/**
 * Esta inferfaz representa una maquina de estados. Las siguientes son transiciones validas
 * entre estados
 * 
// APAGADO -> LISTO
// LISTO -> OPERANDO
// LISTO -> FALLA
// LISTO -> APAGADO
// OPERANDO -> LISTO
// OPERANDO -> FALLA
 *
 */
public interface MaquinaDeEstados {

	/**
	 * Trancisiona al estado OPERANDO  
	 * 
	 * @throws IllegalStateException cuando se intenta operar desde un estado invalido
	 */
	void operar();
	
	/**
	 * 
	 * Restablece la maquina desde cualquier estado 
	 * Trancisiona al estado LISTO (si no encuentra fallas) 
	 * Trancisiona al estado FALLA (si existe alguna condicion de error)
	 * 
	 * @throws IllegalStateException cuando se intenta operar desde un estado invalido
	 */
	void restablecer();
	
	/**
	 * Enciende la maquina (solo desde el estado APAGADO) 
	 * Trancisiona al estado LISTO (si no encuentra fallas) 
	 * Trancisiona al estado FALLA (si existe alguna condicion de error)
	 * 
	 * @throws IllegalStateException cuando se intenta operar desde un estado invalido
	 */
	void encender();
	
	/**
	 * Apaga la maquina.
	 * Trancisiona al estado APAGADO (si no encuentra fallas)
	 * No es posible apagar la maquina si esta OPERANDO
	 * 
	 * @throws IllegalStateException cuando se intenta operar desde un estado invalido
	 */
	void apagar();
	
	/** 
	 * Lleva la maquina a estado de mantenimiento
	 * Trancisiona al estado 
	 * 
	 */
	void mantener();
	
	/**
	 * Retorna el estado actual de la maquina.
	 * 
	 * @return estado actual de la maquina.
	 */
	Estado getEstado ();

}
