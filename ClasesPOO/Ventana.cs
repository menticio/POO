namespace ClasesPOO
{
    public class Ventana
    {
        public string Material { get; set; }
        public string Tamaño { get; set; }
        public string TipoVidrio { get; set; }

        public Ventana() { }

        public Ventana(string a, string b, string c)
        {
            Material = a;
            Tamaño = b;
            TipoVidrio = c;
        }

        public void Accion1() => Console.WriteLine("Acción 1 ejecutada en Ventana.");
        public void Accion2() => Console.WriteLine("Acción 2 ejecutada en Ventana.");
    }
}
