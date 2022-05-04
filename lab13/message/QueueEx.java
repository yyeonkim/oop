package message;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<Message>();

        messageQueue.offer(new Message("sendMail", "Ewha Kim"));
        messageQueue.offer(new Message("sendSMS", "BTS"));
        messageQueue.offer(new Message("sendKakaotalk", "IU"));

        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            switch (message.commnad) {
                case "sendMail":
                    System.out.println("Complete to " + message.commnad + " to " + message.to);
                    break;
                case "sendSMS":
                    System.out.println("Complete to " + message.commnad + " to " + message.to);
                    break;
                case "sendKakaotalk":
                    System.out.println("Complete to " + message.commnad + " to " + message.to);
                    break;
            }
        }
    }
}
