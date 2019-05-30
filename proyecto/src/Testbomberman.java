
import java.util.ArrayList;

import org.junit.Test;

//import packege.Bomberman;
public class Testbomberman {
	private static final Class<Bomba> Bomba = null;

	@Test
	public void darvueltaencirculo() {
		Mapa mapa1 = new Mapa(9, 9, 1);
		ObjetoEnMapa obstaculosMap[][] = mapa1.getobjetos();
		// ArrayList<ObjetoEnMapa> obstaculosMap2 =
		// mapa1.getObstaculos();///Crear un get en laces mapa
		Bomberman b = new Bomberman(0, 0, mapa1);
		// obstaculosMap[b.getPosYEnMapa()][b.getPosXEnMapa()]=null;///Si sacop
		// esta parte en caso de terne un objeto nunca se puede mover
		for (int ancho = 0; ancho < mapa1.getAncho(); ancho++) {
			for (int largo = 0; largo < mapa1.getAncho(); largo++)
				if (ancho == b.getPosYEnMapa() && largo == b.getPosXEnMapa()) {
					System.out.print("[B]");

				} else {
					if (obstaculosMap[ancho][largo] != null)
						System.out.print(obstaculosMap[ancho][largo]);
					else
						System.out.print("[0]");
				}
			System.out.println();
		}
		
		System.out.println("Mover bomberman abajo");
		System.out.println();
		for (int ancho = 0; ancho < 11; ancho++)
			System.out.println(b.moverAbajo() + " " + b.getPosXEnMapa() + "," + b.getPosYEnMapa());

		for (int fila = 0; fila < obstaculosMap.length; fila++) {
			for (int largo = 0; largo < 8; largo++) {
				if (fila == b.getPosYEnMapa() && largo == b.getPosXEnMapa())
					System.out.print("[B]");
				else {
					if (obstaculosMap[fila][largo] != null)
						System.out.print(obstaculosMap[fila][largo]);
					else
						System.out.print("[0]");
				}
			}
			System.out.println();
		}
	}

	// System.out.println("Mover bomberman Derecha");
	// for (int ancho = 0; ancho < 12; ancho++)
	// System.out.println(b.moverDerecha() + " " + b.getPosXEnMapa() + "," +
	// b.getPosYEnMapa());
	//
	// for (int fila = 0; fila < objMap.length; fila++) {
	// for (int largo = 0; largo < 8; largo++) {
	// if (fila == b.getPosYEnMapa() && largo ==b.getPosXEnMapa())
	// System.out.print("[B]");
	// else {
	// if (objMap[fila][largo] != null)
	// System.out.print(objMap[fila][largo]);
	// else
	// System.out.print("[0]");
	// }
	// }
	// System.out.println();
	// }
	//
	// System.out.println("Mover bomberman arriba");
	// for (int ancho = 0; ancho < 12; ancho++)
	// System.out.println(b.moverArriba() + " " + b.getPosXEnMapa() + "," +
	// b.getPosYEnMapa());
	//
	// for (int fila = 0; fila < objMap.length; fila++) {
	// for (int largo = 0; largo < 8; largo++) {
	// if (fila == b.getPosYEnMapa()&& largo == b.getPosXEnMapa())
	// System.out.print("[B]");
	// else {
	// if (objMap[fila][largo] != null)
	// System.out.print(objMap[fila][largo]);
	// else
	// System.out.print("[0]");
	// }
	// }
	// System.out.println();
	// }
	//
	// System.out.println("Mover bomberman izquierda");
	// for (int ancho = 0; ancho < 12; ancho++)
	// System.out.println(b.moverIzquierda() + " " + b.getPosXEnMapa() + "," +
	// b.getPosYEnMapa());
	//
	// for (int fila = 0; fila < objMap.length; fila++) {
	// for (int largo = 0; largo < 8; largo++) {
	// if (fila ==b.getPosYEnMapa() && largo ==b.getPosXEnMapa() )
	// System.out.print("[B]");
	// else {
	// if (objMap[fila][largo] != null)
	// System.out.print(objMap[fila][largo]);
	// else
	// System.out.print("[0]");
	// }
	// }
	// System.out.println();
	// }
	// System.out.println("Debe volver a la misma ubicacion");
	// }

	// @Test
	// public void enCirculoPonerBomba() {
	// Mapa mapa1 = new Mapa(9, 9, 1);
	// ObjetoEnMapa[][] objMap = mapa1.getobjetos();///Crear un get en laces
	// mapa
	// Bomberman b = new Bomberman(0, 0, mapa1);
	// objMap[b.getPosYEnMapa()][b.getPosXEnMapa()]=null;///Si sacop esta parte
	// en caso de terne un objeto nunca se puede mover
	//
	// /**Dibujar Mapa con deTodo**/
	// for (int ancho = 0; ancho < objMap.length; ancho++) {
	// for (int largo = 0; largo < objMap.length; largo++)
	// if (ancho == b.getPosYEnMapa() && largo ==b.getPosXEnMapa())
	// {System.out.print("[B]");
	// }
	// else if (objMap[ancho][largo] != null)
	// System.out.print(objMap[ancho][largo]);
	// else
	// System.out.print("[0]");
	// System.out.println();
	// }
	//
	//// b.plantarBomba();
	//
	// System.out.println("Mover bomberman abajo");
	// for (int ancho = 0; ancho < 12; ancho++)
	// System.out.println(b.moverAbajo() + " " + b.getPosXEnMapa() + "," +
	// b.getPosYEnMapa());
	//
	// for (int fila = 0; fila < objMap.length; fila++) {
	// for (int largo = 0; largo < 8; largo++) {
	// if (fila ==b.getPosYEnMapa() && largo ==b.getPosXEnMapa() )
	// System.out.print("[B]");
	// else {
	// if (objMap[fila][largo] != null && objMap[fila][largo].getClass()!=Bomba)
	// System.out.print(objMap[fila][largo]);
	// else
	// if (objMap[fila][largo] != null && objMap[fila][largo].getClass()==Bomba)
	// System.out.print("[b]");
	// else
	// System.out.print("[0]");
	// }
	// }
	// System.out.println();
	// }
	// b.plantarBomba();
	// System.out.println("Mover bomberman Derecha");
	// for (int ancho = 0; ancho < 12; ancho++)
	// System.out.println(b.moverDerecha() + " " + b.getPosXEnMapa() + "," +
	// b.getPosYEnMapa());
	//
	// for (int fila = 0; fila < objMap.length; fila++) {
	// for (int largo = 0; largo < 8; largo++) {
	// if (fila == b.getPosYEnMapa() && largo ==b.getPosXEnMapa())
	// System.out.print("[B]");
	// else {
	// if (objMap[fila][largo] != null)
	// System.out.print(objMap[fila][largo]);
	// else
	// System.out.print("[0]");
	// }
	// }
	// System.out.println();
	// }
	//
	// System.out.println("Mover bomberman arriba");
	// for (int ancho = 0; ancho < 12; ancho++)
	// System.out.println(b.moverArriba() + " " + b.getPosXEnMapa() + "," +
	// b.getPosYEnMapa());
	//
	// for (int fila = 0; fila < objMap.length; fila++) {
	// for (int largo = 0; largo < 8; largo++) {
	// if (fila == b.getPosYEnMapa()&& largo == b.getPosXEnMapa())
	// System.out.print("[B]");
	// else {
	// if (objMap[fila][largo] != null)
	// System.out.print(objMap[fila][largo]);
	// else
	// System.out.print("[0]");
	// }
	// }
	// System.out.println();
	// }
	//
	// System.out.println("Mover bomberman izquierda");
	// for (int ancho = 0; ancho < 12; ancho++)
	// System.out.println(b.moverIzquierda() + " " + b.getPosXEnMapa() + "," +
	// b.getPosYEnMapa());
	//
	// for (int fila = 0; fila < objMap.length; fila++) {
	// for (int largo = 0; largo < 8; largo++) {
	// if (fila ==b.getPosYEnMapa() && largo ==b.getPosXEnMapa() )
	// System.out.print("[B]");
	// else {
	// if (objMap[fila][largo] != null)
	// System.out.print(objMap[fila][largo]);
	// else
	// System.out.print("[0]");
	// }
	// }
	// System.out.println();
	// }
	// System.out.println("Debe volver a la misma ubicacion");
	// }
}
