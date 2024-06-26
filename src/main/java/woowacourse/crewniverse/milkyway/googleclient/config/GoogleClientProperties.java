package woowacourse.crewniverse.milkyway.googleclient.config;

import java.time.Duration;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "google-client")
public class GoogleClientProperties {
    private final String applicationName;
    private final Duration readTimeout;
    private final Duration connectionTimeout;

    public GoogleClientProperties(final String applicationName,
                                  final Duration readTimeout,
                                  final Duration connectionTimeout) {
        this.applicationName = applicationName;
        this.readTimeout = readTimeout;
        this.connectionTimeout = connectionTimeout;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public int getReadTimeoutInMillis() {
        return (int) readTimeout.toMillis();
    }

    public int getConnectionTimeoutInMillis() {
        return (int) connectionTimeout.toMillis();
    }
}
