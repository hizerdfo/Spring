package di.practice;

import org.springframework.stereotype.Component;

@Component("samsung")
public class SamsungTV implements TV, Speaker{
	private Speaker rightspaker;
	private Speaker leftspeaker;
	
	public Speaker getRightspaker() {
		return rightspaker;
	}

	public void setRightspaker(Speaker rightspaker) {
		this.rightspaker = rightspaker;
	}

	public Speaker getLeftspeaker() {
		return leftspeaker;
	}

	public void setLeftspeaker(Speaker leftspeaker) {
		this.leftspeaker = leftspeaker;
	}

	 @Override
	    public String getSpeakerBrand() {
	        if (rightspaker != null) {
	            return rightspaker.getSpeakerBrand();
	        } else if (leftspeaker != null) {
	            return leftspeaker.getSpeakerBrand();
	        } else {
	            return "speaker unknown";
	        }
	    }

	@Override
	public String getTVBrand() {
		// TODO Auto-generated method stub
		return "삼성 티비";
	}

	@Override
	public void turnon() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV on");
	}

	@Override
	public void turnoff() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV off");
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
	

}
