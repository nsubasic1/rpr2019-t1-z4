package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli = new Artikl[50];
    private int vel = 0;

    public boolean dodajArtikl(Artikl artikl){
        if (vel >= 50) return false;
        artikli[vel] = artikl;
        vel = vel + 1;
        return true;
    }

    public Artikl[] getArtikli(){
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

    public int dajUkupnuCijenuArtikala(){
        int ukupno = 0;
        for(int i = 0; i < vel; i++){
            ukupno = ukupno + artikli[i].getCijena();
        }
        return ukupno;
    }
}
