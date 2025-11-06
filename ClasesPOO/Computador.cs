namespace ClasesPOO
{
    public class Computador
    {
        public string Marca { get; set; }
        public string Ram { get; set; }
        public string SistemaOperativo { get; set; }

        public Computador() { }

        public Computador(string a, string b, string c)
        {
            Marca = a;
            Ram = b;
            SistemaOperativo = c;
        }

        public void Accion1() => Console.WriteLine("Acción 1 ejecutada en Computador.");
        public void Accion2() => Console.WriteLine("Acción 2 ejecutada en Computador.");
    }
}
