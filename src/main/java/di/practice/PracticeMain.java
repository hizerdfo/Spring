package di.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		TV tv = context.getBean("samsung",TV.class);
		Speaker abcSpeaker = context.getBean("abcSpeaker", Speaker.class);

		System.out.println("TV 브랜드: " + tv.getTVBrand());
		System.out.println("스피커 브랜드: " + abcSpeaker.getSpeakerBrand());

		tv.volumedown();
		tv.volumeup();
		tv.turnon();
		tv.turnoff();
	}

}
