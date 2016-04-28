package Ejercicio7;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class EjercicioTest {
	
	StringArrayUtils prueba1;
	StringArrayUtils resultado1;
	
	
	public EjercicioTest(StringArrayUtils pr1,StringArrayUtils res) {
		super();
		this.prueba1 = pr1;
		this.resultado1 = res;
	
		
		
	}
	
	
	
	@Parameters
	public static ArrayList<StringArrayUtils[]> misPruebas(){
		ArrayList<StringArrayUtils[]> parametros = new ArrayList<StringArrayUtils[]>();
		StringArrayUtils p1 = new StringArrayUtils(new String[] {"unos","retraso","el","des","al","lado"});
		StringArrayUtils p2 = new StringArrayUtils(new String[] {"1234567","dos","123","456","789012"});
		StringArrayUtils[] arr1 = new StringArrayUtils[2];
		arr1[0]= p1;
		arr1[1]=p2;
		parametros.add(arr1);
		return parametros;		
		
	}	
	
	
	

	

	@Test
	public void testGetMaxLength() {
		Assert.assertEquals(prueba1.getMaxLength().length(), resultado1.getMaxLength().length());
	}

    @Test
	public void testGetTotalLength() {
    	Assert.assertEquals(prueba1.getTotalLength() , resultado1.getTotalLength());
    	//pongo algo
	}

	/*@Test
	public void testGetIndexOf() {
		fail("Not yet implemented");
	}*/

}
