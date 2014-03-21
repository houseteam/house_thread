

public class TwoThreadTest {
	public TwoThreadTest()
	{
		new SimpleThread("thread1").start();
		new SimpleThread("thread2").start();
		
	}

}
