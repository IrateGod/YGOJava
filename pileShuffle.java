class pileShuffle
{
    public static void main(String[] args)
    {
        int deckLength = 40;
        int i;
        int[] deck = new int[40];
        for (i = 0; i < deckLength; i++)
        {
            deck[i] = i;
        }
        Pile pile = new Pile(deck);
        for (i = 0; i < deckLength; i++)
        {
            System.out.println(pile._deck[i]);
        }
    }
}
