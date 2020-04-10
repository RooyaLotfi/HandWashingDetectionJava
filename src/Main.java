import DetectHandWashingAudio.*;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.*;
import java.util.Arrays;
import java.io.File;

public class Main {

    private static final double SAMPLE_DURATION_MS = 2;
    private static final int SAMPLE_RATE = 44100;
    private static final int RECORDING_LENGTH = (int) (SAMPLE_RATE * SAMPLE_DURATION_MS);

    public static void main(String[] args) throws IOException, UnsupportedAudioFileException {
        System.out.println("Hello World!");
        File test = new File("...");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(test);
        int bytesPerFrame = 2;
        int numBytes = (int) (SAMPLE_RATE * bytesPerFrame * SAMPLE_DURATION_MS);
        byte[] audioBytes = new byte[numBytes];
        audioInputStream.read(audioBytes,0,audioBytes.length);

        int isWashing = DetectorAudio.detectWashing(audioBytes);

        if(isWashing == 1)
            System.out.println("washing");
        else
            System.out.println("not washing");
    }
}
