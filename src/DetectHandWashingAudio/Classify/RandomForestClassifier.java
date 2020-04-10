package DetectHandWashingAudio.Classify;

public class RandomForestClassifier {
    public static int predict_0(double[] features) {
        int[] classes = new int[2];

        if (features[2] <= 16.135101795196533) {
            if (features[3] <= 11.039525985717773) {
                if (features[21] <= -0.040453079622238874) {
                    classes[0] = 2;
                    classes[1] = 0;
                } else {
                    classes[0] = 0;
                    classes[1] = 23;
                }
            } else {
                if (features[58] <= -0.0026094739441759884) {
                    classes[0] = 0;
                    classes[1] = 2;
                } else {
                    classes[0] = 7;
                    classes[1] = 0;
                }
            }
        } else {
            if (features[51] <= 0.0023154686205089092) {
                classes[0] = 10;
                classes[1] = 0;
            } else {
                classes[0] = 0;
                classes[1] = 1;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_1(double[] features) {
        int[] classes = new int[2];

        if (features[34] <= -0.003177751670591533) {
            classes[0] = 7;
            classes[1] = 0;
        } else {
            if (features[24] <= 0.001049403683282435) {
                if (features[33] <= 0.0010218216048087925) {
                    if (features[28] <= -0.0016477773897349834) {
                        classes[0] = 1;
                        classes[1] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 24;
                    }
                } else {
                    if (features[33] <= 0.001967118412721902) {
                        classes[0] = 3;
                        classes[1] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 1;
                    }
                }
            } else {
                if (features[1] <= 31.081016540527344) {
                    if (features[20] <= 0.001217114768223837) {
                        classes[0] = 0;
                        classes[1] = 3;
                    } else {
                        classes[0] = 1;
                        classes[1] = 0;
                    }
                } else {
                    classes[0] = 5;
                    classes[1] = 0;
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_2(double[] features) {
        int[] classes = new int[2];

        if (features[23] <= 0.0018146043294109404) {
            if (features[2] <= 20.985400199890137) {
                if (features[16] <= 7.549014329910278) {
                    if (features[48] <= 0.0019484006334096193) {
                        classes[0] = 0;
                        classes[1] = 13;
                    } else {
                        if (features[6] <= 2.277162194252014) {
                            classes[0] = 1;
                            classes[1] = 0;
                        } else {
                            classes[0] = 0;
                            classes[1] = 3;
                        }
                    }
                } else {
                    classes[0] = 2;
                    classes[1] = 0;
                }
            } else {
                classes[0] = 7;
                classes[1] = 0;
            }
        } else {
            if (features[56] <= -0.033136907091829926) {
                classes[0] = 0;
                classes[1] = 1;
            } else {
                classes[0] = 18;
                classes[1] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_3(double[] features) {
        int[] classes = new int[2];

        if (features[0] <= -476.5332946777344) {
            if (features[34] <= 0.014457943383604288) {
                if (features[17] <= -2.0070772767066956) {
                    if (features[26] <= 0.0006218698108568788) {
                        classes[0] = 1;
                        classes[1] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 2;
                    }
                } else {
                    if (features[15] <= -0.6608349680900574) {
                        classes[0] = 0;
                        classes[1] = 1;
                    } else {
                        classes[0] = 18;
                        classes[1] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 3;
            }
        } else {
            if (features[47] <= 0.0010920857021119446) {
                classes[0] = 0;
                classes[1] = 17;
            } else {
                if (features[6] <= 0.513283371925354) {
                    classes[0] = 0;
                    classes[1] = 1;
                } else {
                    classes[0] = 2;
                    classes[1] = 0;
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_4(double[] features) {
        int[] classes = new int[2];

        if (features[48] <= 0.001348483667243272) {
            if (features[4] <= 13.387816429138184) {
                if (features[17] <= 4.594436407089233) {
                    classes[0] = 0;
                    classes[1] = 19;
                } else {
                    if (features[36] <= 0.0006888072821311653) {
                        classes[0] = 3;
                        classes[1] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 1;
                    }
                }
            } else {
                classes[0] = 5;
                classes[1] = 0;
            }
        } else {
            if (features[32] <= -0.0023980480909813195) {
                classes[0] = 0;
                classes[1] = 1;
            } else {
                classes[0] = 16;
                classes[1] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_5(double[] features) {
        int[] classes = new int[2];

        if (features[11] <= -3.3071428537368774) {
            if (features[0] <= -461.64727783203125) {
                if (features[22] <= -0.0021875265520066023) {
                    if (features[52] <= 0.00139361854235176) {
                        classes[0] = 0;
                        classes[1] = 1;
                    } else {
                        classes[0] = 2;
                        classes[1] = 0;
                    }
                } else {
                    classes[0] = 15;
                    classes[1] = 0;
                }
            } else {
                classes[0] = 0;
                classes[1] = 1;
            }
        } else {
            if (features[16] <= 5.9913671016693115) {
                if (features[26] <= -0.014101075765211135) {
                    classes[0] = 1;
                    classes[1] = 0;
                } else {
                    classes[0] = 0;
                    classes[1] = 21;
                }
            } else {
                classes[0] = 4;
                classes[1] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_6(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 16.72602653503418) {
            if (features[31] <= -0.0025029691169038415) {
                classes[0] = 4;
                classes[1] = 0;
            } else {
                if (features[50] <= 0.002481407136656344) {
                    if (features[16] <= 7.6294777393341064) {
                        classes[0] = 0;
                        classes[1] = 17;
                    } else {
                        classes[0] = 1;
                        classes[1] = 0;
                    }
                } else {
                    classes[0] = 2;
                    classes[1] = 0;
                }
            }
        } else {
            if (features[29] <= -0.0005336898757377639) {
                classes[0] = 15;
                classes[1] = 0;
            } else {
                if (features[0] <= -613.9244689941406) {
                    classes[0] = 2;
                    classes[1] = 0;
                } else {
                    classes[0] = 0;
                    classes[1] = 4;
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_7(double[] features) {
        int[] classes = new int[2];

        if (features[61] <= -0.0021477675763890147) {
            classes[0] = 13;
            classes[1] = 0;
        } else {
            if (features[11] <= -10.797738075256348) {
                classes[0] = 5;
                classes[1] = 0;
            } else {
                if (features[51] <= -0.0028186721028760076) {
                    classes[0] = 3;
                    classes[1] = 0;
                } else {
                    if (features[16] <= 6.393033266067505) {
                        if (features[34] <= -0.03985562903108075) {
                            classes[0] = 1;
                            classes[1] = 0;
                        } else {
                            classes[0] = 0;
                            classes[1] = 21;
                        }
                    } else {
                        classes[0] = 2;
                        classes[1] = 0;
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_8(double[] features) {
        int[] classes = new int[2];

        if (features[34] <= -0.0011766036041080952) {
            classes[0] = 16;
            classes[1] = 0;
        } else {
            if (features[12] <= 3.773964047431946) {
                if (features[41] <= 0.00255964370444417) {
                    classes[0] = 0;
                    classes[1] = 19;
                } else {
                    classes[0] = 1;
                    classes[1] = 0;
                }
            } else {
                if (features[53] <= 0.0014754989533685148) {
                    classes[0] = 8;
                    classes[1] = 0;
                } else {
                    classes[0] = 0;
                    classes[1] = 1;
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_9(double[] features) {
        int[] classes = new int[2];

        if (features[19] <= -2.7539398670196533) {
            if (features[61] <= -0.007736463914625347) {
                classes[0] = 1;
                classes[1] = 0;
            } else {
                classes[0] = 0;
                classes[1] = 19;
            }
        } else {
            if (features[52] <= -0.0017423253157176077) {
                if (features[14] <= -1.315427526831627) {
                    classes[0] = 0;
                    classes[1] = 2;
                } else {
                    classes[0] = 1;
                    classes[1] = 0;
                }
            } else {
                if (features[50] <= -0.0016459758044220507) {
                    if (features[33] <= 0.00400506766163744) {
                        classes[0] = 0;
                        classes[1] = 2;
                    } else {
                        classes[0] = 3;
                        classes[1] = 0;
                    }
                } else {
                    if (features[8] <= -3.2269909381866455) {
                        if (features[15] <= 7.182263255119324) {
                            classes[0] = 2;
                            classes[1] = 0;
                        } else {
                            classes[0] = 0;
                            classes[1] = 1;
                        }
                    } else {
                        classes[0] = 14;
                        classes[1] = 0;
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_10(double[] features) {
        int[] classes = new int[2];

        if (features[19] <= -2.772715926170349) {
            if (features[47] <= -0.001300712232477963) {
                if (features[51] <= 8.167482519638725e-05) {
                    classes[0] = 5;
                    classes[1] = 0;
                } else {
                    classes[0] = 0;
                    classes[1] = 1;
                }
            } else {
                classes[0] = 0;
                classes[1] = 14;
            }
        } else {
            if (features[0] <= -475.6393585205078) {
                classes[0] = 18;
                classes[1] = 0;
            } else {
                if (features[37] <= 0.00022550485300598666) {
                    classes[0] = 0;
                    classes[1] = 5;
                } else {
                    classes[0] = 2;
                    classes[1] = 0;
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_11(double[] features) {
        int[] classes = new int[2];

        if (features[14] <= 3.6344375610351562) {
            if (features[46] <= -1.4024364645592868e-05) {
                if (features[63] <= 0.002932284725829959) {
                    classes[0] = 0;
                    classes[1] = 20;
                } else {
                    classes[0] = 1;
                    classes[1] = 0;
                }
            } else {
                if (features[24] <= 0.00020570028573274612) {
                    if (features[41] <= -0.0003944010386476293) {
                        classes[0] = 2;
                        classes[1] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 4;
                    }
                } else {
                    classes[0] = 4;
                    classes[1] = 0;
                }
            }
        } else {
            if (features[63] <= -0.0034850025549530983) {
                classes[0] = 0;
                classes[1] = 2;
            } else {
                classes[0] = 12;
                classes[1] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_12(double[] features) {
        int[] classes = new int[2];

        if (features[27] <= 0.0002604577639431227) {
            if (features[9] <= -6.998100757598877) {
                if (features[48] <= -0.0005423594266176224) {
                    classes[0] = 1;
                    classes[1] = 0;
                } else {
                    classes[0] = 0;
                    classes[1] = 2;
                }
            } else {
                if (features[47] <= 0.013506133574992418) {
                    classes[0] = 15;
                    classes[1] = 0;
                } else {
                    classes[0] = 0;
                    classes[1] = 1;
                }
            }
        } else {
            if (features[29] <= -0.0009260560909751803) {
                if (features[26] <= -0.00014196120901033282) {
                    classes[0] = 0;
                    classes[1] = 5;
                } else {
                    classes[0] = 5;
                    classes[1] = 0;
                }
            } else {
                classes[0] = 0;
                classes[1] = 16;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_13(double[] features) {
        int[] classes = new int[2];

        if (features[4] <= 7.03496789932251) {
            if (features[26] <= 0.001565755344927311) {
                classes[0] = 0;
                classes[1] = 20;
            } else {
                if (features[27] <= -0.00038623805448878556) {
                    classes[0] = 0;
                    classes[1] = 1;
                } else {
                    classes[0] = 6;
                    classes[1] = 0;
                }
            }
        } else {
            if (features[56] <= -0.021511143073439598) {
                classes[0] = 0;
                classes[1] = 2;
            } else {
                classes[0] = 16;
                classes[1] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_14(double[] features) {
        int[] classes = new int[2];

        if (features[41] <= -9.79176602413645e-05) {
            if (features[18] <= -2.2073323726654053) {
                if (features[33] <= -0.000917713507078588) {
                    classes[0] = 0;
                    classes[1] = 3;
                } else {
                    classes[0] = 3;
                    classes[1] = 0;
                }
            } else {
                classes[0] = 15;
                classes[1] = 0;
            }
        } else {
            if (features[59] <= 0.0006136305455584079) {
                classes[0] = 0;
                classes[1] = 22;
            } else {
                classes[0] = 2;
                classes[1] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_15(double[] features) {
        int[] classes = new int[2];

        if (features[15] <= 7.141910076141357) {
            if (features[28] <= 0.0002744522753346246) {
                if (features[43] <= -0.0011690827959682792) {
                    classes[0] = 5;
                    classes[1] = 0;
                } else {
                    if (features[47] <= -0.000676682437187992) {
                        if (features[43] <= 0.0015868734335526824) {
                            classes[0] = 0;
                            classes[1] = 1;
                        } else {
                            classes[0] = 4;
                            classes[1] = 0;
                        }
                    } else {
                        classes[0] = 0;
                        classes[1] = 7;
                    }
                }
            } else {
                if (features[35] <= 0.001690549892373383) {
                    classes[0] = 0;
                    classes[1] = 17;
                } else {
                    if (features[27] <= 0.006114035670179874) {
                        classes[0] = 1;
                        classes[1] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 1;
                    }
                }
            }
        } else {
            classes[0] = 9;
            classes[1] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_16(double[] features) {
        int[] classes = new int[2];

        if (features[0] <= -475.72218322753906) {
            if (features[3] <= -4.303101181983948) {
                classes[0] = 0;
                classes[1] = 2;
            } else {
                if (features[12] <= 3.442455291748047) {
                    if (features[31] <= -0.0015980260795913637) {
                        classes[0] = 0;
                        classes[1] = 3;
                    } else {
                        classes[0] = 1;
                        classes[1] = 0;
                    }
                } else {
                    classes[0] = 19;
                    classes[1] = 0;
                }
            }
        } else {
            if (features[38] <= -0.014459367259405553) {
                classes[0] = 1;
                classes[1] = 0;
            } else {
                classes[0] = 0;
                classes[1] = 19;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_17(double[] features) {
        int[] classes = new int[2];

        if (features[16] <= 2.983965039253235) {
            if (features[36] <= 0.0016053980798460543) {
                if (features[20] <= 0.006235099397599697) {
                    if (features[42] <= -0.00015915230687824078) {
                        classes[0] = 0;
                        classes[1] = 19;
                    } else {
                        if (features[55] <= -2.7474015951156616e-05) {
                            classes[0] = 0;
                            classes[1] = 5;
                        } else {
                            classes[0] = 1;
                            classes[1] = 0;
                        }
                    }
                } else {
                    if (features[16] <= 1.3755743354558945) {
                        classes[0] = 2;
                        classes[1] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 1;
                    }
                }
            } else {
                classes[0] = 4;
                classes[1] = 0;
            }
        } else {
            if (features[17] <= 1.7183446884155273) {
                if (features[0] <= -768.962158203125) {
                    classes[0] = 3;
                    classes[1] = 0;
                } else {
                    classes[0] = 0;
                    classes[1] = 3;
                }
            } else {
                classes[0] = 7;
                classes[1] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_18(double[] features) {
        int[] classes = new int[2];

        if (features[57] <= -0.0012154638534411788) {
            classes[0] = 10;
            classes[1] = 0;
        } else {
            if (features[59] <= -0.00040538739995099604) {
                if (features[16] <= 3.1433260440826416) {
                    classes[0] = 0;
                    classes[1] = 14;
                } else {
                    if (features[30] <= -0.0011729857651516795) {
                        classes[0] = 1;
                        classes[1] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 2;
                    }
                }
            } else {
                if (features[22] <= 3.401702088012826e-05) {
                    if (features[38] <= -0.0013835884165018797) {
                        if (features[11] <= 4.7568163722753525) {
                            classes[0] = 0;
                            classes[1] = 2;
                        } else {
                            classes[0] = 1;
                            classes[1] = 0;
                        }
                    } else {
                        classes[0] = 11;
                        classes[1] = 0;
                    }
                } else {
                    if (features[47] <= -0.002224403666332364) {
                        classes[0] = 1;
                        classes[1] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 3;
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_19(double[] features) {
        int[] classes = new int[2];

        if (features[11] <= -4.377757787704468) {
            if (features[1] <= -10.545260906219482) {
                if (features[63] <= -0.0010426087537780404) {
                    classes[0] = 1;
                    classes[1] = 0;
                } else {
                    classes[0] = 0;
                    classes[1] = 3;
                }
            } else {
                if (features[45] <= -0.00260898465057835) {
                    classes[0] = 0;
                    classes[1] = 1;
                } else {
                    classes[0] = 18;
                    classes[1] = 0;
                }
            }
        } else {
            if (features[40] <= 0.001367085613310337) {
                if (features[26] <= 0.0015713078901171684) {
                    classes[0] = 0;
                    classes[1] = 14;
                } else {
                    classes[0] = 1;
                    classes[1] = 0;
                }
            } else {
                if (features[37] <= 0.002003471920033917) {
                    classes[0] = 6;
                    classes[1] = 0;
                } else {
                    classes[0] = 0;
                    classes[1] = 1;
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict(double[] features) {
        int n_classes = 2;
        int[] classes = new int[n_classes];
        classes[RandomForestClassifier.predict_0(features)]++;
        classes[RandomForestClassifier.predict_1(features)]++;
        classes[RandomForestClassifier.predict_2(features)]++;
        classes[RandomForestClassifier.predict_3(features)]++;
        classes[RandomForestClassifier.predict_4(features)]++;
        classes[RandomForestClassifier.predict_5(features)]++;
        classes[RandomForestClassifier.predict_6(features)]++;
        classes[RandomForestClassifier.predict_7(features)]++;
        classes[RandomForestClassifier.predict_8(features)]++;
        classes[RandomForestClassifier.predict_9(features)]++;
        classes[RandomForestClassifier.predict_10(features)]++;
        classes[RandomForestClassifier.predict_11(features)]++;
        classes[RandomForestClassifier.predict_12(features)]++;
        classes[RandomForestClassifier.predict_13(features)]++;
        classes[RandomForestClassifier.predict_14(features)]++;
        classes[RandomForestClassifier.predict_15(features)]++;
        classes[RandomForestClassifier.predict_16(features)]++;
        classes[RandomForestClassifier.predict_17(features)]++;
        classes[RandomForestClassifier.predict_18(features)]++;
        classes[RandomForestClassifier.predict_19(features)]++;

        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < n_classes; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

}