package Games.Poker.Kafka.console;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaMessageListener {

    @KafkaListener(topics = "poker")
    public void listen(String message) {
        log.info("Received message: " + message);
    }
}