// MainUTF.java
import java.util.*;

public class MainUTF {
    static class Dua {
        String mood, arabic, english, urdu, reference;

        public Dua(String String mood, String arabic, String english, String urdu, String reference) {
            this.mood = mood;
            this.arabic = arabic;
            this.english = english;
            this.urdu = urdu;
            this.reference = reference;
        }

        public void display() {
            System.out.println("Mood: " + mood);
            System.out.println("Arabic: " + arabic);
            System.out.println("English: " + english);
            System.out.println("Urdu: " + urdu);
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
            "O Allah, heal my brokenness.",
            "اے اللہ! میرے ٹوٹے دل کو جوڑ دے۔",
            "Valid dua used by Salaf (Not a direct hadith)"));

        list.add(new Dua("anxious",
            "اللَّهُمَّ إِنِّي أَعُوذُ بِكَ مِنَ الْهَمِّ وَالْحَزَنِ",
            "O Allah, I seek refuge in You from anxiety and grief.",
            "اے اللہ! میں فکروں اور غم سے تیری پناہ مانگتا ہوں۔",
            "Sahih al-Bukhari 6369, Sahih Muslim 2707"));

        list.add(new Dua("happy",
            "الْـحَمْـدُ لِلَّهِ عَلَى كُلِّ حَالٍ",
            "All praise is due to Allah in every condition.",
            "ہر حال میں اللہ کا شکر ہے۔",
            "Sunan Ibn Majah 3803"));

        list.add(new Dua("thankful",
            "اللَّهُمَّ لَكَ الْـحَمْدُ كَمَا يَنْبَغِي لِجَلالِ وَجْهِكَ",
            "O Allah, to You is all praise, as befits the majesty of Your Face.",
            "اے اللہ! تیرا شکر ہے جیسا تیرے جلال کے شایانِ شان ہے۔",
            "Sunan Ibn Majah 3801"));

        list.add(new Dua("fear",
            "اللَّهُمَّ اكْفِنِيْهِمْ بِمَا شِئْتَ",
            "O Allah, protect me from them as You will.",
            "اے اللہ! جیسے تو چاہے مجھے ان سے بچا لے۔",
            "Sahih Muslim 6751"));
        return list;
    }
}