import java.util.*;

public class MainRoman {
    static class Dua {
        String mood, arabic, arabicRoman, english, romanUrdu, reference;

        public Dua(String mood, String arabic, String arabicRoman, String english, String romanUrdu, String reference) {
            this.mood = mood;
            this.arabic = arabic;
            this.arabicRoman = arabicRoman;
            this.english = english;
            this.romanUrdu = romanUrdu;
            this.reference = reference;
        }

        public void display() {
            System.out.println("Mood: " + mood);
            System.out.println("Arabic: " + arabic);
            System.out.println("Arabic (Roman): " + arabicRoman);
            System.out.println("English: " + english);
            System.out.println("Roman Urdu: " + romanUrdu);
            System.out.println("Reference: " + reference);
            System.out.println("------");
        }
    }

    public static void main(String[] args) {
        List<Dua> duas = getDuas();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mood (sad, anxious, happy, thankful, fear): ");
        String mood = sc.nextLine().trim().toLowerCase();

        for (Dua dua : duas) {
            if (dua.mood.equals(mood)) {
                dua.display();
            }
        }
    }

    static List<Dua> getDuas() {
        List<Dua> list = new ArrayList<>();

        list.add(new Dua("sad",
            "اللَّهُمَّ اجْبُرْ كَسْرِي",
            "Allahumma ajbur kasri",
            "O Allah, heal my brokenness.",
            "Ae Allah! Mere toote dil ko jor de.",
            "Valid dua used by Salaf (Not a direct hadith)"));

        list.add(new Dua("anxious",
            "اللَّهُمَّ إِنِّي أَعُوذُ بِكَ مِنَ الْهَمِّ وَالْحَزَنِ",
            "Allahumma inni a'udhu bika minal hammi wal hazan",
            "O Allah, I seek refuge in You from anxiety and grief.",
            "Ae Allah! Main fikar aur gham se teri panaah chahta hoon.",
            "Sahih al-Bukhari 6369, Sahih Muslim 2707"));

        list.add(new Dua("happy",
            "الْـحَمْـدُ لِلَّهِ عَلَى كُلِّ حَالٍ",
            "Alhamdu lillahi 'ala kulli hal",
            "All praise is due to Allah in every condition.",
            "Har haal mein Allah ka shukar hai.",
            "Sunan Ibn Majah 3803"));

        list.add(new Dua("thankful",
            "اللَّهُمَّ لَكَ الْـحَمْدُ كَمَا يَنْبَغِي لِجَلالِ وَجْهِكَ",
            "Allahumma laka alhamdu kama yanbaghi li jalali wajhika",
            "O Allah, to You is all praise, as befits the majesty of Your Face.",
            "Ae Allah! Tera shukar hai jaisa teray jalal ke shayan-e-shaan hai.",
            "Sunan Ibn Majah 3801"));

        list.add(new Dua("fear",
            "اللَّهُمَّ اكْفِنِيْهِمْ بِمَا شِئْتَ",
            "Allahumma ikfinihim bima shi'ta",
            "O Allah, protect me from them as You will.",
            "Ae Allah! Jaise tu chahe mujhe un se bacha le.",
            "Sahih Muslim 6751"));

        return list;
    }
}
