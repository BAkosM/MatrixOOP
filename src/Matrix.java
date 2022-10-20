import java.util.Random;

public class Matrix {
    private int sor;
    private int oszlop;
    private int[][] m;
    private static final Random rnd = new Random(); 

    public Matrix(int sor, int oszlop) {
        this.sor = sor;
        this.oszlop = oszlop;
        this.m = new int[sor][oszlop];
        for (int i = 0; i < this.m.length; i++){
            for (int j = 0; j < this.m[i].length; j++){
                this.m[i][j] = rnd.nextInt(150)-50;
            }
        }
    }

    public int getElemOssz(){
        int ossz = 0;
        for (int[] sor: this.m){
            for (int elem: sor){
                ossz =+ elem;
            }
        }
        return ossz;
    }

    public int getPozitivDb(){
        int db = 0;
        for (int[] sor: this.m){
            for (int elem: sor){
                if (elem > 0){
                    db++;
                }
            }
        }
        return db;
    }

    public int getMaxElem(){
        int max = this.m[0][0];
        for (int i = 0; i < this.m.length; i++){
            for (int j = 0; j < this.m[i].length; j++){
                if (max < this.m[i][j]){
                    max = this.m[i][j];
                }
            }
        }
        return max;
    }

    public int[] getElsoPozitiv(){
        int sorI = 0;
        int oszlopI = 0;
        while (sorI < this.m.length && this.m[sorI][oszlopI] < 1){ 
            while (oszlopI < this.m[sorI].length && this.m[sorI][oszlopI] < 1){
                oszlopI++;
            }
            if (oszlopI == this.m[sorI].length){
                oszlopI = 0;
                sorI++; 
            }         
        }
        if (sorI == this.m.length){
        return new int[] {-1,-1}; 
        }
        return new int[] {sorI, oszlopI};
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] sor: this.m){
            for (int elem: sor) {
                sb.append(String.format("%3d ", elem));
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
