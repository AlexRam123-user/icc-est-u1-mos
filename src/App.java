public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Metodo ordenamiento Seleccion");
        MetodosOrdenamiento mo = new MetodosOrdenamiento();

        int[] arreglo = { 10, 5, 8, 2, 0 };

        int[] arregloOrdenado = mo.sortBySeleccion(arreglo);

        int[] arregloDes = { 10, 5, 8, 2, 0 };

        int[] arregloOrdenadoDes = mo.sortBySeleccionDes(arregloDes);

        mo.printArreglo(arregloOrdenado);
        mo.printArregloDes(arregloOrdenadoDes);
    }
}
