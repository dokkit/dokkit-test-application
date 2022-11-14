package dev.dokkit;

import dev.dokkit.DokkitTestApplicationApp;
import dev.dokkit.config.AsyncSyncConfiguration;
import dev.dokkit.config.EmbeddedKafka;
import dev.dokkit.config.EmbeddedMongo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { DokkitTestApplicationApp.class, AsyncSyncConfiguration.class })
@EmbeddedMongo
@EmbeddedKafka
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
