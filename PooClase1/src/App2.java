public class App2 {

    public static void main(String[] args) {
      /*  System.out.println("hola mundo");

        Cancion c1 = new Cancion();
        c1.setId(1);
        c1.setNombre("Cancion1");
        c1.setDuracion(3.5);
        c1.setFechaDePublicacion("30/10/2020");
        c1.setNumeroDeRepeticiones(200);
        c1.setFoto("URL1");

        System.out.println("Se ha agregado la cancion: " + c1.getNombre() + " Con id: " + c1.getId() +
                " Publicada el: " + c1.getFechaDePublicacion() + " Con " + c1.getNumeroDeRepeticiones()
                + " repeticiones y la foto del artista: " + c1.getFoto());

        Cancion c2 = new Cancion(2, "Cancion2", 3.4, "30/09/2018", 300, "URL2");

        System.out.println("Se ha agregado la cancion: " + c2.getNombre() + " Con id: " + c2.getId() +
                " Publicada el: " + c2.getFechaDePublicacion() + " Con " + c2.getNumeroDeRepeticiones()
                + " repeticiones y la foto del artista: " + c2.getFoto());

        Cancion c3 = new Cancion(3, "Cancion3", 3.8, "10/06/2015", 400, "URL3");

        System.out.println("Se ha agregado la cancion: " + c3.getNombre() + " Con id: " + c3.getId() +
                " Publicada el: " + c3.getFechaDePublicacion() + " Con " + c3.getNumeroDeRepeticiones() +
                " repeticiones y la foto del artista: " + c3.getFoto());

         c1.setFechaDePublicacion("20/09/2020");
         System.out.println("Se ha modificado la fecha de la "+c1.getNombre()+", la fecha actual es "+c1.getFechaDePublicacion());
        */ 
         
        CartaFUT pr1 = new CartaFUT();
        pr1.setNombre("Carlos");
        pr1.setValoracionMedia("Buena");
        pr1.setPosicionCarta("del");
        pr1.setEquipoCarta("Real Madrid");
        pr1.setRitmo("bueno");
        pr1.setTiro("alto");
        pr1.setPase("corto");
        pr1.setregate("doble");
        pr1.setFisico("Formidable");
        pr1.setDefensa("media");
    
        System.out.println("Se a Creado la Carta con: "
        +"\n Nombre:"+pr1.getNombre()       
        +"\n Valoracion promedio: "+pr1.getValoracionMedia()
        +"\n Posicion: "+pr1.getPosicion()
        +"\n Equipo actual: "+pr1.getEquipo()
        +"\n Ritmo: "+pr1.getRitmo()
        +"\n Tiro: "+pr1.getTiro()
        +"\n Pase: "+pr1.getPase()
        +"\n Regate: "+pr1.getRegate()
        +"\n Fisico: "+pr1.getFisico()
        +"\n Defensa: "+pr1.getDefensa());
        
        CartaFUT pr2 = new CartaFUT();
        pr2.setNombre("Juan");
        pr2.setValoracionMedia("Buena");
        pr2.setPosicionCarta("del");
        pr2.setEquipoCarta("real");
        pr2.setRitmo("bueno");
        pr2.setTiro("alto");
        pr2.setPase("corto");
        pr2.setregate("doble");
        pr2.setFisico("Formidable");
        pr2.setDefensa("media");
    
        System.out.println("Se a Creado la Carta con: "
        +"\n Nombre:"+pr2.getNombre()       
        +"\n Valoracion promedio: "+pr2.getValoracionMedia()
        +"\n Posicion "+pr2.getPosicion()
        +"\nEquipo actual: "+pr2.getEquipo()
        +"\n Ritmo: "+pr2.getRitmo()
        +"\n Tiro: "+pr2.getTiro()
        +"\n Pase: "+pr2.getPase()
        +"\n Regate: "+pr2.getRegate()
        +"\n Fisico: "+pr2.getFisico()
        +"\n Defensa: "+pr2.getDefensa());

        CartaFUT pr3 = new CartaFUT();
        pr3.setNombre("Pedro");
        pr3.setValoracionMedia("Buena");
        pr3.setPosicionCarta("del");
        pr3.setEquipoCarta("real");
        pr3.setRitmo("bueno");
        pr3.setTiro("alto");
        pr3.setPase("corto");
        pr3.setregate("doble");
        pr3.setFisico("Formidable");
        pr3.setDefensa("media");
    
        System.out.println("Se a Creado la Carta con: "
        +"\n Nombre:"+pr3.getNombre()       
        +"\n Valoracion promedio: "+pr3.getValoracionMedia()
        +"\n Posicion "+pr3.getPosicion()
        +"\n Equipo actual: "+pr3.getEquipo()
        +"\n Ritmo: "+pr3.getRitmo()
        +"\n Tiro: "+pr3.getTiro()
        +"\n Pase: "+pr3.getPase()
        +"\n Regate: "+pr3.getRegate()
        +"\n Fisico: "+pr3.getFisico()
        +"\n Defensa: "+pr3.getDefensa());
    

        pr2.setEquipoCarta("Valencia");
        pr2.setPosicionCarta("def");
        System.out.println("el jugador "+ pr2.getNombre()+" a cambiado de posicion a: "+ pr2.getPosicion()+" y de equipo a: "+pr2.getEquipo());

        pr3.setEquipoCarta("Barcelona");
        pr3.setPosicionCarta("cen");
        System.out.println("el jugador "+ pr3.getNombre()+" a cambiado de posicion a: "+ pr3.getPosicion()+" y de equipo a: "+pr3.getEquipo());

        System.out.println(pr1);
            }

}
