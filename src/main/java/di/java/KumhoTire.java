package di.java;

import org.springframework.stereotype.Component;

@Component
public class KumhoTire implements Tire {

	@Override
	public String getTireBrand() {
		// TODO Auto-generated method stub
		return "금호 타이어";
	}

}
