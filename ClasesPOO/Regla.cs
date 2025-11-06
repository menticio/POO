namespace ClasesPOO
{
    public class Regla
    {
        public string Material { get; set; }
        public string Longitud { get; set; }
        public string Color { get; set; }

        public Regla() { }

        public Regla(string a, string b, string c)
        {
            Material = a;
            Longitud = b;
            Color = c;
        }

        public void Accion1() => Console.WriteLine("Acción 1 ejecutada en Regla.");
        public void Accion2() => Console.WriteLine("Acción 2 ejecutada en Regla.");
    }
}
