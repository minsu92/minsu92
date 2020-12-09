package test1.bread.product;

public class ButterBread extends Bread {
	public int flour;
	int water;
	int butter;
	public ButterBread(String breadType) {
		this.breadType = breadType;
	}
	
	public void setFlour(int flour) {
		this.flour = flour;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public void setButter(int butter) {
		this.butter = butter;
	}

	@Override
	public void recipe() {
		System.out.println("bradType : " + breadType);
		System.out.println("recipe");
		System.out.println("flour : " + flour );
		System.out.println("water : " + water );
		System.out.println("butter : " + butter );
	}

}
