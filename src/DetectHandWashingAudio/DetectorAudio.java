package DetectHandWashingAudio;


import DetectHandWashingAudio.Classify.*;
import DetectHandWashingAudio.ExtractAudioFeatureVector.ExtractFeature;

import java.io.IOException;


public class DetectorAudio {

    public static int detectWashing(byte[] audio) throws IOException {

        double[] features = ExtractFeature.extractFeatureTest(audio);
        // Prediction:
        int prediction = RandomForestClassifier.predict(features);
        System.out.println(prediction);
        return prediction;
    }
}
