public class Test4 {
    public static void main(String[] args) {
        ConnectionFactory pop3ConnectionFactory = new POP3ConnectionFactory();
        ConnectionFactory imapConnectionFactory = new IMAPConnectionFactory();
        ConnectionFactory httpConnectionFactory = new HTTPConnectionFactory();
        Connection pop3Connection = pop3ConnectionFactory.buildConnection();
        Connection imapConnection = imapConnectionFactory.buildConnection();
        Connection httpConnection = httpConnectionFactory.buildConnection();
        pop3Connection.connect();
        imapConnection.connect();
        httpConnection.connect();
    }
}
