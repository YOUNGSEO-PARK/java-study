package prob2;

public class SmartPhone extends MusicPhone {
	
	@Override
	public void execute( String function ) {
		if ( function.equals("앱") ) {
			startApp();
			return;
		}
		
		super.execute( function );
	}
	
	private void startApp() {
		System.out.println("앱실행");
	}
	
	protected void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}
}
