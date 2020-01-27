package dp.command;

public class Command {
    public static void main(String[] args) {
        MusicPlayerCommand command = new MusicPlayerCommand(new MusicPlayer());
        LightCommand command1 = new LightCommand(new Light());
        Button button = new Button(command1);
        button.press();
    }

    static class Light {
        void getLight() {
            System.out.println("light...");
        }
    }

    static class MusicPlayer {
        void playMusic() {
            System.out.println("music playing...");
        }
    }

    static class Button {
        Commandd commandd;

        public Button(Commandd commandd) {
            this.commandd = commandd;
        }

        void press() {
            commandd.execute();
        }
    }

    interface Commandd {
        void execute();
    }

    static class LightCommand implements Commandd {
        Light light;

        public LightCommand(Light light) {
            this.light = light;
        }

        @Override
        public void execute() {
            light.getLight();
        }
    }

    static class MusicPlayerCommand implements Commandd {
        MusicPlayer musicPlayer;

        public MusicPlayerCommand(MusicPlayer musicPlayer) {
            this.musicPlayer = musicPlayer;
        }

        @Override
        public void execute() {
            musicPlayer.playMusic();
        }
    }

}
