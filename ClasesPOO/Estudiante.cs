namespace ClasesPOO
{
    public class Estudiante
    {
        public string Nombre { get; set; }
        public string Edad { get; set; }
        public string Grado { get; set; }

        public Estudiante() { }

        public Estudiante(string a, string b, string c)
        {
            Nombre = a;
            Edad = b;
            Grado = c;
        }

        public void Accion1() => Console.WriteLine("Acción 1 ejecutada en Estudiante.");
        public void Accion2() => Console.WriteLine("Acción 2 ejecutada en Estudiante.");
    }
}
