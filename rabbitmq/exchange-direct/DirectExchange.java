package org.thilini.rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class DirectExchange {
    private final static String EXCHANGE_NAME = "direct_logs";
    private final static String EXCHANGE_TYPE = "direct";
    public static void main(String[] argv){
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        try {
            Connection connection = factory.newConnection();
            Channel channel = connection.createChannel();

            // declaring exchange param1 = name of the exchange, param2 = type of the exchange
            channel.exchangeDeclare(EXCHANGE_NAME, EXCHANGE_TYPE);

            // routing keys
            String[] routingKeys = {"INFO","ERROR","WARN"};

            for(int i = 1; i<11; i++){
                String routingKey = routingKeys[i%3];
                String message = "["+routingKey+"] Hello World! "+i;
                channel.basicPublish( EXCHANGE_NAME, routingKey, null, message.getBytes("UTF-8"));
                System.out.println(" [x] Sent '" + message + "'");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (TimeoutException e) {
            throw new RuntimeException(e);
        }

    }
}

