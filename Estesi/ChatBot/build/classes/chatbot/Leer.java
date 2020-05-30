package chatbot;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Leer {
    File file = new File("datos.txt");
    public String leertxt(String direccion){
        String texto="";
        try {
            BufferedReader bf=new BufferedReader(new FileReader(direccion));
            String temporal="";
            String bfread;
            while ((bfread=bf.readLine()) !=null){
                temporal=temporal+bfread+"\r\n";
            }
            texto=temporal;
        } catch (Exception e) {
        }
        return texto;
    }
    public String preguntanueva(String pregunta,String respuesta){
        
       
        String nuevaPalabra="";
        String[] tupla3=pregunta.split(" ");
        
        for (int i=0;i<=tupla3.length-1;i++){
            if(i==tupla3.length-1){
                 nuevaPalabra=nuevaPalabra+tupla3[i]+"#"+tupla3[i]+"?"+"#"+respuesta;
            }else if (tupla3[i].equalsIgnoreCase("vence")|| tupla3[i].equalsIgnoreCase("tarjeta")||tupla3[i].equalsIgnoreCase("mi")||tupla3[i].equalsIgnoreCase("el")||tupla3[i].equalsIgnoreCase("que")|| tupla3[i].equalsIgnoreCase("es")||tupla3[i].equalsIgnoreCase("un")||tupla3[i].equalsIgnoreCase("de")){
                continue;
            }else {
            nuevaPalabra=nuevaPalabra+tupla3[i]+"#";}
        }
        System.out.println(nuevaPalabra);
       
        return nuevaPalabra;
    }
    public void guardar(String contenidoAnteriorTxt, String nuevapalabra){
        try {
		if(!file.exists()) {
				file.createNewFile();	
		}
		
		PrintWriter pw = new PrintWriter(file);
             
                pw.append(contenidoAnteriorTxt + nuevapalabra);
                
            
		
                
		pw.close();
		System.out.println("Done");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    }
    
}
