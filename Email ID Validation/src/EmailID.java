public class EmailID {
	// Let initiate a bunch of 10 email ID's.
	String[] emailIDs = {"ab@ab", "cd@cd", "ef@ef", "gh@gh", "ij@ij",
			"kl@kl", "mn@mn", "op@op", "qr@qr", "st@st"};
	
	// String method for Validating email ID, which returns 
	// 'Success' or 'Invalid email ID'.
	String isValid(String a) {
		for (String id: emailIDs) // for-each loop.
			if (id.equals(a)) // equals() method returns boolean value.
				return "Congratulations, Success...";
		return "Sorry, Invalid email ID...";
	}
}
