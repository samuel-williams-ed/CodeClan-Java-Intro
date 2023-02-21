
public class WordCollectionTest {

    private WordCollection hawtWords;

    @Before
    public void before(){
        hawtWords = new WordCollectionTest();
    }

    @Test
    public void hasFiveWords(){
        assertEquals(5, hawtWords.wordCount())
    }

}