package Test;

public class Author 
{
		private String name;
		private String emailid;
		private char gender;
		
		public Author(String name,String emailid,char gender)
		{
			this.name=name;
			this.emailid=emailid;
			this.gender=gender;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmailid() {
			return emailid;
		}

		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}

		public char getGender() {
			return gender;
		}

		public void setGender(char gender) {
			this.gender = gender;
		}
		
}