
public class Main {

	public static void main(String[] args) {
		RingBuffer Buf=new RingBuffer(10);
		Thread reading = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (this) {
				int now=0;
				for (int i = 0; i < 20; i++) {
					try {
						Thread.sleep(100); //0.2초마다 한번씩읽음
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				Buf.read(now);
				now++;
		}
	}
		System.out.println("처리끝");
	}});
	Thread generator = new Thread(new Runnable() {
		@Override
	public void run() {
		synchronized (this) {
		int value=1;
	for(int i=0;i<20;i++){
		try {
			Thread.sleep(30); //0.1초마다한번씩읽음
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Buf.write(value);
		value++;
	}
	System.out.println("발생끝");
}
}});
	generator.start();//데이터 발생기//thread
 	reading.start(); //링버퍼 처리기 //thread읽기시작
    }
}

