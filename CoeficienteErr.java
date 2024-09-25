import java.util.ArrayList;

public class CoeficienteErr {

    public static double CoefErr(ArrayList<Data> dataList, double b0, double b1){

        double error = 0;

        for (Data punto : dataList) {
            double prediccion = b0 + b1 *punto.getX();
            error += Math.pow(prediccion - punto.getY(), 2);
        }
        return error / dataList.size();
    }

    public static double CalcularR2(ArrayList<Data> Restante, double b0, double b1) {
        double SST = 0;
        double SSR = 0;
        double meanY = 0;

        // Calcular la media de Y
        for (Data p : Restante) {
            meanY += p.y;
        }
        meanY /= Restante.size();

        for (Data p : Restante) {
            // Total sum of squares
            SST += Math.pow(p.y - meanY, 2);
            // Residual sum of squares
            SSR += Math.pow(p.y - (b0 + b1 * p.x), 2);
        }

        // R^2 = 1 - (SS_res / SS_tot)
        return 1 - (SSR / SST);
    }

}