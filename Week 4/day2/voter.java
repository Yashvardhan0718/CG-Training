package week4.day2.level3;

import java.util.*;

public class voter {

    static class VoteManager {
        private Map<String, Integer> voteMap = new HashMap<>();
        private LinkedHashMap<String, Integer> voteSequence = new LinkedHashMap<>();

        public void castVote(String candidate) {
            voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
            voteSequence.put(candidate, voteMap.get(candidate));
        }

        public void displayUnorderedResults() {
            System.out.println("Vote Count (Unordered - HashMap):");
            for (Map.Entry<String, Integer> entry : voteMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

        public void displayVoteSequence() {
            System.out.println("Vote Sequence (LinkedHashMap):");
            for (Map.Entry<String, Integer> entry : voteSequence.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

        public void displaySortedResults() {
            System.out.println("Sorted Results (TreeMap):");
            TreeMap<String, Integer> sorted = new TreeMap<>(voteMap);
            for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        VoteManager system = new VoteManager();

        system.castVote("Alice");
        system.castVote("Bob");
        system.castVote("Alice");
        system.castVote("Charlie");
        system.castVote("Bob");
        system.castVote("Bob");

        system.displayUnorderedResults();
        System.out.println();
        system.displayVoteSequence();
        System.out.println();
        system.displaySortedResults();
    }
}
