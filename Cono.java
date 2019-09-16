public class Cono{
	final float PI=3.1416f;
	private int altura;
	private int radio;

	public void setAltura(int altura){
		this.altura=altura;
	}

	public int getAltura(){
		return altura;
	}

	public void setRadio(int radio){
		this.radio=radio;
	}

	public int getRadio(){
		return radio;
	}

	public double crearGeneratriz(int h, int r){
		return Math.sqrt(Math.pow(h, 2)+Math.pow(r, 2));
	}

	public float sacarArea(int r, int g){
		return PI*r*(g+r);
	}

	public double sacarVolumen(int r, int h){
		return (PI*Math.pow(r, 2)*h)/3;
	}

}