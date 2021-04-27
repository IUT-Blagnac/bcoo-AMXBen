public class Artisan{
    private String idSIRET;
    private String nomArt;
    private String adresseArt;
    private String tphArt;

    private Qualification QualifArt;
    private ArrayList<Realiser> RealsArt;

    public static getPayeArtisan(Chantier pfChantier){
        double paye=null;
        for(int y=0; y < this.RealsArt.size();y++){
            if (this.RealsArt.get(y).getChantier().getIdChantier()==pfChantier.getIdChantier()){
                paye+=this.QualifArt.getTauxHoraire()*this.RealsArt.get(y).getDureeReal()
            }
        }
        return paye;
    }
}