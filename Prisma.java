public class Prisma{
	private float altura;
	private float largo;
	private float ancho;

	public float getal(){
		return altura;
	}
	public void setal(float a){
		if(a>0){
			altura=a;
		}
	}

	public float getlar(){
		return largo;
	}
	public void setlar(float l){
		if(l>0){
			largo=l;
		}
	}

	public float getan(){
		return ancho;
	}
	public void setan(float an){
		if(an>0){
			ancho=an;
		}
	}
	public float areaSuperficial(){
		float areaLados=(2*(largo)+2*(ancho))*altura;
		float areaTapas=2*(ancho)*largo;
		floar areaT=areaTapas+areaLados;
		return area;
	}
	public float volumen(){
		float vol=ancho*largo*altura;
		return vol;
	}

}