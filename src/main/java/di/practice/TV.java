package di.practice;

import org.springframework.stereotype.Component;

@Component
public interface TV {
	String getTVBrand();
	
	void turnon();
	void turnoff();
	void volumeup();
	void volumedown();

}
