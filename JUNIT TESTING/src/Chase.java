
public class Chase implements MyInterface {

	public float RateOfInterest() {
		// TODO Auto-generated method stub
		return  2.75f;
	}

	public float Interest() {
		// TODO Auto-generated method stub
		int years = 10;
		int pamount = 10000;
		float roi = RateOfInterest();
		float SI =(pamount * years * roi)/100; 
		return SI;
	}
}
