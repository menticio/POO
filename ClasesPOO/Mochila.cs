namespace ClasesPOO
{
    public class Mochila
    {
        public string Color { get; set; }
        public string Tamaño { get; set; }
        public string Material { get; set; }

        public Mochila() { }

        public Mochila(string a, string b, string c)
        {
            Color = a;
            Tamaño = b;
            Material = c;
        }

        public void Accion1() => Console.WriteLine("Acción 1 ejecutada en Mochila.");
        public void Accion2() => Console.WriteLine("Acción 2 ejecutada en Mochila.");
    }
}
