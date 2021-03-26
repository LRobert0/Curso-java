

/**
 *
 * @author samyontiveros
 */

public class Calculadora {
    //atributos
    private final String nombre;
    
    private final Tipo tipocalculadora;

    //constructor
    public Calculadora( String nombreCalculadora , Tipo tipoCalculadora){

        nombre = nombreCalculadora;

        tipocalculadora = tipoCalculadora;

    }
    //metodos o acciones que realiza la clase
    public String getNombre (){
        return nombre;
    }

    public float suma(float var1 , float var2 ){

        return var1+var2;
    }

    
    public float resta(float var1 , float var2 ){

        return var1-var2;
    }

    
    public float multiplicacion(float var1 , float var2 ){

        return var1*var2;
    }
    
    public float division (float var1 , float var2 ){

        return this.multiplicacion(var1, 1/var2);
    }

    public double potencia (float var1 , float var2){
        return Math.pow(var1,var2);
    }

    public double raizDe(float var1 , float var2){
        return Math.pow(var1,1/var2);
    }

}
