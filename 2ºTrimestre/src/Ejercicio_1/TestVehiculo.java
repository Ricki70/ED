package Ejercicio_1;

public class TestVehiculo {

	public static void main(String[] args) {
		Vehiculo moto = new Vehiculo(2, 150, 200);
		Vehiculo coche = new Vehiculo(4, 200, 1450);
		Vehiculo camion = new Vehiculo(16, 130, 3550);
		Vehiculo fantasma = new Vehiculo(0, 0, 0);
		
		System.out.println(moto.informacion());
		System.out.println(coche.informacion());
		System.out.println(camion.informacion());
		
		if (moto.esigual(camion)) {
			System.out.println("Me quedo con la moto <3");
		}else {
			System.out.println("Me quedo con el camion :(");
		}
		
		fantasma.copia1(moto);
		
		System.out.println(fantasma.informacion());
		
		if (moto.esigual(fantasma)) {
			System.out.println("Me quedo con la moto <3");
		}else {
			System.out.println("Me quedo con el fantasma :(");
		}
		
		Vehiculo avion = moto.copia3();
		
		System.out.println(avion.informacion());
		
		Vehiculo z = avion;
		
		z.setNumruedas(100);
		
		System.out.println(avion.informacion());

	}

}
