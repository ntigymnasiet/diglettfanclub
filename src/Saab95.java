import javafx.scene.paint.Color;

public class Saab95 extends car{

	private boolean turboOn;

	public Saab95() {
		color = Color.BLACK;
		enginePower = 125;
		turboOn = false;
		modelName = "Saab95";
		stopEngine();
	}

	public void setTurboOn() {
		turboOn = true;
	}

	public void setTurboOff() {
		turboOn = false;
	}

	public double speedFactor() {
		double turbo = 1;
		if (turboOn)
			turbo = 1.3;
		return enginePower * 0.01 * turbo;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnRight() {
		// TODO Auto-generated method stub
		
	}


	
}