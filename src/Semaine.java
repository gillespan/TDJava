public enum Semaine {
    LUNDI(false,"-("),
    MARDI(false,"-("),
    MERCREDI(false,"-("),
    JEUDI(false,"-("),
    VENDREDI(false,"-("),
    SAMEDI(true,"-)"),
    DIMANCHE(true,"-)");

    private boolean weekend;
    private String smiley;

    private Semaine( boolean week,String smiley)
    { weekend = week;
    this.smiley = smiley;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public String getSmiley() {
        return smiley;
    }
}
