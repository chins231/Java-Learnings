package Inheritance;

public class TEST {

	public static void main(String[] args) {
		BMW bmw= new BMW();
		bmw.start();
		bmw.theftSafety();
		bmw.refuel();
		bmw.stop();
		bmw.engine();
		//complie time polymorphism or static  
		
		System.out.println("====================");
		Car car=new Car();
		car.start();
		car.stop();
		car.engine();
		
		System.out.println("========  ===========");
		Car car1 =new BMW();//dynamic polymorphism or run time polymorphism
		car1.start();
		car1.stop();
		car1.refuel();
		car1.engine();
		
		System.out.println("====================");
		Vehicle veh=new Vehicle();
		veh.engine();
		
		
		System.out.println("====================");
		
		Car  car2= (BMW) new Car();
		//car2.theftSafety();
		car2.start();
		
		//top casting means dynamic 
	}

}
