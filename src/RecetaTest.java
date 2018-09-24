

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RecetaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RecetaTest
{
    private Receta receta1;
    private Receta receta2;

    
    

    

    /**
     * Default constructor for test class RecetaTest
     */
    public RecetaTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() throws Exception
    {
        Receta receta1 = new Receta();
        receta1.agregarIngrediente(Ingrediente.AGUA, 100);
        receta1.agregarIngrediente(Ingrediente.CAFE, 3);
        receta1.agregarIngrediente(Ingrediente.LECHE, 30);
        
        
        receta2 = new Receta();
        receta2.getIngredientes();
        receta2.agregarIngrediente(Ingrediente.AGUA, 120);
        receta2.agregarIngrediente(Ingrediente.LECHE, 50);
        receta2.getIngredientes();
        receta2.volumenTotalReceta();
    }
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void agregar_ingrediente_test()
    {
        try{
        Receta receta1 = new Receta();
        receta1.agregarIngrediente(Ingrediente.AZUCAR, 2);
        receta1.agregarIngrediente(Ingrediente.AGUA, 100);
        receta1.agregarIngrediente(Ingrediente.CAFE, 3);
        receta1.agregarIngrediente(Ingrediente.LECHE, 30);
        //assertEquals(, receta1.getMapaDeIngredientes());
    }catch(Exception e){
        System.out.println("");
        e.printStackTrace();
    }
    }

    @Test
    public void cantidad_total()
    {
        assertEquals(170, receta2.volumenTotalReceta());
    }
}



