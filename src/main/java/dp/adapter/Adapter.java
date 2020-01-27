package dp.adapter;

public class Adapter {
    public static void main(String[] args) {
        EuroSocket euroSocket = new EuroSocketImpl();
        USASocket socket = new SocketAdapter(euroSocket);
        Radio r = new Radio();
        r.playMusic(socket);
    }
}
