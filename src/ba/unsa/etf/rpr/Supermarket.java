package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli = new Artikl[1000];
    private int vel = 0;

    public void dodajArtikl(Artikl a){
        artikli[vel] = a;
        vel = vel + 1;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }
    public Artikl izbaciArtiklSaKodom(String kod){
        for(int i=0; i < vel; i++){
            int temp = Integer.parseInt(artikli[i].getKod());
            if(temp == Integer.parseInt(kod)){
                Artikl zaVracanje = artikli[i];
                artikli[i] = null;
                System.arraycopy(artikli, i+1, artikli, i, vel - i);
                vel = vel - 1;
            }
        }
        return null;
    }

    public int getVel() {
        return vel;
    }
}
