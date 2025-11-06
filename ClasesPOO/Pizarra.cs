namespace ClasesPOO
{
    public class Pizarra
    {
        public string Tipo { get; set; }
        public string Tamaño { get; set; }
        public string ColorMarco { get; set; }

        public Pizarra() { }

        public Pizarra(string a, string b, string c)
        {
            Tipo = a;
            Tamaño = b;
            ColorMarco = c;
        }

        public void Accion1() => Console.WriteLine("Acción 1 ejecutada en Pizarra.");
        public void Accion2() => Console.WriteLine("Acción 2 ejecutada en Pizarra.");
    }
}
