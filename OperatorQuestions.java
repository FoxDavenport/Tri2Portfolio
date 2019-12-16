package AP_Exam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
	/**
	 * 
	 * A random integer is chosen from 0 to 4 and based on the number, 
	 * a different question is asked. The answer choices are all stored 
	 * in an a String array, which is then converted to a List. 
	 * For each case, the list containing the answer choices are randomized 
	 * with the Collections.shuffle() method and assigned to a char (A,B,C,D,E). 
	 * The randomized array is then input into the AnswerChoiceIndex.returnIndex() 
	 * method along with the correct answer to find the index of the correct answer 
	 * in the randomized array. The returned index is then input into the AnswerChoiceIndex.returnAns() 
	 * method to find the char of the correct answer choice. this.answerKey 
	 * is then set to the output of returnAns() and the correct letter is displayed as the answer.
	 * @author Daniel and Fox
	 * @see AnswerChoiceIndex
	 */
public class OperatorQuestions extends Question{
	public OperatorQuestions()
    {
    	setupQuestionData();
    	setupQuestion();
    }
	
	
	public void setupQuestionData() {
		AnswerChoiceIndex indexClass = new AnswerChoiceIndex();
		Random rand = new Random();
		String[] array = new String[]{"logical AND short circuit", "logical OR short circuit", "boolean logical AND", "boolean logical OR", "None of them"};
		List<String> randArr = Arrays.asList(array);
		int randomQuestion = rand.nextInt(5);
		switch(randomQuestion){
		case 0:
			this.question = "What does && stand for?";
			Collections.shuffle(randArr);
			this.choiceA = randArr.get(0);
			this.choiceB = randArr.get(1);
			this.choiceC = randArr.get(2);
			this.choiceD = randArr.get(3);
			this.choiceE = randArr.get(4);
			
			int Index0 = indexClass.returnIndex(randArr, "logical AND short circuit");
			char Ans0 = indexClass.returnAns(Index0);
			
			this.answerKey = Ans0;
			this.answer = "logical AND short circuit";
			break;
		case 1:
			this.question = "What does || stand for?";
			
			Collections.shuffle(randArr);
			this.choiceA = randArr.get(0);
			this.choiceB = randArr.get(1);
			this.choiceC = randArr.get(2);
			this.choiceD = randArr.get(3);
			this.choiceE = randArr.get(4);
			
			int Index1 = indexClass.returnIndex(randArr, "logical OR short circuit");
			char Ans1 = indexClass.returnAns(Index1);
			
			this.answerKey = Ans1;
			this.answer = "logical OR short circuit";
			break;
		case 2:
			this.question = "What does & stand for?";
			
			Collections.shuffle(randArr);
			this.choiceA = randArr.get(0);
			this.choiceB = randArr.get(1);
			this.choiceC = randArr.get(2);
			this.choiceD = randArr.get(3);
			this.choiceE = randArr.get(4);
			
			int Index2 = indexClass.returnIndex(randArr, "boolean logical AND");
			char Ans2 = indexClass.returnAns(Index2);
			
			this.answerKey = Ans2;
			this.answer = "boolean logical AND";
			break;
			
		case 3:
			this.question = "What does | stand for?";
			
			Collections.shuffle(randArr);
			this.choiceA = randArr.get(0);
			this.choiceB = randArr.get(1);
			this.choiceC = randArr.get(2);
			this.choiceD = randArr.get(3);
			this.choiceE = randArr.get(4);
			
			int Index3 = indexClass.returnIndex(randArr, "boolean logical OR");
			char Ans3 = indexClass.returnAns(Index3);
			
			this.answerKey = Ans3;
			this.answer = "boolean logical OR";
			break;
		case 4:
			this.question = "What does ^ stand for?";
			
			Collections.shuffle(randArr);
			this.choiceA = randArr.get(0);
			this.choiceB = randArr.get(1);
			this.choiceC = randArr.get(2);
			this.choiceD = randArr.get(3);
			this.choiceE = randArr.get(4);
			
			int Index4 = indexClass.returnIndex(randArr, "None of them");
			char Ans4 = indexClass.returnAns(Index4);
			
			this.answerKey = Ans4;
			this.answer = "boolean logical OR";
			break;
		}
	}
}
