package com.example.android.kidslearn;

public class MyList  {

    private int mAlphabetImageID;
    private int mWordImageID;
    private int mWordAudioID;
    private int mNumberImageID;
    private int mNumberAudioID;
    private int mPhraseAudioID;
    private String mPhrase;

    public MyList(int AlphabetImageID, int WordImageID , int WordAudioID )
    {
        mAlphabetImageID=AlphabetImageID;
        mWordImageID=WordImageID;
        mWordAudioID=WordAudioID;
    }


    public MyList(int NumberImageID,int NumberAudioID )
    {
        mNumberImageID=NumberImageID;
        mNumberAudioID=NumberAudioID;
    }

    public MyList(String Phrase,int PhraseAudioID) {
        this.mPhrase = Phrase;
        this.mPhraseAudioID = PhraseAudioID;
    }

    public int getAlphabetImageID()
    {
        return mAlphabetImageID;
    }

    public int getWordImageID()
    {
        return mWordImageID;
    }

    public int getWordAudioID()
    {
        return mWordAudioID;
    }

    public int getNumberImageID()
    {
        return mNumberImageID;
    }

    public int getNumberAudioID()
    {
        return mNumberAudioID;
    }

    public String getPhrase() {
        return mPhrase;
    }

    public int getPhraseAudioID() {
        return mPhraseAudioID;
    }
}
