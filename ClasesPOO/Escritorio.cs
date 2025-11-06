namespace ClasesPOO
{
    public class Escritorio
    {
        public string Material { get; set; }
        public string Color { get; set; }
        public string Cajones { get; set; }

        public Escritorio() { }

        public Escritorio(string a, string b, string c)
        {
            Material = a;
            Color = b;
            Cajones = c;
        }

        public void Accion1() => Console.WriteLine("Acción 1 ejecutada en Escritorio.");
        public void Accion2() => Console.WriteLine("Acción 2 ejecutada en Escritorio.");
    }
}
