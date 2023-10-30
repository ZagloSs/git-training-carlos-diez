package main;

import java.util.ArrayList;
import java.util.Random;

public class cocheHilo extends Thread{
	private String ide;
	private Integer vueltas= 0;
	podio podio;
	public cocheHilo(String id, podio podio) {
		this.podio = podio;
		this.ide = id;
	}

	public String getIde() {
		return ide;
	}


	public void setIde(String ide) {
		this.ide = ide;
	}


	public Integer getVueltas() {
		return vueltas;
	}


	public void setVueltas(int vueltas) {
		this.vueltas = vueltas;
	}


	public void run() {
		Random r = new Random();
		
		
		for(int i = 0; i< 10; i++) {
			try {
				Thread.sleep(r.nextLong(2500)+500);
				vueltas++;
				if(podio.contains(this)) {
					podio.updatePodio(this);
				}else {
					podio.add(this);
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
	
	
	
}
