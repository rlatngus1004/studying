package shapter06;

public class MainCar {
	public static void main(String[] args) {
		Car myCar = new ConvertableCar();
		myCar.forward(); 
		myCar.backward();
		ConvertableCar myCar1 = (ConvertableCar) myCar;
		myCar1.open();
		///////////////////////////////////////////
		Car yourCar = new SUVCar();
		yourCar.forward(); //SUV가 실행 
		yourCar.backward();
		SUVCar hisCar = (SUVCar) yourCar;
		hisCar.backward();
		//////////////////////////////////////////
		System.out.println("----------------------");
		Car aCar = new SUVCar();
		boolean result = aCar instanceof SUVCar; 
		System.out.println("aCardlstmxjstmsms \n"
				+ "SUVCar 참조타입의 참조변수에\n"
				+"담을 수 있는가? : " +result);
		SUVCar bcar = (SUVCar) aCar;
		System.out.println("----------------------");
		Car cCar = new Car();
		boolean result2 = cCar instanceof SUVCar; 
		System.out.println("aCardlstmxjstmsms \n"
				+ "SUVCar 참조타입의 참조변수에\n"
				+"담을 수 있는가? : " +result2);
		SUVCar dCar = (SUVCar) cCar;
	}


}
