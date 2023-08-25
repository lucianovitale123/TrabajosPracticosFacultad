package Ejercicio2;



public class mainEjercicio2 {
	
	public static void main(String[] args) {
		
		//Casteos de las clases 
		
		Producto producto = new Producto();
		ProductoCongelado pCongelado = new ProductoCongelado("1/9/2023", 12, -4);
		ProductoFresco pFresco = new ProductoFresco();
		ProductoRefrigerado pRefrigerado = new ProductoRefrigerado();
		
		System.out.println(producto.toString());
		System.out.println(pCongelado.toString());
		System.out.println(pFresco.toString());
		System.out.println(pRefrigerado.toString());
		

	}
	
	
	
}
