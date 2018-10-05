package pruebas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import modelo.Persona;

public class TestSerializacion {

	public static void main(String[] args) {
		Persona p = new Persona("Isaac", 20);
		Persona m = new Persona("Salinas", 70);
		ArrayList<Persona> lista = new ArrayList<Persona>();
		lista.add(p);
		lista.add(m);
		
		try {
			FileOutputStream archivo = new FileOutputStream("archivoPrueba.txt");
			ObjectOutputStream oos = new ObjectOutputStream(archivo);
			oos.writeObject(lista);
			archivo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			FileInputStream archivoLectura = new FileInputStream("archivoPrueba.txt");
			ObjectInputStream ois = new ObjectInputStream(archivoLectura);
			//Persona res = (Persona) ois.readObject();
			ArrayList<Persona> listaRes = (ArrayList<Persona>) ois.readObject();
			for(Persona item: listaRes){
				if(item instanceof Persona){
					//Persona res = (Persona)x;
					System.out.println(item.toString());
				}
			}
			
			archivoLectura.close();
			ois.close();
			
			//System.out.println(res.toString());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}