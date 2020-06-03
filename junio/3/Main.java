import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args){

		HashMap<String,Integer> h1 = new HashMap<String,Integer>();
		System.out.println(h1);

		h1.put("nombreClaveUno", 2);
		h1.put("nombreClaveDos", 123);
		h1.put("nombreClaveTres", 34);

		System.out.println(h1);
		//imprime: {nombreClaveTres=34, nombreClaveDos=123, nombreClaveUno=2}


		h1.isEmpty();

		h1.size();

		h1.keySet();
		System.out.println(h1.keySet());
		//imprime: [nombreClaveTres, nombreClaveDos, nombreClaveUno]

		h1.values();
		System.out.println(h1.values());
		//imprime todos los valores del map: [34, 123, 2]

		h1.containsKey("nombreClaveUno");
		h1.containsKey("casa");
		h1.containsValue(123);
		h1.containsValue(15);

		System.out.println(h1.entrySet());

		h1.get("nombreClaveUno");

		System.out.println(h1.get("nombreClaveUno"));
		//retorna el valor asociado a la clave "nombreClaveUno"


		for ( Map.Entry<String,Integer> elemento : h1.entrySet() ) {
			System.out.println(elemento);
			if(elemento.getKey() == "nombreClaveUno"){
				System.out.println("el valor de nombreClaveUno es: " + elemento.getValue());
			}
		}

		h1.put("cuaderno", 2);
		h1.put("cuaderno", 3);


		System.out.println(h1);

		h1.replace("cuaderno", 19);


		h1.remove("nombreClaveUno");


		h1.clear();

		//nota: los elementos del map no estarán ordenados

	/*
	fuente(api de java SE):
	https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
	 */

	}
		 
}
