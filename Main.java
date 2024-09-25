import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Data.slr();
        Data.ObtenerDatos70();
        Data.ObtenerDatos30();
        Data.ObtenersegDatos30();
        Data.ObtenersegDatos70();

        SLR slrmodelo = new SLR();
        Modelo modelo = slrmodelo.slr(Data.datos70);
        Modelo modelo2 = slrmodelo.slr(Data.segdatos70);
        
        modelo.MostrarModelo(modelo, modelo2);
    
    }    
}