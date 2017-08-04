package questions;
import java.util.ArrayList;

public class Month14_15 extends MonthQuestions {

    private ArrayList<String[]> questionList;
    private ArrayList<int[]> answerList;
    private  ArrayList<Integer> teacherImportantPosition;

    public ArrayList<String[]> getQuestionList(){
        return questionList;
    }
    public ArrayList<int[]> getAnswerList(){
        return answerList;
    }
    public ArrayList<Integer> getTeacherImportantPosition() { return teacherImportantPosition;}

    public boolean isShortMonth(){
        return true;
    }
    private String filename;

    public String getFileName() {
        return filename;
    }
    public Month14_15(String file){
        filename = file;

        answerList = new ArrayList<int[]>();
        answerList.add(new int[]{10,21,23});  // big-muscle
        answerList.add(new int[]{15,18,23});  // small-muscle
        answerList.add(new int[]{13,18,22});  // recognition
        answerList.add(new int[]{8,16,23});   // language
        answerList.add(new int[]{13,18,23});  // social skill
        answerList.add(new int[]{0,0,0});  // self

        teacherImportantPosition = new ArrayList<>();
        // social problem
        teacherImportantPosition.add(32); teacherImportantPosition.add(33); teacherImportantPosition.add(34); teacherImportantPosition.add(35); teacherImportantPosition.add(36); teacherImportantPosition.add(37); teacherImportantPosition.add(38); teacherImportantPosition.add(39);


        questionList = new ArrayList<String[]>();

        questionList.add(new String[]{"" +
                "5초 이상 혼자 서 있는다.",
                "한 손으로 가구를 붙잡고 걷는다.",
                "아무것도 붙잡지 않고 혼자 일어선다.",
                "한 손을 잡아주면 몇 걸음 걷는다 (이미 혼자 잘 걸으면 '잘 할 수 있다'로 표기하세요).",
                "혼자 10 발자국 걷는다",
                "서 있는 자세에서 아무것도 잡지 않고 쪼그려 앉는다.",
                "뒤뚱거리며 달린다 (이미 뒤뚱거리지 않고 자연스럽게 달린다면 '잘 할 수 있다'에 표시한다).",
                "소파나 탁자 위로 기어 올라간다."
        });

        questionList.add(new String[]{
                "손잡이를 사용하여 컵을 잡는다.",
                "잡고 있던 물건을 놓치지 않고 내려놓는다.",
                "장난감 자동차를 잡고 바퀴가 앞으로 굴러가도록 민다.",
                "연필의 윗부분을 잡는다 (이미 연필의 중간부분이나 아랫부분을 잡으면 '잘 할 수 있다'에 표시한다).",
                "연필과 종이를 주면 선을 이리 저리 그리며 낙서를 한다.",
                "블록을 2개 쌓는다.",
                "책의 낱장(페이지)을 넘긴다 (한 번에 한장이상을 넘겨도 된다).",
                "컵에 건포도와 같은 작은 물건을 넣는 것을 보여주면 따라서 넣는다."
        });

        questionList.add(new String[]{
                "상자 안에서 물건을 꺼낸다.",
                "어른이 아이가 내는 소리를 따라하면, 아이가 다시 그 소리를 따라한다.",
                "장난감에 있는 버튼을 눌러 소리가 나게 한다.",
                "자신이 좋아하는 한 개의 장난감을 가지고 3-4분 정도 논다.",
                "아이가 보는 앞에서 작은 장난감을 컵으로 덮으면 컵을 열어 장난감을 찾는다.",
                "다른 사람의 역할을 흉내 낸다 (엄마처럼 인형에게 칭찬하거나 야단을 친다)",
                "동그라미, 네모, 세모와 같은 간단한 도형 맞추기 판에 1 조각을 맞춘다.",
                "아이에게 요구를 하면 다른 방에서 물건을 가져온다(예: 옆방에서 기저귀를 가져오라고 시키면 기저귀를 가져온다)."
        });

        questionList.add(new String[]{
                "동작을 보여주지 않고 말로만 '주세요', '오세요', '가자', '밥먹자'를 말하면, 2가지 이상의 뜻을 이해한다.",
                "좋다(예), 싫다(아니오)를 몸이나 고개를 흔들어 표현한다.",
                "'엄마', '아빠' 외에 말할 줄 아는 단어가 하나 더 있다 (예:'무(물)', '우(우유)'처럼 평소 아이가 일정하게 의미를 두고 하는 말).",
                "엄마에게 '엄마', 아빠에게 '아빠'라고 구분하여 말한다.",
                "보이는 곳에 공을 두고 '공이 어디 있어요?'하고 물어보면 공이 있는 방향을 쳐다본다.",
                "'아니'와 같이 싫다는 뜻을 가진 말의 의미를 알고 사용한다.",
                "아이에게 익숙한 물건 (전화기, 자동차, 책등)을 그림에서 찾으라고 하면 손으로 가리킨다.",
                "'야옹이는 어디 있어요?', '멍멍이는 어디 있어요?'라고 물었을 때, 그림이나 사진을 정확하게 가리킨다."
        });

        questionList.add(new String[]{
                "어른을 따라서 '빠이빠이'하면서 손을 흔든다.",
                "어른의 관심을 끌기위한 행동을 한다 (예: 어른이 못본 척 하면 '예쁜 짓'을 한다.)",
                "아이에게 손을 내밀어 장난감을 달라고하면 장난감을 주려고 한다.",
                "다른 사람에게 어떤 행동이나 물건을 보여주고 싶을 때, 그 사람을 끌어당긴다.",
                "어른의 도움이 필요할 때 도움을 요청한다.",
                "어른에게 책을 읽어 달라고 책을 건넨다.",
                "어른이 시키면 친숙한 어른들에게 인사를 한다.",
                "바닥 닦기, 전화 받기, 머리 빗기와 같은 어른의 행동을 따라한다"
        });

        questionList.add(new String[]{"없음",
                "없음",
                "없음",
                "없음",
                "없음",
                "없음",
                "없음",
                "없음"
        });

        questionList.add(new String[]{
                "서거나 걸을 때 항상 까치발을 한다."
        });


		 /*

		 for(int i=0; i<questionList.size(); i++){
			 for(int j =0 ; j<questionList.get(i).length ; j++)
			 {
	           System.out.print(questionList.get(i)[j] + "\t");
			 }
			 System.out.println("\n");
		 }
		 */


    }


}
