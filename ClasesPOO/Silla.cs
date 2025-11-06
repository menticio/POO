namespace ClasesPOO
{
    public class Silla
    {
        public string Material { get; set; }
        public string Color { get; set; }
        public string TieneEspaldar { get; set; }

        public Silla() { }

        public Silla(string a, string b, string c)
        {
            Material = a;
            Color = b;
            TieneEspaldar = c;
        }

        public void Accion1() => Console.WriteLine("Acción 1 ejecutada en Silla.");
        public void Accion2() => Console.WriteLine("Acción 2 ejecutada en Silla.");
    }
}
