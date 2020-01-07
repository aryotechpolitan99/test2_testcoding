import java.text.DecimalFormat;

public class Gaji{
	public static void main(String[] args){
		double gp = 4600897;
        double tunjangan = 0.1 * gp;
        int jmlAnak = 4;
        double tunjanganAnak = jmlAnak * 0.2 * gp;
        double bruto = gp + tunjangan + tunjanganAnak;
        double Iuran = 0.04 * gp;
        double netto = bruto - Iuran;
        
        System.out.println("Gaji Pokok             :       Rp."+ formate(gp));
        System.out.println("Jumlah Anak            :          "+ formate(jmlAnak)+" Anak");
        System.out.println("Tunjangan Ortu         :       Rp."+ formate(tunjangan));
        System.out.println("Tunjangan Anak         :       Rp."+ formate(tunjanganAnak));
        System.out.println("Bruto                  :       Rp."+ formate(bruto));
        System.out.println("Iuran                  :       Rp."+ formate(Iuran));
        System.out.println("Netto                  :       Rp."+ formate(netto));
		
	}
	private static String formate(double d){
        DecimalFormat format = new DecimalFormat("#,###");
        return format.format(d);
    }
	
}