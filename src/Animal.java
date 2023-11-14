public class Animal {
    // CARACTERISTICAS
    private String nombre;

    private String raza;

    private String color;

    private Integer peso;

    private String tipo;

    // COMPORTAMIENTOS
    // Una funcion tiene dos parttes: Firma y Cuerpo ({})
    // Constructor (Firma distinta)
    public Animal(){}

    public Animal(String nombre, String raza, String color, Integer peso, String tipo){
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.tipo = tipo;
        this.peso = peso;
    }

    // Getters y Setters
    // Por cada propiedad de una Clase, voy a crear
    // 1 método get y 1 método set de esa propiedad.

    // Getter: Obtener el valor de una propiedad
    public String getNombre(){
        return nombre;
    }

    // Setter: Setear el valor de una propiedad
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    // Metodos de la clase

    public String emitirSonido(){
        return "Soy un animal y emito sonido";
    }

    public void respirar(){
        System.out.println("Soy un animal y respiro");
    }

    public String moverse(){
        return "Soy un animal y me muevo";
    }

    public void dormir(){
        System.out.println("Soy un animal y duermo");
    }


}
