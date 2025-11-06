namespace ClasesPOO
{
    public class Papelera
    {
        public string Material { get; set; }
        public string Capacidad { get; set; }
        public string Color { get; set; }

        public Papelera() { }

        public Papelera(string a, string b, string c)
        {
            Material = a;
            Capacidad = b;
            Color = c;
        }

        public void Accion1() => Console.WriteLine("Acción 1 ejecutada en Papelera.");
        public void Accion2() => Console.WriteLine("Acción 2 ejecutada en Papelera.");
    }
}
