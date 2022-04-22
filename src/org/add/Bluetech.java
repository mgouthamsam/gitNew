package org.add;

public class Bluetech extends GreensTech{
	private void blueomr(String road, float distence,int min ) {
	System.out.println("road name " + road);
	System.out.println("road distence " + distence);
	System.out.println("total time" + min);
	
	}
	@Override
	public void reensOmr(String order, String type, String name) {
	System.out.println("Greens Place " + order);

}
	public static void main(String[] args) {
		Bluetech b=new Bluetech();
		b.blueomr("omr road", 656.65f, 4458);
		b.reensOmr("2nd", "fload", "beach");
	}
}