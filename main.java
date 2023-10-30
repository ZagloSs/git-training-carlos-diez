package main;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		int nCoches = 10;
		ArrayList<cocheHilo> coches = new ArrayList<cocheHilo>();
		podio podio = new podio(new ArrayList<cocheHilo>());
		
		
		for(int i = 0; i < nCoches; i++) {
			coches.add(new cocheHilo("C"+(i+1), podio));
			coches.get(i).start();
		}
		
		for (cocheHilo coche : coches) {
			while (coche.isAlive()) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
				sort(podio.getPosiciones());
				podio.imprimirPodio();

			}
			

		}
			
	}
	
	public static void sort(ArrayList<cocheHilo> podio) {
		podio.sort((c2, c1) -> c1.getVueltas().compareTo(c2.getVueltas()));

	}
}


