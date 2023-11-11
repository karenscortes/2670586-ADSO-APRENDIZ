public class Principal{
	public static void main(String[] args) {
		
		Usuario listaUsuarios [] = new Usuario [100];
		Producto listaProductos [] = new Producto [10];

		listaUsuarios[0] = new Usuario("10221", "Oscar Loaiza", "Calle 20", "CLIENTE");
		listaUsuarios[1] = new Usuario("10222", "Daniel Garcia", "Calle 19", "CLIENTE");
		listaUsuarios[2] = new Usuario("10223", "Juan Lopez", "Calle 18", "CLIENTE");
		listaUsuarios[3] = new Usuario("10224", "Catalina Mendez", "Calle 17", "CLIENTE");
		listaUsuarios[4] = new Usuario("10225", "Andres Lopez", "Calle 16", "CLIENTE");
		listaUsuarios[5] = new Usuario("11201", "Bella Diaz", "Calle 22", "VENDEDOR");
		listaUsuarios[6] = new Usuario("11202", "Marcela Patricia", "Calle 11", "VENDEDOR");
		listaUsuarios[7] = new Usuario("11203", "Vicente Fernandez", "Calle 78", "VENDEDOR");
		listaUsuarios[8] = new Usuario("11204", "Camila", "Calle 10", "VENDEDOR");
		listaUsuarios[9] = new Usuario("11205", "Andriana Ramirez", "Calle 9", "VENDEDOR");

		listaProductos[0] = new Producto("1010", "Leche", 3800);
		listaProductos[1] = new Producto("1011", "Carne 1Kg", 25600);
		listaProductos[2] = new Producto("1012", "Carne 1Lb", 12800);
		listaProductos[3] = new Producto("1013", "Jabon Barra", 2500);
		listaProductos[4] = new Producto("1014", "Detergente 1Kg", 15000);

		Facturador ventana = new Facturador(listaUsuarios, listaProductos);
		

	}
}