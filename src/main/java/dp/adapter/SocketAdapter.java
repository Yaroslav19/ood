package dp.adapter;

class SocketAdapter implements USASocket {
    private EuroSocket euroSocket;

    public SocketAdapter(EuroSocket euroSocket) {
        this.euroSocket = euroSocket;
    }

    @Override
    public void providePower() {
        euroSocket.providePower();
    }
}