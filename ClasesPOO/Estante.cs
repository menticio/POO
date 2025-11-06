namespace ClasesPOO
{
    public class Estante
    {
        public string Material { get; set; }
        public string Niveles { get; set; }
        public string Color { get; set; }

        public Estante() { }

        public Estante(string a, string b, string c)
        {
            Material = a;
            Niveles = b;
            Color = c;
        }

        public void Accion1() => Console.WriteLine("Acción 1 ejecutada en Estante.");
        public void Accion2() => Console.WriteLine("Acción 2 ejecutada en Estante.");
    }
}
