package di.practice;

import org.springframework.stereotype.Component;

@Component
public class abcSpeaker implements Speaker{

	@Override
	public String getSpeakerBrand() {
		// TODO Auto-generated method stub
		return "abc Speaker";
	}


}
