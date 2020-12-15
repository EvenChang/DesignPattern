package AdapterPattern;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String name) {

        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name " + name);

        } else if (audioType.equalsIgnoreCase("vlc") ||
                audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, name);

        } else {
            System.out.println("Invalid Media " + audioType + "format not supported");
        }
    }
}
