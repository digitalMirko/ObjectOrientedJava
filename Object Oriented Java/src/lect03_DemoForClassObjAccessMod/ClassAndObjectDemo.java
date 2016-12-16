package lect03_DemoForClassObjAccessMod;
// File Name	: ClassAndObjectDemo.java
// Purpose		: To demonstrate class, object creation, access modifier and accessing of class member/methods
// Organization	: DigitalMirko
// Author		: Mirko L. Cukich
// Date			: 15 December 2016

class ComputerSystem 
{
	private String name;
	public int processor;
	
	public void setName(String sysName)
	{
		name = sysName;
	}
	
	public String GetName()
	{
		return name;
	}
	
	public void StartSystem()
	{
		// Write code to start the system
	}
	
	public void Start()
	{
		System.out.println("Starting System...");
		StartSystem();
	}
}

public class ClassAndObjectDemo 
{
	public static void main(String[] args) {
		
		ComputerSystem sysObj = new ComputerSystem();
		
		sysObj.setName("Unisys1001");
		sysObj.processor = 4;
		System.out.println("Name = " + sysObj.GetName() + ", Processor = " + sysObj.processor);
		
		sysObj.Start();
	}
}
