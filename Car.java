package carmaker;
public class Car{
	public static final int MODEL_A=1;
	public static final int MODEL_B=2;
	public static final int MODEL_C=3;

	public static final int COLOR_BLUE=1;
        public static final int COLOR_RED=2;
        public static final int COLOR_GREEN=3;
        public static final int COLOR_WHITE=4;
        public static final int COLOR_BLACK=5;

        public static final int MAX_KM=500000;

	private int model;
	private int color;
	private int km;

	public Car(int model,int color, int km){
		this.model=model;
		this.color=color;
		this.km=km;
	}

	@Override
	public String toString(){
		return "\nModelo: "+this.model+"\nColor: "+this.color+
		"\nKilometros: "+this.km+"\n---------------------------";
	}
}












