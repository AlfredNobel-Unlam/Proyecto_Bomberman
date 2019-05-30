package test;

import org.junit.Test;

import Logica.Bomba;
import Logica.Bomberman;
import Logica.Mapa;
import Logica.ObjetoEnMapa;
import Logica.Obstaculo;

//import packege.Bomberman;
public class test_booberman {
private static final Class<Bomba> Bomba = null;

///funciona
//	@Test
//	public void darvueltaencirculo() {
//		Mapa mapa1 = new Mapa(9, 9, 1);
//		ObjetoEnMapa[][] objMap = mapa1.getobjetos();///Crear un get en laces mapa
//		Bomberman b = new Bomberman(0, 0, mapa1);
//		objMap[b.getPosYEnMapa()][b.getPosXEnMapa()]=null;///Si sacop esta parte en caso de terne un objeto nunca se puede mover
//		for (int ancho = 0; ancho < objMap.length; ancho++) {
//			for (int largo = 0; largo < objMap.length; largo++)
//				if (ancho ==  b.getPosYEnMapa() && largo ==b.getPosXEnMapa())
//					{System.out.print("[B]");
//					}
//				else if (objMap[ancho][largo] != null)
//					System.out.print(objMap[ancho][largo]);///Bebo general totring para que muestre automaticamente sin prefuntar que es
//				else
//					System.out.print("[0]");
//			System.out.println();
//		}
//		System.out.println("Mover bomberman abajo");
//		for (int ancho = 0; ancho < 12; ancho++)
//			System.out.println(b.moverAbajo() + " " + b.getPosXEnMapa() + "," + b.getPosYEnMapa());
//
//		for (int fila = 0; fila < objMap.length; fila++) {
//			for (int largo = 0; largo < 8; largo++) {
//				if (fila ==b.getPosYEnMapa()  && largo ==b.getPosXEnMapa() )
//					System.out.print("[B]");
//				else {
//					if (objMap[fila][largo] != null)
//						System.out.print(objMap[fila][largo]);
//					else
//						System.out.print("[0]");
//				}
//			}
//			System.out.println();
//		}
//
//		System.out.println("Mover bomberman Derecha");
//		for (int ancho = 0; ancho < 12; ancho++)
//			System.out.println(b.moverDerecha() + " " + b.getPosXEnMapa() + "," + b.getPosYEnMapa());
//
//		for (int fila = 0; fila < objMap.length; fila++) {
//			for (int largo = 0; largo < 8; largo++) {
//				if (fila ==  b.getPosYEnMapa() && largo ==b.getPosXEnMapa())
//					System.out.print("[B]");
//				else {
//					if (objMap[fila][largo] != null)
//						System.out.print(objMap[fila][largo]);
//					else
//						System.out.print("[0]");
//				}
//			}
//			System.out.println();
//		}
//		
//		System.out.println("Mover bomberman arriba");
//		for (int ancho = 0; ancho < 12; ancho++)
//			System.out.println(b.moverArriba() + " " + b.getPosXEnMapa() + "," + b.getPosYEnMapa());
//
//		for (int fila = 0; fila < objMap.length; fila++) {
//			for (int largo = 0; largo < 8; largo++) {
//				if (fila ==  b.getPosYEnMapa()&& largo == b.getPosXEnMapa())
//					System.out.print("[B]");
//				else {
//					if (objMap[fila][largo] != null)
//						System.out.print(objMap[fila][largo]);
//					else
//						System.out.print("[0]");
//				}
//			}
//			System.out.println();
//		}
//
//		System.out.println("Mover bomberman izquierda");
//		for (int ancho = 0; ancho < 12; ancho++)
//			System.out.println(b.moverIzquierda() + " " + b.getPosXEnMapa() + "," + b.getPosYEnMapa());
//
//		for (int fila = 0; fila < objMap.length; fila++) {
//			for (int largo = 0; largo < 8; largo++) {
//				if (fila ==b.getPosYEnMapa()  && largo ==b.getPosXEnMapa() )
//					System.out.print("[B]");
//				else {
//					if (objMap[fila][largo] != null)
//						System.out.print(objMap[fila][largo]);
//					else
//						System.out.print("[0]");
//				}
//			}
//			System.out.println();
//		}
//		System.out.println("Debe volver a la misma ubicacion");
//	}
	
	@Test
	public void enCirculoPonerBomba() {
		Mapa mapa1 = new Mapa(9, 9, 1);
		ObjetoEnMapa[][] objMap = mapa1.getobjetos();///Crear un get en laces mapa
		Bomberman b = new Bomberman(0, 0, mapa1);
		objMap[b.getPosYEnMapa()][b.getPosXEnMapa()]=null;///Si sacop esta parte en caso de terne un objeto nunca se puede mover
		
		/**Dibujar Mapa con deTodo**/
		for (int ancho = 0; ancho < objMap.length; ancho++) {
			for (int largo = 0; largo < objMap.length; largo++)
				if (ancho ==  b.getPosYEnMapa() && largo ==b.getPosXEnMapa())
					{System.out.print("[B]");
					}
				else if (objMap[ancho][largo] != null)
					System.out.print(objMap[ancho][largo]);
				else
					System.out.print("[0]");
			System.out.println();
		}
		
//		b.plantarBomba();
		
		System.out.println("Mover bomberman abajo");
		for (int ancho = 0; ancho < 12; ancho++)
			System.out.println(b.moverAbajo() + " " + b.getPosXEnMapa() + "," + b.getPosYEnMapa());

		for (int fila = 0; fila < objMap.length; fila++) {
			for (int largo = 0; largo < 8; largo++) {
				if (fila ==b.getPosYEnMapa()  && largo ==b.getPosXEnMapa() )
					System.out.print("[B]");
				else {
					if (objMap[fila][largo] != null && objMap[fila][largo].getClass()!=Bomba)
						System.out.print(objMap[fila][largo]);
					else
						if (objMap[fila][largo] != null && objMap[fila][largo].getClass()==Bomba)
						System.out.print("[b]");
						else
							System.out.print("[0]");
				}
			}
			System.out.println();
		}
		b.plantarBomba();
		System.out.println("Mover bomberman Derecha");
		for (int ancho = 0; ancho < 12; ancho++)
			System.out.println(b.moverDerecha() + " " + b.getPosXEnMapa() + "," + b.getPosYEnMapa());

		for (int fila = 0; fila < objMap.length; fila++) {
			for (int largo = 0; largo < 8; largo++) {
				if (fila ==  b.getPosYEnMapa() && largo ==b.getPosXEnMapa())
					System.out.print("[B]");
				else {
					if (objMap[fila][largo] != null)
						System.out.print(objMap[fila][largo]);
					else
						System.out.print("[0]");
				}
			}
			System.out.println();
		}
		
		System.out.println("Mover bomberman arriba");
		for (int ancho = 0; ancho < 12; ancho++)
			System.out.println(b.moverArriba() + " " + b.getPosXEnMapa() + "," + b.getPosYEnMapa());

		for (int fila = 0; fila < objMap.length; fila++) {
			for (int largo = 0; largo < 8; largo++) {
				if (fila ==  b.getPosYEnMapa()&& largo == b.getPosXEnMapa())
					System.out.print("[B]");
				else {
					if (objMap[fila][largo] != null)
						System.out.print(objMap[fila][largo]);
					else
						System.out.print("[0]");
				}
			}
			System.out.println();
		}

		System.out.println("Mover bomberman izquierda");
		for (int ancho = 0; ancho < 12; ancho++)
			System.out.println(b.moverIzquierda() + " " + b.getPosXEnMapa() + "," + b.getPosYEnMapa());

		for (int fila = 0; fila < objMap.length; fila++) {
			for (int largo = 0; largo < 8; largo++) {
				if (fila ==b.getPosYEnMapa()  && largo ==b.getPosXEnMapa() )
					System.out.print("[B]");
				else {
					if (objMap[fila][largo] != null)
						System.out.print(objMap[fila][largo]);
					else
						System.out.print("[0]");
				}
			}
			System.out.println();
		}
		System.out.println("Debe volver a la misma ubicacion");
	}
}
