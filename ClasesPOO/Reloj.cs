namespace ClasesPOO
{
    public class Reloj
    {
        public string Marca { get; set; }
        public string Tipo { get; set; }
        public string HoraActual { get; set; }

        public Reloj() { }

        public Reloj(string a, string b, string c)
        {
            Marca = a;
            Tipo = b;
            HoraActual = c;
        }

        public void Accion1() => Console.WriteLine("Acción 1 ejecutada en Reloj.");
        public void Accion2() => Console.WriteLine("Acción 2 ejecutada en Reloj.");
    }
}
