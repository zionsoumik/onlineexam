package master.DTO;

public class useranswerDTO {

static int[] questionno;
static String[] answerno;
String username;
int paperno;


public int getQuestionno(int n) {
	try{}catch(NullPointerException ne)
	{
		ne.printStackTrace();
	}
	return questionno[n];
	
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public int getPaperno() {
	return paperno;
}
public void setPaperno(int paperno) {
	this.paperno = paperno;
}
public void setQuestionno(int[] questionno) {
	try{}catch(NullPointerException ne)
	{
		ne.printStackTrace();
	}useranswerDTO.questionno = questionno;
}
public String getAnswerno(int n) {
	try{}catch(NullPointerException ne)
	{
		ne.printStackTrace();
	}return answerno[n];
}
public void setAnswerno(String[] answerno) {
	try{
		
	}catch(NullPointerException ne)
	{
		ne.printStackTrace();
	}
	useranswerDTO.answerno = answerno;
}


}
