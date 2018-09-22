package Car;

import java.util.*;
import javax.swing.JOptionPane;

public class Car {
	public String name;
	public int tank;
	public int consumption;
	
	public String getName() 		//得到name返回值
	{		
		return name;
	}
	public void setName(String name) 		//初始化name
	{		
		this.name=name;
	}
	
	
	public int getTank() 		//得到tank返回值
	{			
		return tank;
	}
	public void setTank(int tank)		//初始化tank
	{
		this.tank=tank;
	}
	
	public int getConsumption()			//得到consumption返回值
	{
		return consumption;
	}
	public void setConsumption(int consumption)			//初始化consumption
	{
		this.consumption=consumption;
	}
	
	public void run()			//行为函数run
	{
		System.out.println("也能跑。");
	}
	public void gas()			//行为函数gas
	{
		System.out.print("加油，");
	}
	
	public static void main(String[] args)
	{
		Car a=new Car();		//创建Car类对象a
		a.setName("aaa");
		a.setTank(1);
		a.setConsumption(1);
		Car a2=new Car();		//创建Car类对象a2
		a2.setName("bbb");
		a2.setTank(2);
		a2.setConsumption(2);
		Car a3=new Car();		//创建Car类对象a3
		a3.setName("ccc");
		a3.setTank(3);
		a3.setConsumption(3);
		Car a4=new Car();		//创建Car类对象a4
		a4.setName("ddd");
		a4.setTank(4);
		a4.setConsumption(4);
		Car a5=new Car();		//创建Car类对象a5
		a5.setName("eee");
		a5.setTank(5);
		a5.setConsumption(5);
		
		Car[] A={a,a2,a3,a4,a5};		//用类类型数组A存储以上对象
		
		for(int i=0;i<A.length;i++)		//输出每种汽车的属性值
		{
			System.out.println(i+1+"、车型为："+A[i].getName()+" 装油量为："+A[i].getTank()+"L "+"耗油为："+A[i].getConsumption()+"L/100km");
		}
		
		System.out.print("以上汽车还能");
			a.gas();
			a.run();
			@SuppressWarnings("resource")
			Scanner scan=new Scanner(System.in);
		System.out.println("请输入你需要的汽车编号：");
		
		int j=0;				//以j为标志，若输入有误重新输入
		while(j==0) 
		{
			try {				//若输入的编号不在范围内则抛出异常
				int i=scan.nextInt();			//获得输入值
				System.out.println("您以选择车型为："+A[i-1].name+" 装油量为 "+A[i-1].tank+"L "+"耗油为"+A[i-1].consumption+"L/100km"+"的车，祝您开车顺利！！！");
				j=1;		//若输入正确，则输出并结束循环
				}
			catch(Exception e) 
			{
				JOptionPane.showMessageDialog( null,"请输入1到5的整数值！");
			}   
		}
	}
}

