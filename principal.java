public class principal {
    /**
     * La primera clase que se ejecuta
     * @param args
     *
     * Complejidad temporal: 0 tiempo constante
     */
    public static void main(String[] args) {
        /**
         *Se crea un objeto bibliotecaKonradLorenz
         */
        Biblioteca bibliotecaKonradLorenz = new Biblioteca();
        /**
         *Se crea el objeto cienAnosSoledad
         */
        Libro cienAnosSoledad = new Libro("Cien años de soledad", "Gabriel García Márquez", 496);
        bibliotecaKonradLorenz.registrarLibro(cienAnosSoledad);
        /**
         * Se crea el objeto codigoDaVinci
         */
        Libro codigoDaVinci = new Libro("El código Da Vinci","Dan Brown", 656);
        bibliotecaKonradLorenz.registrarLibro(codigoDaVinci);
        /**
         * Se crea el objeto numero
         */
        Libro numero = new Libro("1984","George Orwell",326);
        bibliotecaKonradLorenz.registrarLibro(numero);
        /**
         * Se crea el objeto hobbit
         */
        Libro hobbit = new Libro("El Hobbit","J.R.R. Tolkien", 310);
        bibliotecaKonradLorenz.registrarLibro(hobbit);
        /**
         * Se crea el objeto odisea
         */
        Libro odisea = new Libro("La Odisea","Homero",448);
        bibliotecaKonradLorenz.registrarLibro(odisea);

    }
} // cierra class

