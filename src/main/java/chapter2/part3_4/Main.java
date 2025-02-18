package chapter2.part3_4;

import chapter2.part3_4.config.SequenceConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context =
				new AnnotationConfigApplicationContext(SequenceConfiguration.class);

		SequenceGenerator generator =
				context.getBean(SequenceGenerator.class);

		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
	}
}

