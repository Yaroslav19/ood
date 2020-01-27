package dp.chain_of_resp;

public class ChainOfResponsibility {
    public static void main(String[] args) {
        MessageHandler mh = new MessageVerifier(new MessageExclaimer(new MessagePrinter(null)));
        mh.handle("Aim this");
    }

    static abstract class MessageHandler {
        public MessageHandler messageHandler;

        public MessageHandler(MessageHandler messageHandler) {
            this.messageHandler = messageHandler;
        }

        abstract void handle(String msg);
    }

    static class MessagePrinter extends MessageHandler {
        public MessagePrinter(MessageHandler messageHandler) {
            super(messageHandler);
        }

        @Override
        void handle(String msg) {
            System.out.println(msg);
        }
    }

    static class MessageVerifier extends MessageHandler {
        public MessageVerifier(MessageHandler messageHandler) {
            super(messageHandler);
        }

        @Override
        void handle(String msg) {
            if (msg.matches(".*\\d.*"))
                messageHandler.handle(msg);
        }
    }

    static class MessageExclaimer extends MessageHandler {
        public MessageExclaimer(MessageHandler messageHandler) {
            super(messageHandler);
        }

        @Override
        void handle(String msg) {
            messageHandler.handle(msg + "!");
        }
    }
}
