package a;

public class Demo1 {
	public static void main(String[] args) {

		Machine m = null;
		m = new MachineEng();
		m.sayHi();
		m = new MachineHeb();
		m.sayHi();
		
	}
}

abstract class Machine {
	public abstract void sayHi();
}

class MachineEng extends Machine{

	@Override
	public void sayHi() {
		System.out.println("Hi");
	}
}

class MachineHeb extends Machine{

	@Override
	public void sayHi() {
		System.out.println("ωμεν");
	}
}
