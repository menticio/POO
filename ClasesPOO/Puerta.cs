namespace ClasesPOO
{
    public class Puerta
    {
        public string Material { get; set; }
        public string Color { get; set; }
        public string Altura { get; set; }

        public Puerta() { }

        public Puerta(string a, string b, string c)
        {
            Material = a;
            Color = b;
            Altura = c;
        }

        public void Accion1() => Console.WriteLine("Acción 1 ejecutada en Puerta.");
        public void Accion2() => Console.WriteLine("Acción 2 ejecutada en Puerta.");
    }
}
