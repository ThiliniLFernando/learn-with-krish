package org.thilini.rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Producer {
    private final static String EXCHANGE_NAME = "hello";
    private final static String EXCHANGE_TYPE = "fanout";
    public static void main(String[] argv){
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        try {
            Connection connection = factory.newConnection();
            Channel channel = connection.createChannel();

            // declaring exchange param1 = name of the exchange, param2 = type of the exchange
            channel.exchangeDeclare(EXCHANGE_NAME, EXCHANGE_TYPE);

            for(int i = 1; i<11; i++){
                String message = "Hello World! "+i;
                channel.basicPublish( EXCHANGE_NAME, "", null, message.getBytes("UTF-8"));
                System.out.println(" [x] Sent '" + message + "'");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (TimeoutException e) {
            throw new RuntimeException(e);
        }

    }
}

