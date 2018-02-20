import java.util.*;
public class Collection {

	public List<String> myTeam() {
		// TODO Auto-generated method stub
		List <String> myTeam = new ArrayList<>();
		myTeam.add("sasank");
		myTeam.add("venkatesh");
		myTeam.add("mathew");
		myTeam.add("thol");
		return myTeam;
	}
	public Map<String, String> myTeam2(){
		Map<String, String> myTeam2 =new HashMap<>();
		myTeam2.put("s","sasank" );
		myTeam2.put("v", "venkatesh");
		myTeam2.put("m", "mathew");
		myTeam2.put("t", "thol");
		return myTeam2;
	}
}