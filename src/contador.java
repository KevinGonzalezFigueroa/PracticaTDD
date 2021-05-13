public class contador {

    int inicio;
    int incremento;
    int fiinal;
    int ValorInicialDefecto = 0;
    int ValorIncrementalDefecto = 1;

    //#region constructores

    public contador(int inicio, int incremento, int fiinal) {
        this.inicio = inicio;
        this.incremento = incremento;
        this.fiinal = fiinal;
    }

    public contador(int fiinal) {
        this.inicio = ValorInicialDefecto;
        this.incremento = ValorIncrementalDefecto;
        this.fiinal = fiinal;
    }

    //#endregion

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

    //#region metodos
    
    public int aumentar() {
        int resultado = getInicio();
        resultado = resultado+getIncremento();
        if(resultado > getFiinal()){
            return resultado = getInicio();
        } else{
            return resultado;
        }   
    }

    //#endregion
}
