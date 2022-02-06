package one.digitalinnovation;

public class Fila<T> {
    private No<T> refNoEntradaFila;

    public Fila(){
        this.refNoEntradaFila = null;
    }

    public void enqueue(T obj){
        No novoNo = new No(obj);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T first(){
        if(!this.isEmprty()){
            No primeiroNo = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    break;
                }
            }
            return (T)primeiroNo.getObjeto();
        }
        return null;
    }

    public T dequeue(){
        if(!this.isEmprty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T)primeiroNo.getObjeto();
        }
        return null;
    }

    public boolean isEmprty(){
        return refNoEntradaFila == null ? true: false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;
        if(refNoEntradaFila != null){
            while(true){
                stringRetorno += "[No{objeto=" + noAuxiliar.getObjeto() + "}]--->";
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        }else {
            stringRetorno = "null";
        }
        return stringRetorno;
    }
}
