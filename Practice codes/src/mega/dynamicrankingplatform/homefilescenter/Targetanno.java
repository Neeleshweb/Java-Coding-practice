package mega.dynamicrankingplatform.homefilescenter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Targetanno {
	
@Target ({ElementType.METHOD,ElementType.TYPE})	
	@Retention(RetentionPolicy.RUNTIME)
	public @interface  Targetdem {
	
}
}
