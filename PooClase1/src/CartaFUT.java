public class CartaFUT {

   
    private String nombre;
    private String valoracionMedia;
    private String posicion;
    private String equipo;
    private String ritmo;
    private String tiro;
    private String pase;
    private String regate;
    private String fisico;
    private String defensa;

    public CartaFUT(){}

    public CartaFUT(String nombreCarta, String valoracionMediaCarta,
        String posicionCarta, String equipoCarta, String ritmoCarta,
        String tiroCarta, String paseCarta, String regateCarta, String fisicoCarta,
        String defensaCarta){

            nombre = nombreCarta;
            valoracionMedia = valoracionMediaCarta;
            posicion = posicionCarta;
            equipo = equipoCarta;
            ritmo = ritmoCarta;
            tiro = tiroCarta;
            pase = paseCarta;
            regate = regateCarta;
            fisico = fisicoCarta;
            defensa = defensaCarta;
        }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombreCarta){
        nombre = nombreCarta;
    }


    public String getValoracionMedia(){
        return valoracionMedia;
    }

    public void setValoracionMedia(String valoracionMediaCarta){
        valoracionMedia = valoracionMediaCarta;
    }

    public String getPosicion(){
        return posicion;
    }

    public void setPosicionCarta(String posicionCarta){
        posicion = posicionCarta;
    }

    public String getEquipo(){
        return equipo;
    }

    public void setEquipoCarta(String equipoCarta){
        equipo = equipoCarta;
    }

    public String getRitmo(){
        return ritmo;
    }

    public void setRitmo(String ritmoCarta){
        ritmo = ritmoCarta;
    }

    public String getTiro(){
        return tiro;
    }

    public void setTiro(String tiroCarta){
        tiro = tiroCarta;
    }

    public String getPase(){
        return pase;
    }

    public void setPase(String paseCarta){
        pase = paseCarta;
    }

    public String getRegate(){
        return regate;
    }

    public void setregate(String regateCarta){
        regate = regateCarta;
    }

    public String getFisico(){
        return fisico;
    }

    public void setFisico(String fisicoCarta){
        fisico = fisicoCarta;
    }

    public String getDefensa(){
        return defensa;
    }

    public void setDefensa(String defensaCarta){
        defensa = defensaCarta;
    }

    public String toString(){
        return "PERFIL"
        +"\n Nombre: "+nombre
        +"\n Valoracion promedio: "+valoracionMedia
        +"\n Posicion "+posicion
        +"\n Equipo actual: "+equipo
        +"\n Ritmo: "+ritmo
        +"\n Tiro: "+tiro
        +"\n Pase: "+pase
        +"\n Regate: "+regate
        +"\n Fisico: "+fisico
        +"\n Defensa: "+defensa;
    }


}

