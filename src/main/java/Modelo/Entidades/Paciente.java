package Modelo.Entidades;

/*Paciente hereda de Persona*/

public class Paciente {
    private String Ocupacion;
    private String Profesion;
    private String TelefonoRelacionado;
    private float Peso;
    private float Talla;
    private float IMC; /*Se me olvidó quitar esto del diagrama de clases*/
    private float TensionMax; /*Esto aparece como short en el diagrama de clases y no debería ser así x_x*/
    private float TensionMin; /*Esto aparece como short en el diagrama de clases y no debería ser así x_x*/
    private short Pulso;
    
    public void setOcupacion(String ocupacion){
        Ocupacion=ocupacion;
    }
    
    public String getOcupacion(){
        return Ocupacion;
    }
    
    public void setProfesion(String profesion){
        Profesion=profesion;
    }
    
    public String getProfesion(){
        return Profesion;
    }
    
    public void setTelefonoRelacion(String tlf){
        TelefonoRelacionado=tlf;
    }
    
    public String getTelefonoRelacion(){
        return TelefonoRelacionado;
    }

    public void setPeso(float peso){
        Peso=peso;
    }
    
    public float getPeso(){
        return Peso;
    }
    
    public void setTalla(float talla){
        Talla=talla;
    }
    
    public float getTalla(){
        return Talla;
    }
    
    public void setTensionMax(float tmax){
        TensionMax=tmax;
    }
    
    public  float getTensionMax(){
        return TensionMax;
    }
    
    public void setTensionMin(float tmin){
        TensionMin=tmin;
    }
    
    public float getTensionMin(){
        return TensionMin;
    }
    
    public void setPulso(short pulso){
        Pulso=pulso;
    }
    
    public short getPulso(){
        return Pulso;
    }
}