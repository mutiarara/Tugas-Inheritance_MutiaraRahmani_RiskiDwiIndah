import java.util.ArrayList;
//belum menggunakan inheritance, idealnya turunan dari Item
public class Pintu{
    /*Oleh Mutiara Rahmani : 1900432
     * dan Riski Dwi Indah : 1900159*/
    private ArrayList<String> arrAksi = new ArrayList<>();
    private GameInfo objGameInfo;

    public GameInfo getObjGameInfo() {
        return objGameInfo;
    }

    public void setObjGameInfo(GameInfo objGameInfo) {
        this.objGameInfo = objGameInfo;
    }

    //contructor
    public Pintu(){
        //init pilihan
        arrAksi.add("Deskripsikan Pintu");
        arrAksi.add("Coba buka pintu");
    }

    public void prosesAksi( int subPil){
        //1: deskripsikan
        //2. buka pintu
        //aksi pada pintu dapat menggunakan inheritance tanpa perlu menggunakan if sehingga terdapat aksi terhadap pintu tersebut
        if (subPil == 1){
            System.out.println("Pintu berwarna merah dengan tulisan 'Exit' di atas");
        }else if (subPil == 2) {
            //cek apakah mempunyai kunci
            if (objGameInfo.getObjPlayer().cariItem("Kunci")) {
                //kunci ada pintu terbuka
                System.out.println("Player menggunakan kunci untuk membuka pintu dan pintu terbuka!");
                objGameInfo.setGameOver(true);
            } else {
                //kunci tidak ada
                System.out.println("Player mencoba membuka pintu. TERKUNCI!");
            }
        }
    }
}
