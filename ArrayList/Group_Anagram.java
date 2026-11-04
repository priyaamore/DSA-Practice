class Solution {
    // Approach = Categorize by Frequency, TC=O(n x k), SC=O(n x k)
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> frequencyStringMap = new HashMap<>();
        for (String str : strs) {
            String frequencyString = getFrequencyString(str);
            frequencyStringMap.putIfAbsent(frequencyString, new ArrayList<>());
            frequencyStringMap.get(frequencyString).add(str);
        }

        return new ArrayList<>(frequencyStringMap.values());
    }

    private String getFrequencyString(String str) {
        int[] freq = new int[26];

        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder frequencyString = new StringBuilder();
        char c = 'a';
        for (int i : freq) {
            frequencyString.append(c);
            frequencyString.append(i);
            c++;
        }

        return frequencyString.toString();
    }
}
