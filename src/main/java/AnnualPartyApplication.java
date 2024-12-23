import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@Import({
		// swagger config@local
		com.annualParty.api.config.SwaggerConfig.class,

		// jwt config@my-jwt
//		com.my.jwt.config.WebSecurityConfig.class,

		// config@my-db-service
//		com.my.db.config.EntityServiceConfig.class,

		//config@redis
		com.annualParty.redis.config.RedisConfig.class,
		com.annualParty.redis.config.RedisServiceConfig.class,
		com.annualParty.redis.config.RedisMessageConfig.class,
//
})

@ComponentScan(basePackages = {
		// controller@local
		"com.annualParty.api.controller",

		// controller aop@local
		"com.annualParty.api.aop",

		//Jwt@local
//		"com.my.jwt.service",

		// JWT@local
//		"com.my.jwt",

		// aop@my-db-service
//		"com.my.db.service.aop",
		// db access service@my-db-service
//		"com.my.db.service.provider",

		// redis service@my-redis-service
//		"com.my.redis.service.provider"
})

//@EnableJpaRepositories(
//		// repositiry@tom-db-service
//		"com.my.db.repository"
//)

//@EntityScan(basePackages = {
//		// entity@my-db-entity
//		"com.my.db.entity",
//})

@SpringBootApplication
public class AnnualPartyApplication {
	public static void main(String[] args) {
		SpringApplication.run(AnnualPartyApplication.class, args);
	}
}


