namespace ClasesPOO
{
    public class Lampara
    {
        public string Color { get; set; }
        public string Potencia { get; set; }
        public string Tipo { get; set; }

        public Lampara() { }

        public Lampara(string a, string b, string c)
        {
            Color = a;
            Potencia = b;
            Tipo = c;
        }

        public void Accion1() => Console.WriteLine("Acción 1 ejecutada en Lampara.");
        public void Accion2() => Console.WriteLine("Acción 2 ejecutada en Lampara.");
    }
}
