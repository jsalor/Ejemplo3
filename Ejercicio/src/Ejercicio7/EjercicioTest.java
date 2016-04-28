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
		StringArrayUtils p1 = new StringArrayUtils(new String[] {"unos","por","apalapucia","de","al","lado"});
		StringArrayUtils p2 = new StringArrayUtils(new String[] {"1234567","dos"});
		StringArrayUtils[] arr1 = new StringArrayUtils[2];
		arr1[0]= p1;
		arr1[1]=p2;
		parametros.add(arr1);
		return parametros;		
		//JORGE EL APALAPUCIANO
	}	
	
	
	

	@Test
	public void testStringArrayUtils() {
		
		Assert.assertEquals(prueba1.getMaxLength().length(), resultado1.getMaxLength().length());
		
		
	}

	@Test
	public void testGetMaxLength() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTotalLength() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetIndexOf() {
		fail("Not yet implemented");
	}*/

}
