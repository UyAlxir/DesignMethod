public class TcpConnection {
    private State state;
    public TcpConnection(){}
    public void setStateEstablished(){
        state = Established.getInstance();
    }
    public void setStateListening(){
        state = Listening.getInstance();
    }
    public void setStateClosed(){
        state = Closed.getInstance();
    }
    public void request(){
        state.request();
    }
}
