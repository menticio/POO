namespace ClasesPOO
{
    public class Borrador
    {
        public string Material { get; set; }
        public string Color { get; set; }
        public string Tamaño { get; set; }

        public Borrador() { }

        public Borrador(string a, string b, string c)
        {
            Material = a;
            Color = b;
            Tamaño = c;
        }

        public void Accion1() => Console.WriteLine("Acción 1 ejecutada en Borrador.");
        public void Accion2() => Console.WriteLine("Acción 2 ejecutada en Borrador.");
    }
}
