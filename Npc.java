import java.util.ArrayList;
/*Oleh Mutiara Rahmani : 1900432
 * dan Riski Dwi Indah : 1900159*/
public class Npc extends Player{//pada class Npc ini merupakan turunan dari class Player dengan menmbahkan keyword extends
    //kunci dipindahkan dari ruangan
    private Item  objKunci;
    private ArrayList<String> arrAksi = new ArrayList<>();
    private boolean isKenal = false;

    public ArrayList<String> getAksi() { return arrAksi; }

    public Npc() {
        //init kunci
        objKunci = new Item("Kunci");
        objKunci.setDeskripsi("Sebuah kunci kecil yang sudah agak berkarat");

        //aksi npc
        arrAksi.add("Perkenalan dgn NPC");
        arrAksi.add("Minta kunci");

    }
    @Override
    public void printItem() {//method turunan dari class Player yang akan menampilkan output item-item dari game yang masih dipegang Npc
        System.out.println("Daftar Item yang akan didapat:");
        int cc = 0;
        for (Item objItem:arrItem) {
            cc++;
            System.out.printf("%d. %s%n",cc,objItem.getNama());
            System.out.println(objItem.getDeskripsi());
        }
    }*/
    @Override
    public void printNpc() { //metode turunan dari class Player yang akan menghasilkan tampilan sebagai perkealan dari NPC
        System.out.println("Halo saya penjaga pintu ini");
        System.out.println("Namaku "+getNama());
        isKenal = true;
    }

    public void prosesAksi(int subPil) {//method void prosesAksi merupakan method tambahan dari class Npc bukan turunan dari class Player
        Npc npc = new Npc();            //aksinya yaitu berupa pilihan menu, apabila memilih menu No.1 maka akan keluar perkenalan dari Npc. Namun apabila memilih menu No.2 maka player aan mendapatkan item dari Npc
        //1: perkenalan dengan npc
        //2: buka pintu
        //dijadikan inheritance dengan menghilangkan if
        if (subPil == 1) {
            npc.printNpc();
        } else if (subPil == 2) {
            if (isKenal) {
                //berikan kunci pada player
                if (objKunci==null) {
                    System.out.println("Masa lupa, kunci kan sudah saya berikan!");
                } else {
                    System.out.println("Kunci diberikan pada player");
                    GameInfo.getObjPlayer().addItem(objKunci);     //tambahkan  objek ini pada player
                    objKunci = null;
                }
            } else {
                System.out.println("Siapa anda? kenalan dulu dong");
            }
        }
    }
}
