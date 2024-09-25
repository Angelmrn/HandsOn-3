import java.util.ArrayList;

public class Modelo {
    double b0, b1, correlacion;

    public static ArrayList<Modelo> modelos = new ArrayList<>();
    
    public Modelo(double b0, double b1, double correlacion){
        this.b0 = b0;
        this.b1 = b1;
        this.correlacion = correlacion;
    }

    public double getB0(){
        return b0;
    }
    public double getB1(){
        return b1;
    } 
    public double getCorrelacion() {
        return correlacion;
    }


    public void MostrarModelo(Modelo modelo, Modelo modelo2){
        System.out.println("----------------------------------------------");
        System.out.println("             70% - 30% de los datos           ");  
        System.out.println("----------------------------------------------");
        System.out.println("La ecuacion es: Y = B0 + (B1 * X1)");
        System.out.println("Y = " + modelo.b0 + " + (" + modelo.b1 + " * x)");
        System.out.println("B1 : " + modelo.b1);
        System.out.println("B0 : " + modelo.b0);
        System.out.println("El coeficiente de error es: " + CoeficienteErr.CoefErr(Data.datos30, modelo.b0, modelo.b1));
        System.out.println("Coeficiente de Determinacion = " + CoeficienteErr.CalcularR2(Data.datos30, modelo.b0, modelo.b1));
        System.out.println("correlacion: " + modelo.getCorrelacion()); 
        System.out.println("----------------------------------------------");
        System.out.println("                  Simulaciones                ");
        System.out.println("----------------------------------------------");
        int []val = {100, 102, 104, 95, 109};
        for(int valores: val){
            double y = modelo.b0 + (modelo.b1 * valores);  // Calcula correctamente el valor de Y
            System.out.println("X: " + valores + "  Y = " + y);
        }
        System.out.println("----------------------------------------------");
        System.out.println("             30% - 70% de los datos           ");
        System.out.println("----------------------------------------------");
        System.out.println("Y = "  + modelo2.b0 + " + (" + modelo2.b1 + " * x)");
        System.out.println("B1 : " + modelo2.b1);
        System.out.println("B0 : " + modelo2.b0);
        System.out.println("El coeficiente de error es: " + CoeficienteErr.CoefErr(Data.segdatos30, modelo2.b0, modelo2.b1));
        System.out.println("Coeficiente de Determinacion = " + CoeficienteErr.CalcularR2(Data.segdatos30, modelo2.b0, modelo2.b1));
        System.out.println("correlacion: " + modelo2.getCorrelacion());
        System.out.println("----------------------------------------------");
        System.out.println("                  Simulaciones                ");
        System.out.println("----------------------------------------------");
        int []val2 = {10,102,104,95,109};
        for(int valores: val2){
            double y = modelo2.b0 + (modelo2.b1 * valores);  // Calcula correctamente el valor de Y
            System.out.println("X: " + valores + "  Y = " + y);
        }
       
    }
}