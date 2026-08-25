public class producto {

    public String CODIGO;
    public String Nombre;
    public double Precio;

    public producto(String c, String n, double p) {
        CODIGO = c;
        Nombre = n;
        Precio = p;
    }

    public void Mostrar() {
        System.out.println(CODIGO);
    }
}