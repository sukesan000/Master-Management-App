package com.example.geminiapi.config;

import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configurationと記述したクラス内のメソッドに@Beanを記述することで@Beanを定義することができる
//任意のクラスで@Autowiredで注入することで定義したBeanを使うことができる
@Configuration
public class FlywayConfig {
	@Bean
	public FlywayMigrationStrategy strategy() {
		return flyway -> {
			//flyway_schema_historyの初期化
			flyway.clean();
			//マイグレーションの実行
			flyway.migrate();
		};
	}
}
