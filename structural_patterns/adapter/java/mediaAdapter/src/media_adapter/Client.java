package src.media_adapter;

public class Client {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond_the_horizon.mp3"); // Playing MP3 file. Name: beyond_the_horizon.mp3
        audioPlayer.play("mp4", "alone.mp4"); // Playing MP4 file. Name: alone.mp4
        audioPlayer.play("vlc", "far_far_away.vlc"); // Playing VLC file. Name: far_far_away.vlc
        audioPlayer.play("avi", "mind_me.avi"); // Invalid media. avi format not supported
    }
}
