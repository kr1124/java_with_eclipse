package com.vscore;

public class ScoreVO {//Value Object
	private String code, name, birth;
	private int kor, eng, mat, total;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		total = kor + eng + mat;
		this.total = total;
	}
	
	
	@Override
	public String toString() {
		String str = String.format("%7s%10s%5d%5d%5d%5d%6.1", code, name, kor, eng, mat, getTotal(), getTotal() / 3.0f);
		return str;
	}
}
