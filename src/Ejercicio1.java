import acm.program.*;
import acm.graphics.*;
public class Ejercicio1 extends GraphicsProgram {
	
	public void run(){
		setSize(800,600);
		pintaPiramide();
	}
	
public void pintaPiramide(){
	int numLadrillosBase = 14;
	int anchoLadrillo = 30;
	int altoLadrillo = 12;
	for (int h=0; h< numLadrillosBase; h++){
	for (int i=0; i< numLadrillosBase-h ; i++){
		GRect ladrillo = new GRect(anchoLadrillo, altoLadrillo);
		add(ladrillo,anchoLadrillo*h/2  + anchoLadrillo * i,altoLadrillo * h);
		pause(900);
	}
	
}

}	
}
