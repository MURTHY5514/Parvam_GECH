package anonymous_inner_class;

public class AnonymousClass2 {
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println("Child Thread");
				}
			}
		};
		Thread th = new Thread(r);
		th.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
	}

}
