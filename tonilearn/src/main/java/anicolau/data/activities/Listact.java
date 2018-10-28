package anicolau.data.activities;


/**
 * anb00 listactividades
 */

public class Listact {


 public Listact(String nombre, String lugar, String provincia, String genero, String riesgo) {
 this.nombre = nombre;
 this.lugar = lugar;
 this.provincia = provincia;
 this.genero = genero;
 this. riesgo = riesgo;


    }

    public String nombre;
    public String lugar;
    public String provincia;
    public String genero;
    private String riesgo;

    public Listact(String nombre) {
        return;
    }


    public void dmountain() {
        System.out.println("Es una actividad de Montaña");

    }

    protected void driver() {
        System.out.println("Es una actividad de Carretera ");

    }

    private void dwater() {
        System.out.println("Es una actividad de Agua");

    }

    public String getNombre() {
        return this.nombre;
    }
    public String getlugar() {
        return this.lugar;
    }
    public String getprovincia() {
        return this.provincia;
    }
    public String getgenero() {
        return this.genero;
    }
    public String getriesgo() {
        return this.riesgo;
    }

}
