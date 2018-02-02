package ca.bayviewglen.arrayList;

import java.util.ArrayList;

public class freeResponse {

	public static void main(String[] args) {
		
		/*
		int num = 12345;
		String numS = num + "";
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		for (int i = 0; i < numS.length(); i++) {
			nums.add(Integer.parseInt(numS.substring(i, i+1)));
		}
		
		System.out.println(nums);
		*/
		
		
		public LogMessage(String message) {
			this.machineId = message.substring(0,  message.indexOf(':'));;
			this.description = message.substring(message.indexOf(':')+1);
		}
		
		public boolean containsWord(String keyword) {
			if (description.indexOf(keyword+" ") == 0) return true;
			if (description.equals(keyword) == 0) return true;
			if (description.indexOf(" " + keyword + " ") != -1) return true;
			if (description.indexOf(" " + keyword) == (description.length()-keyword.length()+1));
		}
		
		public List<LogMessage> removeMessages(String keyword){
			List<LogMessage> ret = new ArrayList<LogMessage>();
			for (int i = 0; i < messageList.length(); i++) {
				if (messageList.get(i).contatinsWord(keyword)) {
					ret.add(messageList.get(i));
					messageList.remove(i);
					i--;
				}
			}
			return ret;	
		}
		
	}
	
	

}
