import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.model.Vehicle;


public class Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Vehicle vehicle = (Vehicle)applicationContext.getBean("vehicle");
		vehicle.checkCarName();
		((ConfigurableApplicationContext)applicationContext).close();
	}

}
