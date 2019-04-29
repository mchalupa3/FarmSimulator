public class Plots {
    private boolean plotFilled;
    public double cropTime;


    public void setPlotStatus(boolean  b){
        plotFilled = b;
    }
    public static int[][] plots = new int[3][3];

    public static void main(String[] args){
        for(int i = 0; i < 4; i++ ){
            for(int b = 0; b < 4; b++){
                plots[i][b] = 0;
            }
        }

    }





    public void setTime(double t){
        cropTime =t;
    }

    public double getCropTime(){
        return cropTime;
    }

    public boolean isPlotFilled(){
        return plotFilled;
    }

    public void displayPlotempty(){
        System.out.println( "_________________________" );
        System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _|" );
        System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _|" );
        System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _|" );
        System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _|" );
        System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _|" );
        System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _|" );
        System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _|" );
        System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _|" );
        System.out.println("|_________________________|" );
    }

    public void displayPlotFilled(){
        System.out.println( "_________________________" );
        System.out.println("|. _ . _ . _ . _ . _ . _ _|" );
        System.out.println("|. _ . _ . _ . _ . _ . _ _|" );
        System.out.println("|. _ . _ . _ . _ . _ . _ _|" );
        System.out.println("|. _ . _ . _ . _ . _ . _ _|" );
        System.out.println("|. _ . _ . _ . _ . _ . _ _|" );
        System.out.println("|. _ . _ . _ . _ . _ . _ _|" );
        System.out.println("|. _ . _ . _ . _ . _ . _ _|" );
        System.out.println("|. _ . _ . _ . _ . _ . _ _|" );
        System.out.println("|_________________________|" );




    }



}