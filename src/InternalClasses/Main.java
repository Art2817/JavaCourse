package InternalClasses;

public class Main implements Printer {
    public static class Message {
        private String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }


        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }

    @Override
    public void print(Message message) {
        if ((message.getText() == null || message.getText().isEmpty()) &&
                (message.getSender() == null || message.getSender().isEmpty())) {
            Printer printer = new Printer() {
                @Override
                public void print(Message msg) {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного " +
                            "користувача...");
                }
            };

            printer.print(message);

        } else if (message.getSender() == null || message.getSender().isEmpty()) {
            System.out.println("Анонімний користувач відправив повідомлення: " + message.getText());
        } else {
            System.out.println("Користувач " + message.getSender() + " відправив повідомлення: "
                    + message.getText());
        }
    }


    // test
    public static void main(String[] args) {
        Main printer = new Main();

        Message msg1 = new Message("hello", "Artem");
        Message msg2 = new Message("test", null);
        Message msg3 = new Message(null, null);

        printer.print(msg1);
        printer.print(msg2);
        printer.print(msg3);
    }

}