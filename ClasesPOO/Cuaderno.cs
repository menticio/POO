namespace ClasesPOO
{
    public class Cuaderno
    {
        public string Marca { get; set; }
        public string Hojas { get; set; }
        public string Color { get; set; }

        public Cuaderno() { }

        public Cuaderno(string a, string b, string c)
        {
            Marca = a;
            Hojas = b;
            Color = c;
        }

        public void Accion1() => Console.WriteLine("Acción 1 ejecutada en Cuaderno.");
        public void Accion2() => Console.WriteLine("Acción 2 ejecutada en Cuaderno.");
    }
}
