
package esfera;

public class Esfera {

    final float PI =3.1416f;
    private float radio;
    
    public float getRadio(){
	return radio;
    }

    public void setRadio(int radio){
	if(radio>0){
		this.radio=radio;
                System.out.println("radio: "+this.radio);
	}
        else{
            System.out.println("Radio invalido");
        }
    }
    
    public float obtenerAreaSuperficial(){
        float areaSuperficial = (float)(4*PI*Math.pow(radio, 2));
        return areaSuperficial;
    }
    
    public float obtenerVolumen(){
        float volumen = (float) (4*PI*Math.pow(radio, 3))/3;
        return volumen;
    }
    
}