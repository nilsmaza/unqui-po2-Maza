package ar.edu.unq.po2.TPVichuca;

import java.util.ArrayList;

public class EvaluadorDeDistancia {
	
	private Ubicacion ubi1;
	private Ubicacion ubi2;
	
	public EvaluadorDeDistancia(Ubicacion ubi1, Ubicacion ubi2) {
		super();
		this.ubi1 = ubi1;
		this.ubi2 = ubi2;
	}

	public Ubicacion getUbi1() {
		return ubi1;
	}

	public void setUbi1(Ubicacion ubi1) {
		this.ubi1 = ubi1;
	}

	public Ubicacion getUbi2() {
		return ubi2;
	}

	public void setUbi2(Ubicacion ubi2) {
		this.ubi2 = ubi2;
	}
	
	public double distanciaEntreCoordenadas(Ubicacion ub1,Ubicacion ub2) {
		
		double radioTierra = 6371; // Kms
		double distanciaLatitud = Math.toRadians(ub1.getLatitud() - ub2.getLatitud());
		double distanciaLongitud = Math.toRadians(ub1.getLongitud() - ub2.getLongitud());
		
		double sindLatitud = Math.sin(distanciaLatitud / 2);  
        double sindLongitud = Math.sin(distanciaLongitud / 2);
		
        double valor1 = Math.pow(sindLatitud, 2) + Math.pow(sindLongitud, 2)  
        * Math.cos(Math.toRadians(ub1.getLatitud())) * Math.cos(Math.toRadians(ub2.getLatitud())); 
        double valor2 = 2 * Math.atan2(Math.sqrt(valor1), Math.sqrt(1 - valor1));
        
        double distancia = radioTierra * valor2; 
        
        return distancia ;
	}
	
	public ArrayList<Ubicacion> aMenosDeXDistancia(double kms,ArrayList<Ubicacion> listaUbi){
		ArrayList<Ubicacion> listaDeUbicacion = new ArrayList<Ubicacion>();
		 for(Ubicacion unaUbicacion : listaUbi) {
			 listaDeUbicacion.addAll(this.comprobarDistancia(kms, unaUbicacion, listaUbi)); 
			 }
		return listaDeUbicacion;
	}

	public ArrayList<Ubicacion> comprobarDistancia(double kms,Ubicacion ubicacion,ArrayList<Ubicacion> listUbi) {
		ArrayList<Ubicacion> listaDeUbicacion = new ArrayList<Ubicacion>();
			for(Ubicacion unaUbicacion : listUbi) {
				if(this.distanciaEntreCoordenadas(ubicacion, unaUbicacion) < kms) {
					listaDeUbicacion.add(ubicacion);
					listaDeUbicacion.add(unaUbicacion);
				}
			}
		return listaDeUbicacion;
	}
	
	public ArrayList<Muestra> muestasAMenosDeXDeMuestra(double kms,Muestra muestra,Historial historial) {
		ArrayList<Muestra> listaDeUbicacion = new ArrayList<Muestra>();
			for(Muestra unaMuestra : historial.getListaDeMuestras()) {
				if(this.distanciaEntreCoordenadas(muestra.getUbicacion(), unaMuestra.getUbicacion()) < kms) {
					listaDeUbicacion.add(unaMuestra);
				}
			}
		return listaDeUbicacion;
	}
}
