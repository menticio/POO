namespace ClasesPOO
{
    public class BotellaAgua
    {
        public string Material { get; set; }
        public string Capacidad { get; set; }
        public string Color { get; set; }

        public BotellaAgua() { }

        public BotellaAgua(string a, string b, string c)
        {
            Material = a;
            Capacidad = b;
            Color = c;
        }

        public void Accion1() => Console.WriteLine("Acción 1 ejecutada en BotellaAgua.");
        public void Accion2() => Console.WriteLine("Acción 2 ejecutada en BotellaAgua.");
    }
}
