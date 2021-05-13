public class contador {

    int inicio;
    int incremento;
    int fiinal;

    public contador(int inicio, int incremento, int fiinal) {
        this.inicio = inicio;
        this.incremento = incremento;
        this.fiinal = fiinal;
    }

    //#region getters and setters

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getIncremento() {
        return incremento;
    }

    public void setIncremento(int incremento) {
        this.incremento = incremento;
    }

    public int getFiinal() {
        return fiinal;
    }

    public void setFiinal(int fiinal) {
        this.fiinal = fiinal;
    }
    
    //#endregion getters and setters
}
