package ShengChanXiaoFei;

public class Cousrtem implements Runnable{
	//消费者
	private Storage storage;
	private int number;
	public Cousrtem(Storage storage,int number){
		this.storage = storage;
		this.number = number;
	}
	
	
	public void run(){
		while(true){
			try {
				Thread.sleep(2000);//睡眠两秒
			} catch (InterruptedException e) {
	
				e.printStackTrace();
			}
			storage.pop(number);
		}
		
	}

}
