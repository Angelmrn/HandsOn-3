import java.util.ArrayList;

public class MatesDiscretas {

    private double b0, b1, promX, promY;
    public double[] CalcularB(ArrayList<Data> dataList, double sumX, double sumY, double sumX2, double sumXY){
        int n = dataList.size();
        promX += sumX / n;
        promY += sumY / n;
        b1 = (sumXY - ((sumX * sumY) / n)) / (sumX2 - ((sumX * sumX) / n));
        b0 = promY - (b1 * promX);
        
    
        return new double[]{b0, b1};
    }

    public double Correlacion(ArrayList<Data> dataList, double sumX, double sumY, double sumX2, double sumXY, double sumY2){
        int n = dataList.size();
        return (n * sumXY - sumX * sumY) / 
                Math.sqrt((n * sumX2 - sumX * sumX) * (n * sumY2 - sumY * sumY));
    }
    
}
