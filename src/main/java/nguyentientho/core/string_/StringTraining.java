package nguyentientho.core.string_;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class StringTraining {
    
    public static void main(String[] args) throws Exception {
         randomString();
         stringHandler();
        stringCompare();
    }

    protected static void randomString() throws NoSuchAlgorithmException {
        String[] wordListOne = {"24/7", "multi-Tier","30,OOO foot", "B-to-B" ,"win-win" , "front-end" ,
                "web-based" , "pervasive", "smart", "six-sigma", "critical-path" , "dynamic"};

        String[] wordListTwo = {"empowered", "sticky", "value-added.", "oriented", "centric", "distributed",
                "clustered", "branded", "outaide-the-box", "ositioned", "networked", "f ocused", "leveraged",
                "aligned", "targeted", "shared", "cooperative", "accelerated"};

        String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency" ,
                "strategy", "mindshare", "portal" , "apace", "vision", "adigm", "ssion"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        Random random = SecureRandom.getInstanceStrong();

        int ran1 = random.nextInt(oneLength);
        int ran2 = random.nextInt(twoLength);
        int ran3 = random.nextInt(threeLength);

        String phrases = wordListOne[ran1] + " " + wordListTwo[ran2] + " " + wordListThree[ran3];

        System.out.println("Cum tu chung ta can la == " + phrases);
    }

    protected static void stringHandler() {
        String s1 = "abcdefgh";
        System.out.println("in ra ký hiệu ASCII tại ký tự ở index = " + s1.codePointAt(2));
        System.out.println("khoảng cách ký tự ASCII từ  = " + s1.codePointCount(2, 5));
    }

    private static void stringCompare() {
        String s = "AC";
        String s2 = "E";
        System.out.println(Integer.toHexString(s.charAt(0)));
        System.out.println(Integer.toHexString(s.charAt(1)));
        System.out.println(s.compareTo("E"));
        System.out.println(Integer.toHexString(s2.charAt(0)));
        System.out.println(s.compareToIgnoreCase("ac"));

        
    }
}

