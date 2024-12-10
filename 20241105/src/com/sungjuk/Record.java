package com.sungjuk;

public class Record {
	 String name;
	 int kor;
	 int eng;
	 int mat;
	 int total;
	 double avg;
	 int rank;
	 
	 Record() {
		 
	 }
	 
	 public void setName(String name) {
		this.name = name;
	 }
	 public void setKor(int kor) {
		this.kor = kor;
	 }
	 public void setEng(int eng) {
		this.eng = eng;
	 }
	 public void setMat(int mat) {
		this.mat = mat;
	 }
	 public void setTotal(int total) {
		this.total = total;
	 } 
	 public void setAvg(double avg) {
		this.avg = avg;
	 }
	 public void setRank(int rank) {
		this.rank = rank;
	 }
	 
	 public int updateTotal() {
		 this.total = this.kor + this.eng + this.mat;
		 return total;
	 }
	 public double updateAvg() {
		 this.avg = total / 3.0;
		 return this.avg;
	 }
	 
	 
	 public String getName() {
		return name;
	 }
	 public int getKor() {
		return kor;
	 }
	 public int getEng() {
		return eng;
	 }
	 public int getMat() {
		return mat;
	 }
	 public int getTotal() {
		return total;
	 }
	 public double getAvg() {
		return avg;
	 }
	 public int getRank() {
		return rank;
	 }
	 
}