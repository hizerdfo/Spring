package di.practice;

import org.springframework.stereotype.Component;

@Component("lg")
public class LGTV implements TV, Speaker{
	private Speaker rightspaker;
	private Speaker leftspeaker;
	
	public LGTV() {
		
	}
	
	@Override
	public String getSpeakerBrand() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String getTVBrand() {
		// TODO Auto-generated method stub
		return "LG 티비";
	}

	@Override
	public void turnon() {
		// TODO Auto-generated method stub
		System.out.println("LG tv on");
		
	}

	@Override
	public void turnoff() {
		// TODO Auto-generated method stub
		System.out.println("LG tv off");
	}

	@Override
	public void volumeup() {
		// TODO Auto-generated method stub
		System.out.println("Speaker volume up");
	}

	@Override
	public void volumedown() {
		// TODO Auto-generated method stub
		System.out.println("Speaker volume down");
	}

	public Speaker getLeftspeaker() {
		return leftspeaker;
	}

	public void setLeftspeaker(Speaker leftspeaker) {
		this.leftspeaker = leftspeaker;
	}

	public Speaker getRightspaker() {
		return rightspaker;
	}

	public void setRightspaker(Speaker rightspaker) {
		this.rightspaker = rightspaker;
	}
	
	
}
