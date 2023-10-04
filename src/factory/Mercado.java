package factory;

public class Mercado {
    public Fruta getFruta(String tipoFruta){
        if(tipoFruta == null){
            return null;
        }   
        if(tipoFruta.equalsIgnoreCase("Maca")){
            return new Maca();
        } else if(tipoFruta.equalsIgnoreCase("Banana")){
            return new Banana();
        }
        return null;
    }
}