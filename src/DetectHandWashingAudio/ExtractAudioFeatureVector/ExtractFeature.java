package DetectHandWashingAudio.ExtractAudioFeatureVector;

import java.io.IOException;
import DetectHandWashingAudio.ExtractAudioFeatureVector.Librosa.SpectralFeature;

public class ExtractFeature {

    private static final double SAMPLE_DURATION_MS = 2;
    private static final int SAMPLE_RATE = 44100;
    private static final int RECORDING_LENGTH = (int) (SAMPLE_RATE * SAMPLE_DURATION_MS);

    public static double[] extractFeatureTest(byte[] audioBytes) throws IOException {

        short[] inputBuffer = new short[RECORDING_LENGTH];
        double[] doubleInputBuffer = new double[RECORDING_LENGTH];
        long[] outputScores = new long[157];

        // try {
        //    int maxLength = audioBytes.length;
        //   System.arraycopy(audioBytes, 0, inputBuffer, 0, maxLength);
        // } finally {

        //}

        // We need to feed in float values between -1.0 and 1.0, so divide the
        // signed 16-bit inputs.
        for (int i = 0; i < RECORDING_LENGTH; i++) {
            inputBuffer[i] = (short)audioBytes[i];
            doubleInputBuffer[i] = (double)inputBuffer[i]/32767.0;
            //doubleInputBuffer[i] = (double)inputBuffer[i]/ 32767.0;
        }
        //System.out.println(doubleInputBuffer.length);
        //MFCC java library.
        SpectralFeature mfccConvert = new SpectralFeature();
        double[] mfccInput = mfccConvert.mfcc_coeffs(doubleInputBuffer);
        //System.out.println(mfccInput.length + " size of mfcc mfcc is " + Arrays.toString(mfccInput));
        int len1 = mfccInput.length;
        double[] specCent = mfccConvert.spectralCentroid(doubleInputBuffer);
        //System.out.println(specCent.length+" spec cent is "+ Arrays.toString(specCent));
        int len2 = specCent.length;
        double[] featureVector = new double[mfccInput.length+specCent.length];
        System.arraycopy(mfccInput, 0, featureVector, 0, len1);
        System.arraycopy(specCent, 0, featureVector, len1, len2);
        //System.out.println(featureVector.length+" of feture vector size is "+Arrays.toString(featureVector));

        //System.out.println("MFCC Input======> " + Arrays.toString(mfccInput).replace("[","").replace("]",""));

        return featureVector;
        //for(int i = 0; i<mfccInput.length ; i++){
        //   System.out.println("i is " + i+" array value is "+mfccInput[i]);
        //}
        //System.out.println("MFCC Input======> " + Arrays.toString(mfccInput));
    }
}
