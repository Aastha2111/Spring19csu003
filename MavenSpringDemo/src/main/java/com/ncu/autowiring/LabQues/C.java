package com.ncu.autowiring.LabQues;

public class C {
		private String Cname;
		private String Clastname;
		public String getCname() {
			return Cname;
		}
		public void setCname(String cname) {
			Cname = cname;
		}
		public String getClastname() {
			return Clastname;
		}
		public void setClastname(String clastname) {
			Clastname = clastname;
		}
		@Override
		public String toString() {
			return "C [Cname=" + Cname + ", Clastname=" + Clastname + "]";
		}

		
		
		
			 
}
