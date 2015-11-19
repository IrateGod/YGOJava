import org.apache.commons.lang3.ArrayUtils;

class Pile
{
    public static int[] _deck;
    
    public Pile(int[] deck)
    {
        int i;
        int j;
        int k;
        int deckLength = deck.length;
        int minHeaps = deckLength % 5;
        double result = deckLength / 5;
        int heaps = (int) Math.floor(result);
        if (minHeaps > heaps)
        {
            heaps = minHeaps;
            minHeaps = heaps;
        }
        int[][] heapArray = new int[heaps][];
        for (j = 0; j < heaps; j++)
        {
            heapArray[j] = new int[heaps + 1];
        }
        for (i = 0; i < deckLength; /* empty */)
        {
            heapArray[(i + 1) % minHeaps][(int) Math.ceil(i / 5)] = deck[i++];
        }
        for (k = 0; k < heaps; k++)
        {
            _deck = ArrayUtils.addAll(_deck, heapArray[k]);
        }
    }
}