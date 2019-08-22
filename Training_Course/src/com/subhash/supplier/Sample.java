package com.subhash.supplier;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

class Sample {
	    public int[] deckRevealedIncreasing(int[] deck) {
	        int N = deck.length;
	        Deque<Integer> index = new LinkedList();
	        for (int i = 0; i < N; ++i)
	            index.add(i);

	        int[] ans = new int[N];
	        Arrays.sort(deck);
	        for (int card: deck) {
	            ans[index.pollFirst()] = card;
	            if (!index.isEmpty())
	                index.add(index.pollFirst());
	        }

	        return ans;
	    }
	}

// Time Cpmplexity: O(Nlogn)