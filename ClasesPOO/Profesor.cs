namespace ClasesPOO
{
    public class Profesor
    {
        public string Nombre { get; set; }
        public string Materia { get; set; }
        public string Experiencia { get; set; }

        public Profesor() { }

        public Profesor(string a, string b, string c)
        {
            Nombre = a;
            Materia = b;
            Experiencia = c;
        }

        public void Accion1() => Console.WriteLine("Acción 1 ejecutada en Profesor.");
        public void Accion2() => Console.WriteLine("Acción 2 ejecutada en Profesor.");
    }
}
