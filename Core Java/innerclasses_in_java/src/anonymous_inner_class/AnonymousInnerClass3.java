package anonymous_inner_class;

public class AnonymousInnerClass3 {
	public static void main(String[] args) {
		Thread th = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println("Child Thread");
				}
			}
		});
		th.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
	}
}	