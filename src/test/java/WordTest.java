import java.util.ArrayList;

import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {
  @After
  public void tearDown() {
    Word.clear();
    // Definition.clear();
  }

@Test
public void name_instantiatesCorrectly_true() {
  Word testWord = new Word("nuqneH");
  assertEquals(true, testWord instanceof Word);
}

@Test
public void getWord_instantiatesWithWord_nuqneH(){
  Word testWords = new Word("nuqneH");
  assertEquals("nuqneH", testWords.getWord());
}

@Test
public void getId_wordsInstantiateWithAnID_1() {
  Word.clear();
  Word myWord = new Word("nuqneH");
  assertEquals(0, myWord.getId());
}

@Test
public void getWords_allWordsinArray_array(){
  Word firstWord = new Word("nuqneH");
  Word secondWord = new Word("majQa'");
assertTrue(Word.getWords().contains(firstWord));
assertTrue(Word.getWords().contains(secondWord));
}

@Test
public void getWords_returnsEmptyArray(){
  Word testWord = new Word("nuqneH");
  assertTrue(testWord.getWords() instanceof ArrayList);
}

@Test
public void clear_actuallyClears(){
  Word testWord = new Word("nuqneH");
  Word.clear();
  assertEquals(Word.getWords().size(), 0);
}
@Test
public void find_returnsWordwithId(){
  Word testWord = new Word("nuqneH");
  assertEquals(Word.find(testWord.getId()), testWord);
}
//   public void find_returnsCategoryWithSameId() {
//     Category testCategory = new Category("Home");
//     assertEquals(Category.find(testCategory.getId()), testCategory);
//   }
//
//   @Test
//   public void addTask_addsTaskToList() {
//     Category testCategory = new Category("Bob's Used Tasks");
//     Task testTask = new Task("Mow the lawn");
//     testCategory.addTask(testTask);
//     assertTrue(testCategory.getTasks().contains(testTask));
//   }
}
