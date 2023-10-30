package main;

import java.util.ArrayList;

public class podio {
	private ArrayList<cocheHilo> posiciones;

	public podio(ArrayList<cocheHilo> posiciones) {		
		this.posiciones = posiciones;
	}

	public ArrayList<cocheHilo> getPosiciones() {
		return posiciones;
	}

	public void setPosiciones(ArrayList<cocheHilo> posiciones) {
		this.posiciones = posiciones;
	}
	
	public synchronized boolean contains(cocheHilo coche) {
		return posiciones.contains(coche);
	}
	
	
	public synchronized void updatePodio(cocheHilo coche) {
		posiciones.set(posiciones.indexOf(coche), coche);
	}
	
	public synchronized void add(cocheHilo coche) {
		posiciones.add(coche);
	}
	
	public synchronized void imprimirPodio() {
		for (int i = 0; i < posiciones.size(); i++) {
			
			System.out.println((i + 1) + " " + posiciones.get(i).getIde() + " " + posiciones.get(i).getVueltas());
			}
		System.out.println("\n");
	}
	
	

	
	
	
}
