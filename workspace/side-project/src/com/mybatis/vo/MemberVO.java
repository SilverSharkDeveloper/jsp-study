package com.mybatis.vo;

public class MemberVO {
	private Long id;
	private String memberId;
	private String memberPassword;
	
	public MemberVO() {;}

	public MemberVO(Long id, String memberId, String memberPassword) {
		super();
		this.id = id;
		this.memberId = memberId;
		this.memberPassword = memberPassword;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMemberName() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberVO other = (MemberVO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", memberId=" + memberId + ", memberPassword=" + memberPassword + "]";
	}
	
	
	
	
	
}
