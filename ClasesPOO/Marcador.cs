namespace ClasesPOO
{
    public class Marcador
    {
        public string Color { get; set; }
        public string Tinta { get; set; }
        public string Marca { get; set; }

        public Marcador() { }

        public Marcador(string a, string b, string c)
        {
            Color = a;
            Tinta = b;
            Marca = c;
        }

        public void Accion1() => Console.WriteLine("Acción 1 ejecutada en Marcador.");
        public void Accion2() => Console.WriteLine("Acción 2 ejecutada en Marcador.");
    }
}
