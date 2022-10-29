public class Test_6_1 {
    public static void main(String[] args) {
        TcpConnection tcpConnection = new TcpConnection();
        tcpConnection.setStateClosed();
        tcpConnection.request();
        tcpConnection.setStateEstablished();
        tcpConnection.request();
        tcpConnection.setStateListening();
        tcpConnection.request();
        tcpConnection.setStateClosed();
        tcpConnection.request();
    }
}
