package dp.adapter;

class Radio {
    void playMusic(USASocket usaSocket) {
        usaSocket.providePower();
        System.out.println("bam-bam-bam...");
    }
}