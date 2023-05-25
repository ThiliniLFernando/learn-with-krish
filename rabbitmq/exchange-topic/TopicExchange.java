package org.thilini.rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class TopicExchange {
    private final static String EXCHANGE_NAME = "topic_logs";
    private final static String EXCHANGE_TYPE = "topic";
    public static void main(String[] argv){
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        try {
            Connection connection = factory.newConnection();
            Channel channel = connection.createChannel();

            // declaring exchange param1 = name of the exchange, param2 = type of the exchange
            channel.exchangeDeclare(EXCHANGE_NAME, EXCHANGE_TYPE);

            // Routing Key
            // <speed>.<colour>.<species>

            /*
            * * (star) can substitute for exactly one word.
              # (hash) can substitute for zero or more words.
            */

            String message = "Hello Species! ";
            channel.basicPublish( EXCHANGE_NAME, "quick.orange.rabbit", null, message.getBytes("UTF-8"));
            channel.basicPublish( EXCHANGE_NAME, "lazy.orange.elephant", null, message.getBytes("UTF-8"));
            channel.basicPublish( EXCHANGE_NAME, "quick.orange.fox", null, message.getBytes("UTF-8"));
            channel.basicPublish( EXCHANGE_NAME, "lazy.brown.fox", null, message.getBytes("UTF-8"));
            channel.basicPublish( EXCHANGE_NAME, "lazy.pink.rabbit", null, message.getBytes("UTF-8"));
            channel.basicPublish( EXCHANGE_NAME, "quick.orange.new.rabbit", null, message.getBytes("UTF-8"));
            channel.basicPublish( EXCHANGE_NAME, "lazy.orange.new.rabbit", null, message.getBytes("UTF-8"));
            System.out.println(" [x] Sent '" + message + "'");


        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (TimeoutException e) {
            throw new RuntimeException(e);
        }

    }
}

