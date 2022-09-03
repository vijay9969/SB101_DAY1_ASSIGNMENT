package day1.Q3;

import java.time.LocalDate;
import java.time.Period;


public class Members implements Comparable<Members>{
	
	private int memberId;
	private String memberName;
	private int membershipNo;
	private LocalDate membershipEnddate;
	
	
	public Members(int id, String name, int memberdhipNO, LocalDate membershipEnddate2) {
		// TODO Auto-generated constructor stub
		

		this.setMemberId(id);
		this.setMemberName(name);
		this.setMembershipNo(memberdhipNO);
		this.setMembershipEnddate(membershipEnddate2);
	}
	
	
	
	public Members() {
	// TODO Auto-generated constructor stub
	}



	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getMembershipNo() {
		return membershipNo;
	}
	public void setMembershipNo(int membershipNo) {
		this.membershipNo = membershipNo;
	}
	public LocalDate getMembershipEnddate() {
		return membershipEnddate;
	}
	public void setMembershipEnddate(LocalDate membershipEnddate) {
		this.membershipEnddate = membershipEnddate;
	}



	@Override
	public String toString() {
		return "Members [memberId=" + memberId + ", memberName=" + memberName + ", membershipNo=" + membershipNo
				+ ", membershipEnddate=" + membershipEnddate + "]";
	}



	@Override
	public int compareTo(Members o) {
		// TODO Auto-generated method stub
		int i1 = o.getMemberId();
		int n1 = o.getMembershipNo();
		int i2 = this.getMemberId();
		int n2 = this.getMembershipNo();
		
		if(i1==i2) {
			return 0;
		}
		if(n1==n2) {
			return 0;
		}
		LocalDate d1 = o.getMembershipEnddate();
		LocalDate d2 = this.getMembershipEnddate();
		LocalDate cdate = LocalDate.now();
		Period diff1 = Period.between(cdate, d1);
		Period diff2 = Period.between(cdate, d2);
		int D1 = diff1.getDays();
		int D2 = diff2.getDays();
		if(D1>D2) {
			return +1;
		}else if(D1<D2) {
			return -1;
		}
		
		return 0;
		
		
	}

	
	

}
