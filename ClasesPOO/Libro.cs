namespace ClasesPOO
{
    public class Libro
    {
        public string Titulo { get; set; }
        public string Autor { get; set; }
        public string Paginas { get; set; }

        public Libro() { }

        public Libro(string a, string b, string c)
        {
            Titulo = a;
            Autor = b;
            Paginas = c;
        }

        public void Accion1() => Console.WriteLine("Acción 1 ejecutada en Libro.");
        public void Accion2() => Console.WriteLine("Acción 2 ejecutada en Libro.");
    }
}
