package archivos;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class Crear {
	

	public static void main(String[] args) {

		crearUsuarios();
		crearRestaurantes();
		crearPedidos();
		crearProductos();
		crearTipoProductos();
		
	}


	public static void crearUsuarios(){
		String csvFile = "./data/usuarios.csv";
		FileWriter writer;
		String csvFile2 = "./data/clientes.csv";
		FileWriter writer2;

		try {
			writer = new FileWriter(csvFile);
			writer2 = new FileWriter(csvFile2);
			String[] nombres = new String[10];
			nombres[0] = "Camilo";
			nombres[1] = "Carlos";
			nombres[2] = "Gory";
			nombres[3] = "Alejandra";
			nombres[4] = "Paula";
			nombres[5] = "Camila";
			nombres[6] = "John";
			nombres[7] = "Daniel";
			nombres[8] = "Daniela";
			nombres[9] = "Simon";			

			for (int i = 7; i<1000010; i++){
				int randomNum = ThreadLocalRandom.current().nextInt(1, 999999);
				String nombre = "";
				String rol = "";
				if (i<100){
					rol= "Cliente";
				}
				else if (i<200){
					rol="Administrador";
				}
				else{
					rol="General";
				}
				nombre = nombres[ThreadLocalRandom.current().nextInt(0,9)];
				Escritor.writeLine(writer, Arrays.asList(""+i, nombre, rol, nombre+i+"@gmail.com"));
			}
			writer.flush();
			writer.close();
			writer2.flush();
			writer2.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void crearRestaurantes(){
		String csvFile = "./data/restaurantes.csv";
		FileWriter writer;
		String nombre = "Restaurante";
		String tipo = "Tipo";
		try{
			writer= new FileWriter(csvFile);
			for(int i = 7 ; i<10000; i++){
				int idZona = ThreadLocalRandom.current().nextInt(1, 10);
				int capacidad = ThreadLocalRandom.current().nextInt(20, 200);
				int maxProductos = ThreadLocalRandom.current().nextInt(5, 900);
				int ingresos = ThreadLocalRandom.current().nextInt(100000, 1000000000);
				Escritor.writeLine(writer, Arrays.asList((i+1)+"","Compania"+(i+1),pais, "www.compania"+(i+1)+".com",ciudad));
				
			}
			writer.flush();
			writer.close();

		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void crearPedidos(){
		
	}
	
	public static void crearProductos(){
		
	}
	
	public static void crearTipoProductos(){
		
	}

	/**
	 
	public static void crearSillas(){
		String csvFile = "./data/sillas.csv";
		FileWriter writer;
		try {
			writer = new FileWriter(csvFile);

			int id =20;
			for (int i = 20; i<1020; i++){
				for (int j=20; j<1020; j++){
					int localidad = ThreadLocalRandom.current().nextInt(1, 5);
					Escritor.writeLine(writer, Arrays.asList(id+"", "1", ""+localidad, i+"",j+""));
					id++;
				}
			}
			writer.flush();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static void crearBoletas(){
		String csvFile = "./data/boletas.csv";
		FileWriter writer;
		String csvFile2 = "./data/boletaDetalle.csv";
		FileWriter writer2;
		String csvFile3 = "./data/boletaSilla.csv";
		FileWriter writer3;
		try {
			writer = new FileWriter(csvFile);
			writer2 = new FileWriter(csvFile2);
			writer3 = new FileWriter(csvFile3);

			for (int idBoleta = 15, idSilla=20;idBoleta<1000000; idBoleta++, idSilla++){

				int asist = ThreadLocalRandom.current().nextInt(0, 10);
				String asistencia = "t";
				if (asist<=3)asistencia="f";

				int canc = ThreadLocalRandom.current().nextInt(0, 10);
				String cancelada = "f";
				if (canc<=3 && asistencia.equals("f"))cancelada="t";

				Escritor.writeLine(writer, Arrays.asList(idBoleta+"","2","1",asistencia, cancelada, "f"));

				int idCliente = ThreadLocalRandom.current().nextInt(40, 999999);

				Escritor.writeLine(writer2, Arrays.asList(idBoleta+"",idCliente+"", "t"));
				Escritor.writeLine(writer3, Arrays.asList(idBoleta+"","1", idSilla+""));
			}

			writer.flush();
			writer.close();
			writer2.flush();
			writer2.close();
			writer3.flush();
			writer3.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void crearSitio(){
		String csvFile = "./data/sitio.csv";
		FileWriter writer;
		String csvFile2 = "./data/sitio_necesidades.csv";
		FileWriter writer2;
		String csvFile3 = "./data/sitio_req.csv";
		FileWriter writer3;
		try{
			writer = new FileWriter(csvFile);
			writer2 = new FileWriter(csvFile2);
			writer3 = new FileWriter(csvFile3);
			for(int i = 2; i< 40; i++){
				int tipo = ThreadLocalRandom.current().nextInt(1, 6);
				int necesidades = ThreadLocalRandom.current().nextInt(1, 4);
				int req = ThreadLocalRandom.current().nextInt(1, 10);
				int idOrganizador = ThreadLocalRandom.current().nextInt(10, 40);
				int capacidad = ThreadLocalRandom.current().nextInt(1000000, 1000200);
				
				Escritor.writeLine(writer, Arrays.asList((i+1)+"", "Teatro"+(i+1),capacidad+"",tipo+"",700+"",1900+"",idOrganizador+""));
				Escritor.writeLine(writer2, Arrays.asList((i+1)+"",necesidades+""));
				Escritor.writeLine(writer3, Arrays.asList((i+1)+"",req+""));
			}
			writer.flush();
			writer.close();
			writer2.flush();
			writer2.close();
			writer3.flush();
			writer3.close();

		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public static void crearEspectaculo(){

		String csvFile = "./data/espectaculo.csv";
		FileWriter writer;
		String csvFile2 = "./data/espectaculo_categoria.csv";
		FileWriter writer2;
		try{
			writer = new FileWriter(csvFile);
			writer2 = new FileWriter(csvFile2);
			for(int i = 4; i < 256; i++ ){
				int idOrganizador ;
				String otroIdioma = "";
				String idioma = "";
				int categoria = ThreadLocalRandom.current().nextInt(1, 9);
				int costoRealizacion = ThreadLocalRandom.current().nextInt(1000000, 100000000);
				int duration = ThreadLocalRandom.current().nextInt(30, 170);
				idOrganizador=ThreadLocalRandom.current().nextInt(10, 31);
				if(i > 4 && i < 123 ){
					otroIdioma = "t";
					idioma = "ingles";
				}
				else{
					otroIdioma = "f";
					idioma = "español";
				}
				Escritor.writeLine(writer, Arrays.asList((i+1)+"",
						"espectaculo"+(i+1), duration+"",idioma,"descripcion"+(i+1), costoRealizacion+"",
						otroIdioma,idOrganizador+""));
				Escritor.writeLine(writer2, Arrays.asList((i+1)+"",categoria+""));
			}
			writer.flush();
			writer.close();
			writer2.flush();
			writer2.close();

		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void crearCompanias(){
		String csvFile = "./data/companias.csv";
		String csvFile2 = "./data/compania_organizador.csv";
		String csvFile3 = "./data/compania_espectaculo.csv";
		String csvFile4 = "./data/compania_estadia.csv";
		FileWriter writer;
		FileWriter writer2;
		FileWriter writer3;
		FileWriter writer4;
		try{
			writer= new FileWriter(csvFile);
			writer2 = new FileWriter(csvFile2);
			writer3 = new FileWriter(csvFile3);
			writer4 = new FileWriter(csvFile4);
			for(int i = 4 ; i<100; i++){
				String ciudad = "";
				String pais = "";
				int organizador = ThreadLocalRandom.current().nextInt(1, 40);
				int espectaculo = ThreadLocalRandom.current().nextInt(5, 257);
				String fechaInicio = "10/12/2017";
				String fechaFin = "";
				if(i > 3 && i < 25){
					ciudad = "Caracas";
					pais = "Venezuela";
					fechaFin = "10/25/2017";
				}	
				else if(i>25 && i > 50){
					ciudad = "Cali";
					pais = "Colombia";
					fechaFin = "10/27/2017";
				}
				else{
					ciudad = "Bogota";
					pais = "Colombia";
					fechaFin = "10/29/2017";
				}
				Escritor.writeLine(writer, Arrays.asList((i+1)+"","Compania"+(i+1),pais, "www.compania"+(i+1)+".com",ciudad));
				Escritor.writeLine(writer2, Arrays.asList(organizador+"",(i+1)+""));
				Escritor.writeLine(writer3,  Arrays.asList((i+1)+"",espectaculo+""));
				Escritor.writeLine(writer4, Arrays.asList((i+1)+"",fechaInicio,fechaFin));

			}
			writer.flush();
			writer.close();
			writer2.flush();
			writer2.close();
			writer3.flush();
			writer3.close();
			writer4.flush();
			writer4.close();

		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public static void crearPreferencias(){
		String csvFile = "./data/preferencias2.csv";
		FileWriter writer;
		try{
			writer = new FileWriter(csvFile);
			for(int i = 40; i<1000010; i++){
				String categoria = "";
				if(i > 39 && i< 125000 )
					categoria = "1";
				else if(i > 125000 && i< 250000 )
					categoria="2";
				else if(i > 250000 && i< 375000 )
					categoria = "3";
				else if(i > 375000 && i< 500000 )
					categoria = "4";
				else if(i > 500000 && i< 625000 )
					categoria = "5";
				else if (i > 625000	&& i< 750000 )
					categoria = "6";
				else if (i > 750000 && i< 875000 )
					categoria = "7";
				else 
					categoria = "8";

				Escritor.writeLine(writer, Arrays.asList(i+"",categoria));
			}
			writer.flush();
			writer.close();

		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public static void crearFunciones(){
		String csvFile = "./data/funciones.csv";
		FileWriter writer;
		try{
			writer = new FileWriter(csvFile);
			for (int i=5; i<256; i++){
				for (int j=1;j<5;j++){
					int sitio = ThreadLocalRandom.current().nextInt(1, 40);
					Date fecha = new Date();
					long sumafecha = ThreadLocalRandom.current().nextLong(10000000, 999999999);
					long nfecha = fecha.getTime()+sumafecha;
					int hora = ThreadLocalRandom.current().nextInt(7, 21)*100;
					fecha.setTime(nfecha);
					SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yy");
					Escritor.writeLine(writer, Arrays.asList(j+"",i+"",sitio+"", dt.format(fecha),hora+"","f"));
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
*/
	
}
