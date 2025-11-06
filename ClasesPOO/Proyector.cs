namespace ClasesPOO
{
    public class Proyector
    {
        public string Marca { get; set; }
        public string Resolucion { get; set; }
        public string Brillo { get; set; }

        public Proyector() { }

        public Proyector(string a, string b, string c)
        {
            Marca = a;
            Resolucion = b;
            Brillo = c;
        }

        public void Accion1() => Console.WriteLine("Acción 1 ejecutada en Proyector.");
        public void Accion2() => Console.WriteLine("Acción 2 ejecutada en Proyector.");
    }
}
