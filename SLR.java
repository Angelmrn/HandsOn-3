import java.util.ArrayList;

public class SLR{
    double sumX = 0, sumY = 0, sumX2 = 0, sumXY = 0, sumY2 = 0;
    //private MatesDiscretas mates = new MatesDiscretas();

    public Modelo slr(ArrayList<Data> dataList){
          sumX  = 0;
          sumY  = 0;
          sumX2 = 0;
          sumXY = 0;
          sumY2 = 0;

        for (Data data : dataList){
            double x = data.getX();
            double y = data.getY();
            sumX  += x;
            sumY  += y;
            sumX2 += x*x;
            sumXY += x*y;
            sumY2 += y*y;
            
        }
        //calcualr b0 y b1
        MatesDiscretas mates = new MatesDiscretas();
        double[] Valuesb1b0 = mates.CalcularB(dataList, sumX, sumY, sumX2, sumXY);
        double b0 = Valuesb1b0[0];
        double b1 = Valuesb1b0[1];

        double cor = mates.Correlacion(dataList, sumX, sumY, sumX2, sumXY, sumY2);
        

        return new Modelo(b0, b1, cor);
        
    }

}